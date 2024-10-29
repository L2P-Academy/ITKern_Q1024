package exercise;

public class Motorrad_nn {
	int kmStand;
	int bauJahr;
	String marke;
	int leistungKw;
	int leistungPs;
	int tankInhalt;
	double verbrauch;

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
	 * @return the leistungKw
	 */
	public int getLeistungKw() {
		return leistungKw;
	}
	/**
	 * @param leistungKw the leistungKw to set
	 */
	public void setLeistungKw(int leistungKw) {
		this.leistungKw = leistungKw;
	}
	/**
	 * @return the leistungPs
	 */
	public int getLeistungPs() {
		return leistungPs;
	}
	/**
	 * @param leistungPs the leistungPs to set
	 */
	public void setLeistungPs(int leistungPs) {
		this.leistungPs = leistungPs;
	}
	/**
	 * @return the tankInhalt
	 */
	public int getTankInhalt() {
		return tankInhalt;
	}
	/**
	 * @param tankInhalt the tankInhalt to set
	 */
	public void setTankInhalt(int tankInhalt) {
		this.tankInhalt = tankInhalt;
	}
	/**
	 * @return the verbrauch
	 */
	public double getVerbrauch() {
		return verbrauch;
	}
	/**
	 * @param verbrauch the verbrauch to set
	 */
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public Motorrad_nn(
			int kmStand,
			int bauJahr,
			String marke,
			int leistungKw,
			int leistungPs,
			int tankInhalt
	) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.leistungKw = leistungKw;
		this.leistungPs = leistungPs;
		this.tankInhalt = tankInhalt;
	}

	// Umwandeln kmStand und bauJahr zu double
	// 3. Typecasting für KmStand ist sinnvoll, weil KmStand kann Dezimalstellen enthalten
	// Baujahr ist immer eine Ganzzahl und muss nicht ein Double sein 
	double doubleKmStand = (double) getKmStand();
	double doubleBauJahr = (double) getBauJahr();

	public void getBikeInformation() {
		System.out.println("Kilometerstand: " + getKmStand());
		System.out.println("Baujahr: " + getBauJahr());
		System.out.println("Marke: " + getMarke() + " Motorrad");
		System.out.println("LeistungKw: " + getLeistungKw());
		System.out.println("LeistungPs: " + getLeistungPs());
		System.out.println("TankInhalt: " + getTankInhalt());
		// Ausgeben double Vars auf der Konsole
		System.out.println("DoubleKmStand: " + doubleKmStand);
		System.out.println("DoubleBauJahr: " + doubleBauJahr);
	}

	public double calcKwToPs (double kw) {
		return kw * 1.341;
	}

	public double calcPsToKw (double ps) {
		return ps * 0.7457;
	}
	
	public boolean isFuelEmpty () {
		boolean isEmpty = getTankInhalt() <= 0;
		int tankInhaltJetzt = getTankInhalt();
		if (isEmpty) {
			System.out.println("Tank ist leer! Bitte tanken!");
			return true;
		} else {
			System.out.println("der Tank hat noch " + tankInhaltJetzt + " Liter");
			return false;
		}
	}
	
	public void refillFuel () {
		setTankInhalt(18);
	}
	
	public void calcFuelConsumption(int leistungPs) {
		if ( leistungPs <= 5 ) {
			System.out.println("Verbrauch 2,5 Liter / 100km");
			setVerbrauch(2.5);
		} else if ( leistungPs > 5 && leistungPs <= 15 ) {
			System.out.println("Verbrauch 3,5 Liter / 100km");
			setVerbrauch(3.5);
		} else if (leistungPs > 15 && leistungPs <= 48) {
			System.out.println("Verbrauch 4,5 Liter / 100km");
			setVerbrauch(4.5);
		} else {
			System.out.println("Verbrauch 6 Liter / 100km");
			setVerbrauch(6);
		}
	} 

}
