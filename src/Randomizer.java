import java.util.Random;

public class Randomizer {
    Random Aleatorio = new Random();  // Objeto Random para gerar números aleatórios
    String[] palavras = new String[]{"Casa", "Comida", "Trabalho", "Dinheiro", "Celular", "Carro", "Rua", "Gente", "Amigo", "Festa", "Beta", "Pente"};
    // Lista de palavras que podem ser escolhidas aleatoriamente no jogo

    String[] palavrasUsadas;  // Array para armazenar as palavras que já foram sorteadas.
    int usos;  // Contador de palavras usadas
    int tam;   // Tamanho total da lista de palavras

    // Construtor do Randomizer, inicializando as variáveis
    public Randomizer() {
        this.palavrasUsadas = new String[this.palavras.length];  // Inicializa o array de palavras usadas com o tamanho do array de palavras
        this.usos = 0;  // Inicializa o contador de usos
        this.tam = this.palavras.length;  // Define o tamanho total das palavras como o tamanho do array de palavras
    }

    // Metodo para pegar uma palavra aleatória que ainda não foi usada
    String pegarPalavraAleatoria() {
        int var1;  // Variável para armazenar o índice da palavra aleatória
        boolean var2;  // Flag para verificar se a palavra já foi usada

        do {
            var2 = false;  // Reseta a flag
            var1 = this.Aleatorio.nextInt(0, this.tam);  // Gera um número aleatório entre 0 e o tamanho total das palavras

            // Verifica se a palavra já foi usada anteriormente
            for(int var3 = 0; var3 < this.usos; ++var3) {
                if (this.palavras[var1].equals(this.palavrasUsadas[var3])) {  // Se a palavra já foi usada, define var2 como true
                    var2 = true;
                    break;  // Sai do loop, pois já encontrou a palavra repetida
                }
            }
        } while(var2);  // Continua tentando até encontrar uma palavra não usada

        // Marca a palavra como usada e incrementa o contador de usos
        this.palavrasUsadas[this.usos] = this.palavras[var1];
        ++this.usos;
        return this.palavras[var1];  // Retorna a palavra aleatória escolhida
    }
}
