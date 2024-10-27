package exercise;


public class Motorrad_tm {
	// variable
	int kmStand;
	int bauJahr;
	String marke;
	int leistungKw;
	int leistungPS;
	double doubleKmStand = kmStand;
	double doubleBauJahr = bauJahr;
	double psFactor = 1.6;
	double kwFactor = 0.746;
	
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
	public int getLeistungKw() {
		return leistungKw;
	}
	public void setLeistungKw(int leistungKw) {
		this.leistungKw = leistungKw;
		}
	public double getDoubleKmStand() {
		return doubleKmStand;
	}
	public void setDoubleKmStand(double doubleKmStand) {
		this.doubleKmStand = doubleKmStand;
	}
	public double getDoubleBauJahr() {
		return doubleBauJahr;
	}
	public void setDoubleBauJahr(double doubleBauJahr) {
		this.doubleBauJahr = doubleBauJahr;
	}
	public int getLeistungPS() {
		return leistungPS;
	}
	public void setLeistungPS(int leistungPS) {
		this.leistungPS = leistungPS;
	}
	// Konstruktor
	public Motorrad_tm(int kmStand, int bauJahr, String marke, int leistungKw) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.leistungKw = leistungKw;
	}
	// Umrechnung kW-PS
	public double calcKwToPS (double ps) {
		double result = leistungKw * psFactor;
		return result;
	}
	// Umrechnung PS-Kw
	public double calcPsToKw (double kw) {
		double result = (??) * kwFactor;
		return result;
	}
	// Methode
	public void showBikeInformation() {
		System.out.println("Kilometerstand:" + getKmStand());
		System.out.println("Kilometerstand:" + getDoubleKmStand());
		System.out.println("Baujahr: " + getBauJahr());
		System.out.println("Baujahr: " + getDoubleBauJahr());
		System.out.println("Marke: " + getMarke());
		System.out.println("Leistung: " + getLeistungKw() + ("kW"));
		//System.out.println("Leistung: " + calcKwToPS() + ("PS"));
		System.out.println(ps);
	}
}

