package forcagameCLI;

public class Palavra {
	
	String palavra;
	int TamString; 
	char[] caracteresValidos; 
	
	
	Palavra(String s){
		this.palavra = s;
		this.TamString = palavra.length();
		this.caracteresValidos = new char[TamString];
		for (int i=0;i<TamString;i++) {
			caracteresValidos[i] = '_';
		}
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
		for (int i = 0;i<TamString-1;i++) {
			System.out.print(caracteresValidos[i]);
		}
		System.out.print("\n");
	}
}