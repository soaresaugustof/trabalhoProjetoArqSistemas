package composite;

public class ListTeste {

    public static void main(String[] args) {
        
        //Primeiro criamos todos os objetos do List
		ListComponent sbt = new List ("SBT", "Sistema Brasileiro de Televisão", "5");
		ListComponent globo = new List ("Globo", "Rede Globo de Comunicações", "10");
		ListComponent sportv = new List ("SporTV", "SporTV, o canal campeão", "39");
		ListComponent espn = new List ("ESPN", "Entertainment ans Sports Programming Network", "55");
		
		ListComponent totalCanais = new List ("ALL ListS", "ALL ListS COMBINED", "ALL Numbers");

		totalCanais.adicionar(sbt);
		totalCanais.adicionar(globo);
		totalCanais.adicionar(sportv);
		totalCanais.adicionar(espn);

		espn.adicionar(new ListItem("Premier League", "Jogo do Campeonato Inglês", "11:30"));

		Channels channels = new Channels(totalCanais);
		channels.printList();

    }
    
}
