package forcagameCLI;

public class Player {
	
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
