package forcagameCLI;

public class Palavra {
	
	String palavra;
	int TamString = palavra.length();
	
	Palavra(String s){
		this.palavra = s;
	}
	
	int verificarCarac (char a) {
		for(int i = 0;i<TamString;i++) {
			if (a==palavra.charAt(i)) {
				return 1; // Direcionado para o numero de pontos
			}
		}
		return -1; // Direcionado para tentativas
	}
}