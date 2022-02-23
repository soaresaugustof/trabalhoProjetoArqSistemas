package grasp;

public class Pagamento {

	private Double valorPagamento;
	private String formaPagamento;
	
	public Pagamento(Double valorPagamento, String formaPagamento) {
		this.valorPagamento = valorPagamento;
		this.formaPagamento = formaPagamento;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
}
