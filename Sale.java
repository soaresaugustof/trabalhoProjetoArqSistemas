package grasp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Sale {

	private Date dataVenda;
	private Pagamento pagamento;
	private Double valorPago = new Double(0); 
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Collection<SalesItens> itensDaVenda;
	
	public Sale() {
		this.itensDaVenda = new ArrayList<SalesItens>();
		this.dataVenda = dataVenda;
	}
	
	public void efetuarPagamento(Pagamento pagamento) {
		valorPago += pagamento.getValorPagamento();
	}
	
	public void conferirPagamentoTotal() {
		Double valorFaltante = getTotal();
		
		if (valorPago < valorFaltante) {
			System.out.println("Foi pago um valor de " + valorPago + " reais em "+ pagamento.getFormaPagamento() +". Valor faltante: " + valorFaltante + " reais.");
		} else {
			System.out.println("Pagamento efetuado com sucesso em " + getDataVenda() + ".");
		}

	}
	
	public Double getTotal() {
		Double total = new Double(0);
		
		for(SalesItens item : itensDaVenda) {
			
			total += item.getSubTotal(item.getProduto());
			
		}
		return total;
	}
	
	public void criarItemDeVenda(int quantidade, Product produto) {
		SalesItens itens = new SalesItens(quantidade, produto);
		itensDaVenda.add(itens);
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	

}