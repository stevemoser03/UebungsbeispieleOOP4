package beispiel1_abschreibung;

public class AnlageDemo {
	
	public static void main(String [] args){

	Anlage Mac = new Anlage("Mac Book", 1000.0 , 5);
	Mac.simulate(5,500);
	
	Anlage newAnlage = Mac.renew(1500, 10);
	
	System.out.println(newAnlage.getRestWert());
	
	}
	
}
