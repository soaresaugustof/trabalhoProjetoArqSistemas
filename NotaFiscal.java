package grasp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

	public static void main(String[] args) {
		
		Catalog catalogo = new Catalog();
		Sale venda = new Sale();
		
		
		//Instanciando itens
		venda.criarItemDeVenda(2, catalogo.produto1);
		venda.criarItemDeVenda(3, catalogo.produto2);
		venda.criarItemDeVenda(10, catalogo.produto3);
		
		//Istanciando data da venda
		venda.setDataVenda(new Date());
		
		//Calculando venda total
		
		venda.getTotal();
		
	}
}