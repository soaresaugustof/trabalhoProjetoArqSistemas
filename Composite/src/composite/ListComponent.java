package composite;

public abstract class ListComponent {
    public void adicionar(ListComponent listComponent) {
        throw new UnsupportedOperationException();
    }

    public void remover(ListComponent listComponent) {
        throw new UnsupportedOperationException();
    }

    public ListComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

    public String getNome() {
		throw new UnsupportedOperationException();
	}

    public String getDescricao() {
		throw new UnsupportedOperationException();
	}

    public String getNumeroCanal() {
		throw new UnsupportedOperationException();
	}

    public void print() {
		throw new UnsupportedOperationException();
	}
}
