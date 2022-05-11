package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class List extends ListComponent {
    private ArrayList<ListComponent> listComponents = new ArrayList<>();
    private String nome;
    private String descricao;
    private String numeroCanal;

    public List(String nome, String descricao, String numeroCanal) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroCanal = numeroCanal;
    }

    
    public void adicionar(ListComponent listComponent) {
        listComponents.add(listComponent);
    }
    
    public void remover(ListComponent listComponent) {
        listComponents.remove(listComponent);
	}

	public ListComponent pegarFilho(int i) {
        return (ListComponent) listComponents.get(i);
	}

    public void print() {
        System.out.println("\n" + getNome() + " ," + getDescricao());
        System.out.println("------------------------------------");
        Iterator<ListComponent> iterator = listComponents.iterator();
        while (iterator.hasNext()) {
            ListComponent listComponents = (ListComponent) iterator.next();
            listComponents.print();
        }  
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(String numeroCanal) {
        this.numeroCanal = numeroCanal;
    }
}