package gof;

public class Main {
    public static void main(String[] args) {

        Controle controle = Controle.getInstancia();

        controle.ligar();
        controle.UsarControle();
        controle.desligar();
        controle.desligar();
    }
}
