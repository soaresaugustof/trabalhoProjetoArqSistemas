package composite;

public class ListItem extends ListComponent {
    private String nome;
    private String descricao;
    private String numeroCanal;

    public ListItem(String nome, String descricao, String numeroCanal) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroCanal = numeroCanal;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNumeroCanal() {
        return numeroCanal;
    }

    public void print() {
        System.out.println(" " + getNome());
        System.out.println("| N° " + getNumeroCanal());
        System.out.println("| " + getDescricao());
    }
}

