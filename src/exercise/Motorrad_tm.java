package exercise;


public class Motorrad_tm {
	// variable
	int kmStand;
	int bauJahr;
	String marke;
	int leistung;
	
	// get & set
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
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public int getLeistung() {
		return leistung;
	}
	public void setLeistung(int leistung) {
		this.leistung = leistung;
		}

	// Konstruktor
	public Motorrad_tm(int kmStand, int bauJahr, String marke, int leistung) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.leistung = leistung;
	}
	
	// Methode
	public void showBikeInformation() {
		System.out.println("Kilometerstand:" + getKmStand());
		System.out.println("Baujahr: " + getBauJahr());
		System.out.println("Marke: " + getMarke());
		System.out.println("Leistung: " + getLeistung() + ("kW"));
		}
}

