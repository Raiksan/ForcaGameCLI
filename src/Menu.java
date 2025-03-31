import java.util.Scanner;

public class Menu {
    Player p1 = new Player();

    public Menu() {
    }

    void printTitle() {
        String var1 = "-fff-------------------------------------------------------------------\nff----oooo--rr-rr----cccc---aa-aa-----gggggg---aa-aa-mm-mm-mmmm----eee-\nffff-oo--oo-rrr--r-cc------aa-aaa----gg---gg--aa-aaa-mmm--mm--mm-ee---e\nff---oo--oo-rr-----cc-----aa--aaa----ggggggg-aa--aaa-mmm--mm--mm-eeeee-\nff----oooo--rr------ccccc--aaa-aa---------gg--aaa-aa-mmm--mm--mm--eeeee\n--------------------------------------ggggg----------------------------\n";
        System.out.println(var1);
    }

    void options(Scanner var1, Randomizer var2, Palavra var3) {
        int var4 = -1;

        do {
            System.out.println("Insira entre as opções abaixo.");
            System.out.println("1-Jogar, 2-Sair");
            System.out.println("Sua opção:");
            var4 = var1.nextInt();
            switch (var4) {
                case 1:
                    this.initGame(var1, var3);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        } while(var4 != 0);

    }

    void initGame(Scanner scanner, Palavra palavra) {
        this.p1 = new Player();
        do {
            this.p1.printLifeStatus();
            palavra.printValidCarac();
            System.out.println("Insira um caractere: ");
            String scannerInput = scanner.next();
            if (palavra.verificarCarac(scannerInput.charAt(0)) < 0) {
                --this.p1.Vida;
            }
            if (palavra.palavraCompleta()) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavra.palavra);
                return;
            }

        } while(this.p1.Vida != 0);

        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⡀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⡿⠿⠿⠿⠿⢿⣿⣧⠈⢿⣿⣿⡄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣤⣤⣤⣤⣤⣼⣿⣿⣧⠈⢿⣿⣿⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣦⣤⣤⣤⣤⣼⣿⣿⣿⡇⢈⣉⣉⣉⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢸⣿⣿⡏⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⣿⣿⣿⠃⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢰⣿⣿⡟⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣼⣿⣿⠇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢀⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⠃⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡿⠀⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠛⠀⠘⠛⠛");
    }
}
