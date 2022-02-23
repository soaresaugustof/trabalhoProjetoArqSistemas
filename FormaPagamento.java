package grasp;

public enum FormaPagamento {
	
	DEBITO(1, "Cartão de Débito"), CREDITO(2, "Cartão de Crédito"), BOLETO(3, "Boleto bancário"),
	PIX(4, "Transação PIX"), TED(5, "Transferência TED"), DOC(6, "Transferência DOC"), DINHEIRO(7, "Dinheiro");
	

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
