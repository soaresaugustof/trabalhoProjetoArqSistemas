package grasp;

import java.util.Date;

public class ControladorVenda {

	Sale venda = new Sale();
	
	//Criar itens de venda
	public void adicionarItem(int quantidade, Product produto) {
		venda.criarItemDeVenda(quantidade, produto);
	}
	
	//Adicionar pagamento
	public void adicionarPagamento(Double valor, String forma) {
		Pagamento pagamento = new Pagamento(valor, forma);
		venda.efetuarPagamento(pagamento);
	}
	
	//Totalizar venda
	public void totalizarVenda() {
		venda.conferirPagamentoTotal();
	}
	
	public void adicionarData(Date data) {
		venda.setDataVenda(data);
	}
	
	public void consultarValorTotal() {
		venda.getTotal();
	}
}
