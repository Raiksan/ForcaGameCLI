public class Player {
    int Vida = 6;  // Número de vidas do jogador
    char[] letrasTentadas = new char[26];  // Suporta até 26 letras (alfabeto inteiro)
    int tentativas = 0;  // Quantidade de letras já tentadas

    // Construtor da classe Player
    Player() {
    }



    // Mostra o status do enforcado de acordo com a vida restante
    void printLifeStatus() {
        if (this.Vida == 6) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 5) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 4) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 3) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| / ⧹");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 2) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 1) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("| /");
            System.out.println("A");
        } else if (this.Vida == 0) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("| / ⧹");
            System.out.println("A");
        }
    }
}