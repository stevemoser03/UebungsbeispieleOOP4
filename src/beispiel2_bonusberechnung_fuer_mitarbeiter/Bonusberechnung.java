package beispiel2_bonusberechnung_fuer_mitarbeiter;

public class Bonusberechnung {

	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	static int count=1;
	
	public Bonusberechnung(String vorname, String nachname, double gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
		this.mitarbeiternummer = count++;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public int getAlter() {
		return alter;
	}
	
	
	public double monatsAbrechnung(){
		double Jgehalt = gehalt*12;
			   Jgehalt = Jgehalt*0.8;
	
		if(Jgehalt >50_000){
			Jgehalt = Jgehalt - ((Jgehalt-50000)*0.6)-9000-3200-2000-1000; 
		}
		else if(Jgehalt<=50_000 && Jgehalt>30_000){
			Jgehalt = Jgehalt - ((Jgehalt-30_000)*0.45)-3200-2000-1000;
		}
		else if(Jgehalt<=30_000 && Jgehalt>20_000){
			Jgehalt = Jgehalt - ((Jgehalt-20_000)*0.32)-2000-1000;
		}
		else if(Jgehalt<=20_000 && Jgehalt>10_000){
			Jgehalt = Jgehalt - ((Jgehalt-10_000)*0.20)-1000;
		}
		else{
			Jgehalt = Jgehalt * 0.9;
		}
		gehalt = Jgehalt/12;
		return gehalt;
	}
	
	public double jahresAbrechnung(){
		double Jgehalt = gehalt*12;
		   Jgehalt = Jgehalt*0.8;

	if(Jgehalt >50_000){
		Jgehalt = Jgehalt - ((Jgehalt-50000)*0.6)-9000-3200-2000-1000; 
	}
	else if(Jgehalt<=50_000 && Jgehalt>30_000){
		Jgehalt = Jgehalt - ((Jgehalt-30_000)*0.45)-3200-2000-1000;
	}
	else if(Jgehalt<=30_000 && Jgehalt>20_000){
		Jgehalt = Jgehalt - ((Jgehalt-20_000)*0.32)-2000-1000;
	}
	else if(Jgehalt<=20_000 && Jgehalt>10_000){
		Jgehalt = Jgehalt - ((Jgehalt-10_000)*0.20)-1000;
	}
	else{
		Jgehalt = Jgehalt * 0.9;
	}
	return Jgehalt;
	}
	
	public double jahresAbrechnung(int monate){
		double Jgehalt = gehalt*monate;
		   	   Jgehalt = Jgehalt*0.8;

	if(Jgehalt >50_000){
		Jgehalt = Jgehalt - ((Jgehalt-50000)*0.6)-9000-3200-2000-1000; 
	}
	else if(Jgehalt<=50_000 && Jgehalt>30_000){
		Jgehalt = Jgehalt - ((Jgehalt-30_000)*0.45)-3200-2000-1000;
	}
	else if(Jgehalt<=30_000 && Jgehalt>20_000){
		Jgehalt = Jgehalt - ((Jgehalt-20_000)*0.32)-2000-1000;
	}
	else if(Jgehalt<=20_000 && Jgehalt>10_000){
		Jgehalt = Jgehalt - ((Jgehalt-10_000)*0.20)-1000;
	}
	else{
		Jgehalt = Jgehalt * 0.9;
	}
	return Jgehalt;
	}
	
	
	
}


