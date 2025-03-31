//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Player {
    int Vida = 6;

    Player() {
    }

    void printLifeStatus() {
        if (this.Vida == 6) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 5) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 4) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 3) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| / ⧹");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 2) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("|");
            System.out.println("A");
        } else if (this.Vida == 1) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("| /");
            System.out.println("A");
        } else if (this.Vida == 0) {
            System.out.println("=---");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|⧹");
            System.out.println("| / ⧹");
            System.out.println("A");
        }

    }
}
