package entidades;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalvalorstock() {
		
		return preco * quantidade;
	}
	
	public void addProdutos (int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " units, Total: $ "
				+ String.format("%.2f", totalvalorstock());
	}
}
