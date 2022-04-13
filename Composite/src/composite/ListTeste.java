package composite;

public class ListTeste {

    public static void main(String[] args) {
        
        //Primeiro criamos todos os objetos do List
		ListComponents globo = new List ("PANCAKE HOUSE List", "Breakfast");
		ListComponents sbt = new List ("DINER List", "Lunch");
		ListComponents sportv = new List ("CAF� List", "Lunch");
		ListComponents espn = new List ("DESSERT List", "Lunch");
		
		ListComponents totalCanais = new List ("ALL ListS", "ALL ListS COMBINED");

    }
    
}
