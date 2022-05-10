package composite;

public class ListItem extends ListComponent {
    private String nome;
    private String descricao;
    private String horario;

    public ListItem(String nome, String descricao, String horario) {
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void print() {
        System.out.println(" " + getNome());
        System.out.println("| " + getHorario());
        System.out.println("| " + getDescricao());
    }
}

