package forcagameCLI;

public class Palavra {
	
	String palavra;
	
	Palavra(String s){
		this.palavra = s;
	}
	
	int verificarPal(String s, char a) {
		int ponto = 0;
		for (int i = 0; i<s.length();i++) {
			if (a == s.charAt(i)) {
				ponto++;
			} else if(a != s.charAt(s.length()-1)) {
				ponto--;
			}
		}
		return ponto;
	}
	
	
}