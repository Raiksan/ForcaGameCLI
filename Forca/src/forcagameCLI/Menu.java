package forcagameCLI;

public class Menu {

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
	void printLifeStatus(int Tentativa) {
		if (Tentativa == 7) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("A");
		} else if (Tentativa == 6) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("A");
		} else if (Tentativa == 5) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /");
			System.out.println("|");
			System.out.println("A");
		} else if (Tentativa == 4) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| / ⧹");
			System.out.println("|");
			System.out.println("A");
		} else if (Tentativa == 3) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("|");
			System.out.println("A");
		} else if (Tentativa == 2) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| /");
			System.out.println("A");
		} else if (Tentativa == 1) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| / ");
			System.out.println("A");
		} else if (Tentativa == 0) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| / ⧹");
			System.out.println("A");
		}	
	}
	
}
