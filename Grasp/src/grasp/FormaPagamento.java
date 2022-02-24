package grasp;

public enum FormaPagamento {
	
	DEBITO(1, "Cart�o de D�bito"), CREDITO(2, "Cart�o de Cr�dito"), BOLETO(3, "Boleto banc�rio"),
	PIX(4, "Transa��o PIX"), TED(5, "Transfer�ncia TED"), DOC(6, "Transfer�ncia DOC"), DINHEIRO(7, "Dinheiro"), FIADO(8, "Fiado");
	

	private Integer valor;
	private String descricao;
	
	private FormaPagamento(Integer valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
