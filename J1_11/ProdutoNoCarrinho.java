package J1_11;

public class ProdutoNoCarrinho {
	int quantidade;
	Produto prod;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProd() {
		return prod;
	}
	public void setProd(String nome, double preco, int qtd) {
		this.prod = new Produto();
		this.prod.setNome(nome);
		this.prod.setPreco(preco);
		this.setQuantidade(qtd);
	}
}
