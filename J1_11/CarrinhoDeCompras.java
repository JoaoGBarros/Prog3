package J1_11;

public class CarrinhoDeCompras {
	ProdutoNoCarrinho[] carrinho;
	
	public CarrinhoDeCompras(int num) {
		this.carrinho = new ProdutoNoCarrinho[num];
	}
	
	public void adicionar(String nome, double preco, int qtd, int i) {
		this.carrinho[i] = new ProdutoNoCarrinho();
		this.carrinho[i].setProd(nome, preco, qtd);
	}
	
	public void imprimir() {
		double soma = 0, prod;
		System.out.println("No carrinho:");
		for(int i = 0; i < this.carrinho.length; i++) {
			prod = this.carrinho[i].quantidade * this.carrinho[i].prod.preco;
			soma += prod;
			System.out.printf("* %dx %s = R$ %.2f\n", this.carrinho[i].quantidade, 
					this.carrinho[i].prod.nome, prod);
		}
		System.out.printf("Total: R$ %.2f\n", soma);
	}
}

