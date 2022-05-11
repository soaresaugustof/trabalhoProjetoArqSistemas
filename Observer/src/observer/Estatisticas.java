package observer;

public class Estatisticas implements Observer {

    private Subject subject;
    private float massaSeca;
    private float massaUmida;

    public Estatisticas(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    private void display() {
        System.out.println("---------------------------------");
        System.out.println("Massa seca: " + massaSeca + "Kg");
        System.out.println("Massa úmida: " + massaUmida + "Kg");
    }

    @Override
    public void update(float massaSeca, float massaUmida) {
        this.massaSeca = massaSeca;
        this.massaUmida = massaUmida;

        display();
    }
    
}
