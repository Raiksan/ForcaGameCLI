package forcagameCLI;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	Player p = new Player();
	
	Menu(Player p1){
		this.p = p1;
	}
	
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
	
	void options(Scanner sc) {
		int OP = -1;
		do {
			System.out.println("Insira entre as opções abaixo.");
			System.out.println("1-Jogar, 2-Sair");
			OP = sc.nextInt();
			if (OP!=1||OP!=2) {
				System.out.println("Insira entre as opções abaixo.");
				System.out.println("1-Jogar, 2-Sair");
				OP = sc.nextInt();
			}
			
			switch (OP) {
			case 1:
				initGame(p);
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
	
	void initGame(Scanner sc,Randomizer rr) {
		String s;
		String a;
		p.palavra = new Palavra(rr.pegarPalavraAleatoria());
		do {
			System.out.println(p.palavra.caracteresValidos);
			System.out.println("Insira um caractere: ");
			a = sc.next();
			if (p.palavra.verificarCarac(a.charAt(0))<0) {
				p.Vida--;
			}
			
		} while (p.Vida!=0);
		
	}
	
}
