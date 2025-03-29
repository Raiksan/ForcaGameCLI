<<<<<<< Updated upstream:Forca/app/Palavra.java
=======
// Palavra.java
package forcagameCLI;

>>>>>>> Stashed changes:Forca/src/forcagameCLI/Palavra.java
public class Palavra {
    String palavra;
    int TamString; 
    char[] caracteresValidos; 
    
    Palavra(String s) {
        this.palavra = s.toLowerCase(); // Converter a palavra para minúsculas para comparação
        this.TamString = palavra.length();
        this.caracteresValidos = new char[TamString];
        for (int i = 0; i < TamString; i++) {
            caracteresValidos[i] = '_';
        }
    }
    
    int verificarCarac(char a) {
        a = Character.toLowerCase(a); // Converter a entrada do usuário para minúsculas
        int found = -1;
        for (int i = 0; i < TamString; i++) {
            if (a == palavra.charAt(i)) {
                caracteresValidos[i] = a;
                found = 1; // Indica que a letra foi encontrada
            }
        }
        return found;
    }
    
    void printValidCarac() {
        for (char c : caracteresValidos) {
            System.out.print(c + " ");
        }
        System.out.println();
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
