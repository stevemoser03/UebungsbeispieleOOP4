package beispiel1_abschreibung;

public class Anlage {

	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initialWert;
		this.alter = 0;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}
	
	public double getRestWert(){
		return restWert;
	}
	
	public int getAlter(){
		return alter;
	}
	
	public void abschreiben(){
		alter ++;
		if(alter <= nutzungsdauer){
			restWert = Math.floor(initialWert/nutzungsdauer*(nutzungsdauer-alter));
		}
	}
		
	public void simulate(int maxJahre, int minWert){
		int x = 0;
		while(restWert!=0 && x!=maxJahre && restWert>minWert){
			abschreiben();
			x++;
			System.out.println(restWert+" "+x+". Jahr");
		}	
	}
	
	public Anlage renew(int zusatzWert, int zusatzJahre){
			
		Anlage newAnlage = new Anlage(bezeichnung,
						getRestWert() + zusatzWert,
						getNutzungsdauer() - getAlter() + zusatzJahre
				);
		return newAnlage;
		
	}
	
}
