package composite;

public class Channels {
    ListComponents totalCanais;

    public Channels(ListComponents totalCanais) {
        this.totalCanais = totalCanais;
    }

    public void printList() {
        totalCanais.print();
    }
}
