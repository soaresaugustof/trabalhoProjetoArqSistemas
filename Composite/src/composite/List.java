package composite;

import java.util.ArrayList;

public class List extends ListComponent {
    private ArrayList listComponents = new ArrayList<>();
    private String nome;
    private String descricao;

    public List(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionar(ListComponents listComponents) {
        listComponents.adicionar(listComponents);
    }

    public void remover(ListComponent listComponent) {
		listComponents.remover(listComponent);
	}
	public ListComponents pegarFilho(int i) {
		return (ListComponents) listComponents.get(i);
	}

    public void print() {
        System.out.println("\n" + getNome() + " ," + getDescricao());

        System.out.println("------------------------------------");

/**
 *              AUGUSTO, DA UMA OLHADA AQUI NESSA PARTE QUE O PROF. IMPLEMENTA ITERATOR.
 * 
 Iterator iterator = menuComponents.iterator();
 while (iterator.hasNext()) {
     ListComponents listComponents = (ListComponents) iterator.next();
     listComponents.print();
 }
 * 
 */

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
    
}