package grasp;



public class SalesItens {

	private int quantidade;
	private Product produto;
	
	public SalesItens(int quantidade, Product produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public Double getSubTotal(Product produto) {
		Double subtotal = new Double(0);
		
		subtotal = produto.getPreco() * quantidade;
		
		return subtotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

}