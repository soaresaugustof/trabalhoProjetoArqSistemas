package grasp;

import java.util.Date;


public class GUI_Venda {

	public static void main(String[] args) {
		
		Catalog catalogo = new Catalog();
		ControladorVenda controle = new ControladorVenda();
		
		//Instanciando itens
		controle.adicionarItem(2, catalogo.produto1);
		controle.adicionarItem(3, catalogo.produto2);
		controle.adicionarItem(10, catalogo.produto3);
		
		//Istanciando data da venda
		controle.adicionarData(new Date());
		
		controle.consultarValorTotal();
		
		controle.adicionarPagamento(10.50, FormaPagamento.CREDITO.getDescricao());
		controle.adicionarPagamento(2.0, FormaPagamento.DINHEIRO.getDescricao());
		controle.adicionarPagamento(20.0, FormaPagamento.PIX.getDescricao());
		controle.adicionarPagamento(2.0, FormaPagamento.DINHEIRO.getDescricao());
			
		controle.totalizarVenda();


	}
}