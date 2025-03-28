package forcagameCLI;

public class Player {
	
	int Vida;
	
	Player(){
		this.Vida = 7;
	}
	
	void printLifeStatus() {
		if (Vida == 7) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("A");
		} else if (Vida == 6) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("A");
		} else if (Vida == 5) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /");
			System.out.println("|");
			System.out.println("A");
		} else if (Vida == 4) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| / ⧹");
			System.out.println("|");
			System.out.println("A");
		} else if (Vida == 3) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("|");
			System.out.println("A");
		} else if (Vida == 2) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| /");
			System.out.println("A");
		} else if (Vida == 1) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| / ");
			System.out.println("A");
		} else if (Vida == 0) {
			System.out.println("=---");
			System.out.println("|  |");
			System.out.println("|  O");
			System.out.println("| /|⧹");
			System.out.println("| / ⧹");
			System.out.println("A");
		}
		
		
	}
}


