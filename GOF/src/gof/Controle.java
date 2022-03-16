package gof;

public class Controle {

    private boolean power;
    private boolean using;
    private static Controle instancia;

    public static Controle getInstancia() {
        if (instancia == null) {
            System.out.println("Criando nova instância.");
            return new Controle();
        }
        System.out.println("Retornando uma instância existente");
        return instancia;
    }

    public void ligar() {
        if (!isPower()) {
            System.out.println("Ligando televisão");
            power = true;
        } else {
            System.out.println("A televisão já está ligada");
        }
    }

    public void desligar() {
        if (isPower()) {
            System.out.println("Desligando televisão");
            power = false;
        } else {
            System.out.println("A televisão já está desligada");
        }
    }

    public void UsarControle() {
        using = true;
        System.out.println("Usando televisão.");
        using = false;
    }

    public boolean isPower() {
        return power;
    }

    public boolean isUsing() {
        return using;
    }

}
