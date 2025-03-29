<<<<<<< Updated upstream:Forca/app/Player.java
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
=======
// Player.java
package forcagameCLI;

public class Player {
    int Vida;
    
    Player() {
        this.Vida = 7;
    }
    
    void printLifeStatus() {
        System.out.println("Vidas restantes: " + Vida);
        switch (Vida) {
            case 7:
                System.out.println("=---\n|  |\n|\n|\n|\nA");
                break;
            case 6:
                System.out.println("=---\n|  |\n|  O\n|\n|\nA");
                break;
            case 5:
                System.out.println("=---\n|  |\n|  O\n| /\n|\nA");
                break;
            case 4:
                System.out.println("=---\n|  |\n|  O\n| / \\\n|\nA");
                break;
            case 3:
                System.out.println("=---\n|  |\n|  O\n| /|\\\n|\nA");
                break;
            case 2:
                System.out.println("=---\n|  |\n|  O\n| /|\\\n| /\nA");
                break;
            case 1:
                System.out.println("=---\n|  |\n|  O\n| /|\\\n| / \\\nA");
                break;
            case 0:
                System.out.println("=---\n|  |\n|  O\n| /|\\\n| / \\\nA");
                System.out.println("Game Over!");
                break;
        }
    }
}
>>>>>>> Stashed changes:Forca/src/forcagameCLI/Player.java
