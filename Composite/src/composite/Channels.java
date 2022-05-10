package composite;

public class Channels {
    ListComponent totalCanais;

    public Channels(ListComponent totalCanais) {
        this.totalCanais = totalCanais;
    }

    public void printList() {
        totalCanais.print();
    }
}
