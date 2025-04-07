public class Player {
    int Vida = 6;  // Número de vidas do jogador
    char[] letrasTentadas = new char[26];  // Suporta até 26 letras (alfabeto inteiro)
    int tentativas = 0;  // Quantidade de letras já tentadas

    // Construtor da classe Player
    Player() {
    }

    // Adiciona uma letra na lista de tentativas, se ainda não foi tentada
    void adicionarTentativa(char letra) {
        if (!jaTentouLetra(letra)) {
            letrasTentadas[tentativas] = letra;
            tentativas++;
        }
    }

    // Verifica se uma letra já foi tentada
    boolean jaTentouLetra(char letra) {
        for (int i = 0; i < tentativas; i++) {
            if (letrasTentadas[i] == letra) {
                return true;
            }
        }
        return false;
    }

    // Exibe todas as letras já tentadas
    void mostrarLetrasTentadas() {
        System.out.print("Letras tentadas: ");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(letrasTentadas[i] + " ");
        }
        System.out.println();
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