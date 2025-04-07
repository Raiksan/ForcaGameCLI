import java.util.Scanner;    // Importa a classe Scanner para capturar entradas do usuário

public class Menu {
    Player p1 = new Player(); // Cria um objeto Player para controlar o estado do jogador (vidas)

    final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    final String RED_BOLD_BRIGHT = "\033[1;91m";
    final String RESET = "\033[0m";


    // Construtor da classe Menu (não faz nada nesse caso)
    public Menu() {
    }

    // Função para exibir o título do jogo usando caracteres ASCII
    void printTitle() {
        String var1 = WHITE_BOLD_BRIGHT + """
    ███████╗ ██████╗ ██████╗  ██████╗ █████╗      ██████╗  █████╗ ███╗   ███╗███████╗
    ██╔════╝██╔═══██╗██╔══██╗██╔════╝██╔══██╗    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝
    █████╗  ██║   ██║██████╔╝██║     ███████║    ██║  ███╗███████║██╔████╔██║█████╗  
    ██╔══╝  ██║   ██║██╔══██╗██║     ██╔══██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  
    ██║     ╚██████╔╝██║  ██║╚██████╗██║  ██║    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
    ╚═╝      ╚═════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝
    """ + RESET;
        System.out.println(var1);  // Exibe o título estilizado
    }

    // Função que apresenta as opções do jogo e lida com as escolhas do jogador
    void options(Scanner var1, Randomizer var2, Palavra var3) {
        int var4;  // Variável para armazenar a escolha do jogador

        do {
            System.out.println("Insira entre as opções abaixo.");
            System.out.println(GREEN_BOLD_BRIGHT +
                    " \n" +
                    " _      __                         \n" +
                    "/ |     \\ \\  ___   __ _  __ _ _ __ \n" +
                    "| |      \\ \\/ _ \\ / _` |/ _` | '__|\n" +
                    "| |_  /\\_/ / (_) | (_| | (_| | |   \n" +
                    "|_(_) \\___/ \\___/ \\__, |\\__,_|_|   \n" +
                    "                  |___/            \n" + RED_BOLD_BRIGHT+
                    "  ___       _____       _      \n" +
                    " |__ \\     / ____|     (_)     \n" +
                    "    ) |   | (___   __ _ _ _ __ \n" +
                    "   / /     \\___ \\ / _` | | '__|\n" +
                    "  / /_ _   ____) | (_| | | |   \n" +
                    " |____(_) |_____/ \\__,_|_|_|   \n" +
                    "                               \n" +
                    "                               " + RESET);  // Opções disponíveis para o jogador
            System.out.println("Sua opção:");
            var4 = var1.nextInt();  // Lê a escolha do jogador.

            // Lógica de decisão baseada na opção escolhida
            switch (var4) {
                case 1:  // Caso o jogador escolha jogar
                    this.initGame(var1, var3);  // Inicia o jogo
                    var3 = new Palavra(var2.pegarPalavraAleatoria());  // Gera uma nova palavra aleatória
                    break;
                case 2:  // Caso o jogador escolha sair
                    System.out.println("Saindo...");
                    return;  // Encerra o metodo e sai
                default:  // Caso o jogador insira uma opção inválida
                    System.out.println("Opção invalida");
            }
        } while (var4 != 0);  // O laço continua até o jogador escolher uma opção válida
    }

    // Função que inicia o jogo, controlando o fluxo do jogo e a interação com o jogador
    void initGame(Scanner scanner, Palavra palavra) {
        this.p1 = new Player();  // Reinicia o jogador
        char[] letrasTentadas = new char[26];  // Suporta até 26 letras diferentes
        int tentativas = 0;  // Conta quantas letras já foram tentadas

        do {
            this.p1.printLifeStatus();  // Mostra status de vida
            palavra.printValidCarac();  // Mostra palavra com letras ocultas

            // Mostrar letras já tentadas
            System.out.print("Letras tentadas: ");
            for (int i = 0; i < tentativas; i++) {
                System.out.print(letrasTentadas[i] + " ");
            }
            System.out.println();

            // Captura a letra
            System.out.println("Insira um caractere: ");
            String scannerInput = scanner.next().toLowerCase();
            char letra = scannerInput.charAt(0);

            // Verifica se já foi tentada
            boolean jaTentada = false;
            for (int i = 0; i < tentativas; i++) {
                if (letrasTentadas[i] == letra) {
                    jaTentada = true;
                    break;
                }
            }

            if (jaTentada) {
                System.out.println("Você já tentou essa letra! Tente outra.");
                continue;
            }

            // Adiciona letra na lista
            letrasTentadas[tentativas] = letra;
            tentativas++;

            // Verifica acerto
            if (palavra.verificarCarac(letra) < 0) {
                this.p1.Vida--;
            }

            if (palavra.palavraCompleta()) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavra.palavra);
                return;
            }

        } while (this.p1.Vida != 0);

        // Derrota
        System.out.println("Você perdeu todas as suas vidas! A palavra era: " + palavra.palavra);
        System.out.println("""
            ⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⡀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⡿⠿⠿⠿⠿⢿⣿⣧⠈⢿⣿⣿⡄⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣤⣤⣤⣤⣤⣼⣿⣿⣧⠈⢿⣿⣿⡄⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣦⣤⣤⣤⣤⣼⣿⣿⣿⡇⢈⣉⣉⣉⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢸⣿⣿⡏⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⣿⣿⣿⠃⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢰⣿⣿⡟⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣼⣿⣿⠇⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢀⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⠃⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡿⠀⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠛⠀⠘⠛⠛""");
    }
}
