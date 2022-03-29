package adapter;

public class ControleLGAdapter implements InterfaceSamsung{

    ControleLG controleLG;

    public ControleLGAdapter(ControleLG controleLG) {
        this.controleLG = controleLG;
    }

    @Override
    public void ligarSamsung() {
        // TODO Auto-generated method stub
        controleLG.ligarLG();
        
    }

    @Override
    public void desligarSamsung() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 2; i++) {
            controleLG.desligarLG();
        }
        System.out.println("Ainda bem que funcionou. :)");
    }
    
}
