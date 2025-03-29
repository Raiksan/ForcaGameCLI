//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Palavra {
    String palavra;
    int TamString;
    char[] caracteresValidos;

    Palavra(String var1) {
        this.palavra = var1;
        this.TamString = this.palavra.length();
        this.caracteresValidos = new char[this.TamString];

        for(int var2 = 0; var2 < this.TamString; ++var2) {
            this.caracteresValidos[var2] = '_';
        }

    }

    int verificarCarac(char caractere) {
        int caracteresValidos = 0;
        for(int var2 = 0; var2 < this.TamString; ++var2) {
            String actualChar = String.valueOf(this.palavra.charAt(var2));
            if (caractere == actualChar.toLowerCase().charAt(0)) {

                this.caracteresValidos[var2] = caractere;
                caracteresValidos++;
            }


        }
        if(caracteresValidos > 0){
            return 1;
        }

        return -1;
    }

    void printValidCarac() {
        for(int var1 = 0; var1 < this.TamString; ++var1) {
            System.out.print(this.caracteresValidos[var1]);
        }

        System.out.print("\n");
    }

    boolean palavraCompleta() {
        for (char c : caracteresValidos) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
