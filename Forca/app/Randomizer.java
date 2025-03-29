import java.util.Random;

public class Randomizer {
	
	Random Aleatorio = new Random();
	String[] palavras = {"Casa", "Comida", "Trabalho",
			"Dinheiro", "Celular", "Carro",
			"Rua", "Gente", "Amigo",
			"Festa","Beta","Pente"};
	String[] palavrasUsadas = new String[palavras.length];
	int usos = 0;
	int tam = palavras.length;
	
	String pegarPalavraAleatoria() {
		 int NumR;
		 boolean repetida;
		 do {
			 repetida = false;
			 NumR = Aleatorio.nextInt(0,tam);
			 for (int i = 0; i < usos; i++) {
				 if (palavras[NumR].equals(palavrasUsadas[i])) {
					 repetida = true;
				 }
			 }
		 } while (repetida);
		 palavrasUsadas[usos] = palavras[NumR];
		 usos++;
		 return palavras[NumR];
	}
}