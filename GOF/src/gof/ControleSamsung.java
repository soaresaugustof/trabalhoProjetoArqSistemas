package gof;

public class ControleSamsung extends Controle{

    @Override
    public void ligar() {
        System.out.println("Ligando TV Samsung.");
        super.ligar();
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV Samsung.");
        super.desligar();
    }

    @Override
    public void usarControle() {
        System.out.println("Usando TV Samsung.");
        super.usarControle();
    }

    @Override
    public boolean isPower() {
        return super.isPower();
    }

    @Override
    public boolean isUsing() {
        return super.isUsing();
    }
}
