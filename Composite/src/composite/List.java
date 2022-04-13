package composite;

import java.util.ArrayList;

public class List extends ListComponent {
    private ArrayList listComponents = new ArrayList<>();
    private String nome;
    private String descricao;

    public Menu(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    
}