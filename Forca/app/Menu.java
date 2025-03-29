import java.util.Scanner;

public class Menu {

	Player p1 = new Player();
	
	void printTitle() {
		String Title_Asciiart = """
		-fff-------------------------------------------------------------------
		ff----oooo--rr-rr----cccc---aa-aa-----gggggg---aa-aa-mm-mm-mmmm----eee-
		ffff-oo--oo-rrr--r-cc------aa-aaa----gg---gg--aa-aaa-mmm--mm--mm-ee---e
		ff---oo--oo-rr-----cc-----aa--aaa----ggggggg-aa--aaa-mmm--mm--mm-eeeee-
		ff----oooo--rr------ccccc--aaa-aa---------gg--aaa-aa-mmm--mm--mm--eeeee
		--------------------------------------ggggg----------------------------
		""";
		System.out.println(Title_Asciiart);
	}
	
	void options(Scanner sc, Randomizer rr, Palavra palavra) {
		int OP = -1;
		do {
			System.out.println("Insira entre as opções abaixo.");
			System.out.println("1-Jogar, 2-Sair");
			System.out.println("Sua opção:");
			OP = sc.nextInt();
			switch (OP) {
			case 1:
				initGame(sc,palavra);
				break;
			case 2:
				System.out.println("Saindo...");
				return;
			default:
				System.out.println("Opção invalida");
				break;
			}
			
			} while (OP!=0);
	}
	
	void initGame(Scanner sc, Palavra p) {
		String a;
		p1 = new Player();
		do {
			p1.printLifeStatus();
			p.printValidCarac();
			System.out.println("Insira um caractere: ");
			a = sc.next();
			if (p.verificarCarac(a.charAt(0))<0) {
				p1.Vida--;
			}
			
		} while (p1.Vida!=0);
		
	}
	
}