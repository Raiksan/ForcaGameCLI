import java.util.Scanner;

public class Main {
	public static int pontuacao;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Randomizer rr = new Randomizer();
		Palavra palavra = new Palavra(rr.pegarPalavraAleatoria());
		Menu m = new Menu();
		m.printTitle();
		m.options(sc,rr,palavra);
	}

}