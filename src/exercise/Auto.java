
package exercise;

import java.awt.Color;

// Pseudocode
// Klasse Auto:
public class Auto {
	/* // Attribute (ohne Datentypen)
	 * KmStand;
	 * Baujahr;
	 * Marke;
	 * Farbe;
	 */
	
	// Attribute
	int kmStand; // -> beim "this" wird das hier verwendet
	int bauJahr;
	String marke;
	Color farbe;
	
	/*
	 * 
	 * // Konstruktor
	 * Konstruktor Auto(kmStand, baujahr, marke, farbe):
	 * 		setze Farbe auf farbe;
	 * 		setze Marke auf marke;
	 * 		setze Baujahr auf baujahr;
	 * 		setze KmStand auf kmStand;
	 */
	
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

	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

	// Konstruktor
	public Auto(int kmStand, int bauJahr, String marke, Color farbe) {
		this.kmStand = kmStand;
		this.bauJahr = bauJahr;
		this.marke = marke;
		this.farbe = farbe;
	}
	
	/*
	 * 
	 * // Methode
	 * Methode fahren(zahl kilometer):
	 * 		setze kmStand auf kmStand und addiere kilometer;
	 */
	
	// Methode zum fahren und ändern des kmStandes
	public int fahren(int strecke) {
		int neuerKmStand = this.kmStand + strecke;
		return neuerKmStand;		
	}
	
	public void showCarInfo() {
		System.out.println(getBauJahr());
		System.out.println(getKmStand());
		System.out.println(getMarke());
		System.out.println(getFarbe());
	}
}
