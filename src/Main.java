// Importa a classe Scanner para ler entradas do usuário
import java.util.Scanner;

public class Main {
    // Variável estática para armazenar a pontuação do jogo.
    public static int pontuacao;

    // Construtor da classe Main. Neste caso, o construtor não faz nada.
    public Main() {
    }

    // Metodo principal, onde a execução do programa começa
    public static void main(String[] var0) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner var1 = new Scanner(System.in);

        // Cria um objeto Randomizer para gerar palavras aleatórias
        Randomizer var2 = new Randomizer();

        // Cria um objeto Palavra, passando uma palavra aleatória gerada pelo Randomizer
        Palavra var3 = new Palavra(var2.pegarPalavraAleatoria());

        // Cria um objeto Menu que controla as opções do jogo
        Menu var4 = new Menu();

        // Exibe o título do jogo chamando o metodo printTitle do objeto Menu
        var4.printTitle();

        // Exibe as opções do jogo e lida com as escolhas do usuário através do metodo options
        var4.options(var1, var2, var3);
    }
}
