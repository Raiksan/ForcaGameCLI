package forcagameCLI;

public class Palavra {
	
	String palavra;
	int TamString = palavra.length();
	char[] caracteresValidos = new char[TamString];
	
	Palavra(String s){
		this.palavra = s;
	}
	
	int verificarCarac (char a) {
		for(int i = 0;i<TamString;i++) {
			if (a==palavra.charAt(i)) {
				caracteresValidos[i] = a;
				return 1; // Direcionado para a validação do caracter
			} else {
				caracteresValidos[i] = '_';
			}
		}
		return -1; // Direcionado para tentativas
	}
	
	void printValidCarac() {
		System.out.println(caracteresValidos);
	}
}