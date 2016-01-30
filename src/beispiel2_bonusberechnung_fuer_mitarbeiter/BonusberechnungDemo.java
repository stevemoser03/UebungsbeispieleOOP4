package beispiel2_bonusberechnung_fuer_mitarbeiter;

public class BonusberechnungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bonusberechnung steve = new Bonusberechnung ("Stefan","Moser",2_700.0);
		Bonusberechnung meli = new Bonusberechnung ("Melanie","Moser",3_000.0);
		System.out.println("lfd Nr. "+steve.getMitarbeiternummer()+" "+steve.getVorname()+" "+steve.getNachname()+" ");
		System.out.println("lfd Nr. "+meli.getMitarbeiternummer()+" "+meli.getVorname()+" "+meli.getNachname()+" ");
		System.out.println(steve.monatsAbrechnung());
		System.out.println(steve.jahresAbrechnung(6));
		System.out.println(meli.monatsAbrechnung());
	}

}
