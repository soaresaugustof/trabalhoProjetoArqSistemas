package gof;

public class ControleLG extends Controle{

    @Override
    public void ligar() {
        System.out.println("Ligando TV LG.");
        super.ligar();
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV LG.");
        super.desligar();
    }

    @Override
    public void usarControle() {
        System.out.println("Usando TV LG.");
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
