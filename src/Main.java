
import java.util.Scanner;

public class Main {
    public static int pontuacao;

    public Main() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        Randomizer var2 = new Randomizer();
        Palavra var3 = new Palavra(var2.pegarPalavraAleatoria());
        Menu var4 = new Menu();
        var4.printTitle();
        var4.options(var1, var2, var3);
    }
}