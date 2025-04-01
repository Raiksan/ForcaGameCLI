import java.util.ArrayList;

public class Player {
    int Vida = 6;  // Armazena o número de vidas do jogador (começa com 6)
    ArrayList<Character> letrasTentadas = new ArrayList<>();  // Lista para armazenar as letras já tentadas

    // Construtor da classe Player (não há inicializações específicas, pois as variáveis já são definidas no código)
    Player() {
    }

    // Metodo para adicionar uma letra na lista de tentativas, caso não tenha sido tentada antes
    void adicionarTentativa(char letra) {
        if (!letrasTentadas.contains(letra)) {
            letrasTentadas.add(letra);  // Adiciona a letra à lista de tentativas
        }
    }

    // Metodo para verificar se uma letra já foi tentada
    boolean jaTentouLetra(char letra) {
        return letrasTentadas.contains(letra);  // Retorna verdadeiro se a letra já foi tentada
    }

    // Metodo para exibir todas as letras já tentadas
    void mostrarLetrasTentadas() {
        System.out.print("Letras tentadas: ");
        for (char letra : letrasTentadas) {
            System.out.print(letra + " ");  // Exibe cada letra tentada
        }
        System.out.println();  // Nova linha após a lista de letras
    }

    // Metodo para mostrar o status da vida do jogador, representando o enforcado
    void printLifeStatus() {
        // Cada condição abaixo exibe uma representação gráfica do "enforcado" conforme as vidas restantes
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
            System.out.println("|  O");  // Cabeça
            System.out.println("| /|⧹");  // Braços e pernas
            System.out.println("| / ⧹");  // Corpo e pernas completas (morto)
            System.out.println("A");
        }
    }
}
