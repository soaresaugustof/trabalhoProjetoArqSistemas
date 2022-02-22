package grasp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Sale {

	private Date dataVenda;
	public Collection<SalesItens> itensDaVenda;
	
	public Sale() {
		this.itensDaVenda = new ArrayList<SalesItens>();
		this.dataVenda = dataVenda;
	}
	
	public Double getTotal() {
		Double total = new Double(0);
		
		for(SalesItens item : itensDaVenda) {
			
			total += item.getSubTotal(item.getProduto());
			
		}
		System.out.println("O total da venda foi de " + total + " reais no dia " + dataVenda);
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