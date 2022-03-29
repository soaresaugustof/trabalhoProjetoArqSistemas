package adapter;

public class TesteMain {
    public static void main(String[] args) {
        ControleSamsung controleSamsung = new ControleSamsung();
        ControleLG controleLG = new ControleLG();

        InterfaceSamsung controleLGAdapter = new ControleLGAdapter(controleLG);

        System.out.println("Usando TV LG");
        System.out.println();
        controleLG.ligarLG();
        controleLG.desligarLG();

        System.out.println("---------------------");
        System.out.println("Usando TV Samsung");
        System.out.println();        
        controleSamsung.ligarSamsung();
        controleSamsung.desligarSamsung();

        System.out.println("---------------------");
        System.out.println("Usando TV Samsung sem o controle Samsung");
        System.out.println();        
        controleLGAdapter.ligarSamsung();
        controleLGAdapter.desligarSamsung();

    }
}
