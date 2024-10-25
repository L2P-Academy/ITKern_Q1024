package exercise;

public class Motorrad_nn {
	int kmStand;
	int bauJahr;
	String marke;
	String leistung;

	/**
	 * @return the kmStand
	 */
	public int getKmStand() {
		return kmStand;
	}
	/**
	 * @param kmStand the kmStand to set
	 */
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	/**
	 * @return the bauJahr
	 */
	public int getBauJahr() {
		return bauJahr;
	}
	/**
	 * @param bauJahr the bauJahr to set
	 */
	public void setBauJahr(int bauJahr) {
		this.bauJahr = bauJahr;
	}
	/**
	 * @return the marke
	 */
	public String getMarke() {
		return marke;
	}
	/**
	 * @param marke the marke to set
	 */
	public void setMarke(String marke) {
		this.marke = marke;
	}
	/**
	 * @return the leistung
	 */
	public String getLeistung() {
		return leistung;
	}
	/**
	 * @param leistung the leistung to set
	 */
	public void setLeistung(String leistung) {
		this.leistung = leistung;
	}
	
	public Motorrad_nn(int kmStand, int bauJahr, String marke, String leistung) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.leistung = leistung;
	}
	
	public void getBikeInformation() {
		System.out.println("Kilometerstand: " + getKmStand());
		System.out.println("Baujahr: " + getBauJahr());
		System.out.println("Marke: " + getMarke());
		System.out.println("Leistung: " + getLeistung());
	}
	
}
