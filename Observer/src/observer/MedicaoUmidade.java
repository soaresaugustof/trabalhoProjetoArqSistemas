package observer;

public class MedicaoUmidade implements Observer{

    private Subject subject;
    private float umidade;
    private float massaSeca;
    private float massaUmida;

    public MedicaoUmidade(Subject subject) {
        this.subject = subject;
	    this.subject.addObserver(this);
    }

    public void display() {
        System.out.println("Umidade: " + calcUmidade() + "%");
        if (calcUmidade() < 20) {
            System.out.println("A terra está ficando seca. Alerte-se para regar as plantas.");
        }else if (calcUmidade() > 80) {
            System.out.println("A terra está com excesso de água. Favor não regar nenhuma planta.");
        } else {
            System.out.println("A terra está com um nível de água satisfatório. Não é necessário regar as plantas.");
        }
    }

    private float calcUmidade() {
        umidade = ((massaUmida - massaSeca)/massaSeca) * 100;
        return umidade;
    }

    @Override
    public void update(float massaSeca, float massaUmida) {
        this.massaSeca = massaSeca;
        this.massaUmida = massaUmida;
        
        display();
    }
    
}
