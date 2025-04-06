import java.util.ArrayList;  // Importa a classe ArrayList para usar listas dinâmicas
import java.util.Scanner;    // Importa a classe Scanner para capturar entradas do usuário

public class Menu {
    Player p1 = new Player(); // Cria um objeto Player para controlar o estado do jogador (vidas)

    final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String RESET = "\033[0m";


    // Construtor da classe Menu (não faz nada nesse caso)
    public Menu() {
    }

    // Função para exibir o título do jogo usando caracteres ASCII
    void printTitle() {
        String var1 = WHITE_BOLD_BRIGHT + "-fff-------------------------------------------------------------------\nff----oooo--rr-rr----cccc---aa-aa-----gggggg---aa-aa-mm-mm-mmmm----eee-\nffff-oo--oo-rrr--r-cc------aa-aaa----gg---gg--aa-aaa-mmm--mm--mm-ee---e\nff---oo--oo-rr-----cc-----aa--aaa----ggggggg-aa--aaa-mmm--mm--mm-eeeee-\nff----oooo--rr------ccccc--aaa-aa---------gg--aaa-aa-mmm--mm--mm--eeeee\n--------------------------------------ggggg----------------------------\n" + RESET;
        System.out.println(var1);  // Exibe o título estilizado
    }

    // Função que apresenta as opções do jogo e lida com as escolhas do jogador
    void options(Scanner var1, Randomizer var2, Palavra var3) {
        int var4;  // Variável para armazenar a escolha do jogador

        do {
            System.out.println("Insira entre as opções abaixo.");
            System.out.println(GREEN_BOLD_BRIGHT + "1-Jogar " + RED_BOLD_BRIGHT+ "2-Sair" + RESET);  // Opções disponíveis para o jogador
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
        this.p1 = new Player();  // Reinicia o objeto Player
        ArrayList<Character> letrasTentadas = new ArrayList<>();  // Lista para armazenar as letras tentadas

        do {
            this.p1.printLifeStatus();  // Exibe o status de vidas do jogador
            palavra.printValidCarac();  // Exibe a palavra com os caracteres válidos (não revelados)

            // Exibe as letras que o jogador já tentou
            System.out.print("Letras tentadas: ");
            for (char letra : letrasTentadas) {
                System.out.print(letra + " ");  // Imprime todas as letras tentadas até o momento
            }
            System.out.println();  // Nova linha para melhorar a visualização

            System.out.println("Insira um caractere: ");
            String scannerInput = scanner.next().toLowerCase();  // Lê a entrada do jogador e converte para minúsculo
            char letra = scannerInput.charAt(0);  // Extrai o primeiro caractere da entrada

            // Verifica se a letra já foi tentada
            if (letrasTentadas.contains(letra)) {
                System.out.println("Você já tentou essa letra! Tente outra.");
                continue;  // Se a letra já foi tentada, reinicia o laço sem reduzir a vida
            }

            // Adiciona a letra tentada à lista de tentativas
            letrasTentadas.add(letra);

            // Verifica se a letra está na palavra
            if (palavra.verificarCarac(letra) < 0) {
                --this.p1.Vida;  // Se a letra não estiver na palavra, reduz uma vida
            }

            // Verifica se o jogador completou a palavra
            if (palavra.palavraCompleta()) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavra.palavra);
                return;  // Se a palavra for completada, o jogo termina
            }

        } while (this.p1.Vida != 0);  // O jogo continua até o jogador perder todas as vidas

        // Exibe a mensagem de derrota quando o jogador perde todas as vidas
        System.out.println("Você perdeu todas as suas vidas! A palavra era: " + palavra.palavra);

        // Exibe uma arte em ASCII quando o jogador perde
        System.out.println
                ("""
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
