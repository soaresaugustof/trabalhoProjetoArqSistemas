package observer;

public class TestDrive {
    public static void main(String[] args) {
        Agricultura agricultura = new Agricultura();

        Estatisticas estatisticas = new Estatisticas(agricultura);
        MedicaoUmidade mUmidade = new MedicaoUmidade(agricultura);

        agricultura.setMedicoes(10, 16);
        agricultura.setMedicoes(10, 19);
        agricultura.setMedicoes(10, 11);
    }
}
