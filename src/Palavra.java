public class Palavra {
    String palavra;  // Armazena a palavra a ser adivinhada
    int TamString;  // Armazena o tamanho da palavra
    char[] caracteresValidos;  // Array que guarda os caracteres válidos ou adivinhados corretamente (inicializados com '_')

    // Construtor da classe Palavra, que inicializa a palavra e o array de caracteres válidos
    Palavra(String var1) {
        this.palavra = var1;  // Atribui a palavra passada como argumento
        this.TamString = this.palavra.length();  // Define o tamanho da palavra
        this.caracteresValidos = new char[this.TamString];  // Cria um array para armazenar os caracteres válidos

        // Inicializa o array com o caractere '_', representando que as letras ainda não foram adivinhadas
        for(int var2 = 0; var2 < this.TamString; ++var2) {
            this.caracteresValidos[var2] = '_';
        }
    }

    // Metodo que verifica se o caractere tentado existe na palavra
    int verificarCarac(char caractere) {
        int caracteresValidos = 0;  // Contador de caracteres válidos encontrados

        // Percorre cada caractere da palavra
        for(int var2 = 0; var2 < this.TamString; ++var2) {
            String actualChar = String.valueOf(this.palavra.charAt(var2));  // Extrai o caractere da palavra
            // Verifica se o caractere da palavra é igual ao caractere tentado (ignorando maiúsculas/minúsculas)
            if (caractere == actualChar.toLowerCase().charAt(0)) {
                this.caracteresValidos[var2] = caractere;  // Atualiza o caractere válido no array
                caracteresValidos++;  // Incrementa o contador de caracteres válidos encontrados
            }
        }

        // Se encontrou caracteres válidos, retorna 1, caso contrário, retorna -1
        if(caracteresValidos > 0) {
            return 1;
        }
        return -1;
    }

    // Metodo que imprime a palavra com os caracteres válidos ou '_' para os não descobertos
    void printValidCarac() {
        for(int var1 = 0; var1 < this.TamString; ++var1) {
            System.out.print(this.caracteresValidos[var1]);  // Exibe o caractere válido ou '_'
        }
        System.out.print("\n");  // Nova linha após a palavra
    }

    // Metodo que verifica se a palavra foi completamente descoberta
    boolean palavraCompleta() {
        // Verifica se existe algum caractere '_' no array de caracteres válidos
        for (char c : caracteresValidos) {
            if (c == '_') {
                return false;  // Se encontrar '_', a palavra ainda não está completa
            }
        }
        return true;  // Se não encontrar '_', a palavra está completa
    }
}
