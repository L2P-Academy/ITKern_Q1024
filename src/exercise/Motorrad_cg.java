package exercise;

public class Motorrad_cg {
	
	int kmStand;
	int bauJahr;
	String marke;
	int leistung;
	
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
	public Motorrad_cg(int kmStand, int bauJahr, String marke, int leistung) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.leistung = leistung;
	}
	public void getBikeInformation() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Motorrad_cg [kmStand=" + kmStand + ", bauJahr=" + bauJahr + ", marke=" + marke + ", leistung="
				+ leistung + "]";
	}
	
}
