package jogoDeXadrez;

public class Tabuleiro {
	private PecaDeXadrez[][] tabuleiro;
	
	//Objeto Tabuleiro
	public  Tabuleiro(){
		tabuleiro = new PecaDeXadrez[8][8];
	}
	
	//colocando a peça
	public void colocarPeca(PecaDeXadrez peca, int linha, int coluna) {
	        tabuleiro[linha][coluna] = peca;
	 }
	
	// Move uma peça de uma posição para outra
    public void moverPeca(int origemLinha, int origemColuna, int destinoLinha, int destinoColuna) {
        //Atual posição da peça
    	PecaDeXadrez peca = tabuleiro[origemLinha][origemColuna];
        
    	//evita que esta ação ocorra em uma casa vazia
        if (peca == null) {
        	System.out.println("Nenhuma peça para mover na posição (" + origemLinha + "," + origemColuna + ")");
            return;
        }
        
        //nova posição da peça
        PecaDeXadrez pecaDestino = tabuleiro[destinoLinha][destinoColuna];
        
        //verifica se a casa destinho está vazia
        if (pecaDestino != null) {
       		
        	// Verifica se a peça de destino é do oponente
        	if (!peca.getCor().equals(pecaDestino.getCor())) {
        		pecaDestino.capturar();
        	} else {
        		System.out.println("Movimento inválido! Não pode capturar uma peça da mesma cor.");
        		return;
        		}
        	}
    }
    
    public void exibirTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == null) {
                    System.out.print("[  ] ");
                } else {
                    System.out.print("[" + tabuleiro[i][j].getNome().charAt(0) + "] ");
                }
            }
            System.out.println();
        }
    }
}
    

