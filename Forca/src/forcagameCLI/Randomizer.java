package forcagameCLI;

import java.util.Random;

public class Randomizer {
	String[] palavras = {"Casa", "Comida", "Trabalho",
			"Dinheiro", "Celular", "Carro",
			"Rua", "Gente", "Amigo",
			"Festa","Beta","Pente"};
	String[] palavrasUsadas = new String[palavras.length];
	
	String pegarPalavraAleatoria(Random aleph) {
		int numaleatorio = aleph.nextInt(0,palavras.length);
		for (int i = 0;i<palavras.length;i++) {
			if (palavras[numaleatorio] == palavrasUsadas[i]) {
				pegarPalavraAleatoria(aleph);
			} else if(i==palavras.length) {
				return palavras[numaleatorio];
			} else {
				continue;
			}
		}
		return palavras[numaleatorio];
	}
	
}
