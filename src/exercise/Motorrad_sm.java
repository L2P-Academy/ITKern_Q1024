package exercise;

public class Motorrad_sm  {
	
	int kmStand;
	int bauJahr;
	int Leistung;
	String marke;
	
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	public int getBauJahr() {
		return bauJahr;
	}
	public void setBauJahr(int bauJahr) {
		this.bauJahr = bauJahr;
	}
	public int getLeistung() {
		return Leistung;
	}
	public void setLeistung(int leistung) {
		Leistung = leistung;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	 public void showBikeInformation() {
	        System.out.println("Marke: " + marke);
	        System.out.println("Baujahr: " + bauJahr);
	        System.out.println("Leistung: " + Leistung + " kW");
	        System.out.println("Kilometerstand: " + kmStand + " km");
}}



	
	
		
		
	
	


