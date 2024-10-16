package jogoDeXadrez;

public class JogoDeXadrez {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        
        // Cria peças
        PecaDeXadrez torreBranca = new PecaDeXadrez("Torre", "Branco",true, 0, 0);
        PecaDeXadrez rainhaPreta = new PecaDeXadrez("Rainha", "Preto",true, 3, 7);

        // Coloca as peças no tabuleiro
        tabuleiro.colocarPeca(torreBranca, 0, 0);
        tabuleiro.colocarPeca(rainhaPreta, 3, 7);

        // Exibe o tabuleiro
        System.out.println("Tabuleiro inicial:");
        tabuleiro.exibirTabuleiro();

        // Move a torre branca para capturar a rainha preta
        System.out.println("\nMovendo torre para capturar rainha:");
        tabuleiro.moverPeca(0, 0, 3, 7);

        // Exibe o tabuleiro após o movimento
        System.out.println("\nTabuleiro após a captura:");
        tabuleiro.exibirTabuleiro();
    }
}