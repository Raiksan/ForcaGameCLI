package forcagameCLI;

import java.util.Scanner;

public class Main {
	public static int pontuacao;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Randomizer rr = new Randomizer();
		Player p = new Player();
		Menu m = new Menu(p);
		m.printTitle();
		m.options(sc);
	}

}
