

package jogoDeXadrez;

public class PecaDeXadrez {
	
	private String nome;
	private String cor;
	private Boolean emJogo; //Valor que determina se a peça esta em jogo ou não
	private int linha; //eixo X do tabuleiro
	private int coluna;//eixo Y do tabuleiro
	
	//Objeto peça de xadrez
	public PecaDeXadrez(String nome, String cor, Boolean emJogo, int linha, int coluna) {
		
		this.nome = nome;
		this.cor = cor;
		this.emJogo = true;
		this.linha = linha;
		this.coluna = coluna;
		
	}
	
	//metodo para a peça se mover
	public void mover(int novaLinha,int novaColuna) {
		if(emJogo){ 
			this.linha = novaLinha;
			this.coluna = novaColuna;
	
		} else {
			System.out.println("Esta peça não pode ser movida pois não esta em jogo!");
		}
	}
	
	//metodo para a peça capturar outra
	public void capturar() {
        this.emJogo = false;
        System.out.println(nome + " capturado!");
    }

	//getters e setters
	public String getNome(){
		return nome;
		
	}
	public void setNome(String nome){
		 this.nome = nome;
		 
	 }
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Boolean getEmJogo() {
		return emJogo;
	}
	public void setEmJogo(Boolean emJogo) {
		this.emJogo = emJogo;
	}
	
	public int getLinha(){
		return linha;
	}
	public void setLinha(int linha){
		this.linha = linha;
		
	}
	
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	

	
	
	
	
	
	
	
	
	
}

