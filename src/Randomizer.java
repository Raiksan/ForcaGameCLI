//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Randomizer {
    Random Aleatorio = new Random();
    String[] palavras = new String[]{"Casa", "Comida", "Trabalho", "Dinheiro", "Celular", "Carro", "Rua", "Gente", "Amigo", "Festa", "Beta", "Pente"};
    String[] palavrasUsadas;
    int usos;
    int tam;

    public Randomizer() {
        this.palavrasUsadas = new String[this.palavras.length];
        this.usos = 0;
        this.tam = this.palavras.length;
    }

    String pegarPalavraAleatoria() {
        int var1;
        boolean var2;
        do {
            var2 = false;
            var1 = this.Aleatorio.nextInt(0, this.tam);

            for(int var3 = 0; var3 < this.usos; ++var3) {
                if (this.palavras[var1].equals(this.palavrasUsadas[var3])) {
                    var2 = true;
                }
            }
        } while(var2);

        this.palavrasUsadas[this.usos] = this.palavras[var1];
        ++this.usos;
        return this.palavras[var1];
    }
}
