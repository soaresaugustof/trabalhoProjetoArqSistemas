package gof;

public class Main {
    public static void main(String[] args) {

        Controle controle = Controle.getInstancia();

        controle.ligar();
        controle.usarControle();
        controle.desligar();
        controle.desligar();
    }
}
