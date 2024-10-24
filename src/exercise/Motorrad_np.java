/**
 * 
 */
package exercise;

import java.awt.Color;

/**
 * 
 */
public class Motorrad_np {
	
	// Pseudocode
	// Klasse 
	
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
		 * Konstruktor Motorrad_np(kmStand, baujahr, marke, farbe):
		 * 		setze Farbe auf farbe;
		 * 		setze Marke auf marke;
		 * 		setze Baujahr auf baujahr;
		 * 		setze KmStand auf kmStand;
		 */

	/**
	 * 
	 */
	
		
		
		/*
		 * 
		 * // Methode
		 * Methode fahren(zahl kilometer):
		 * 		setze kmStand auf kmStand und addiere kilometer;
		 */
		
		// Methode zum fahren und ändern des kmStandes
			

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
		public Motorrad_np(int kmStand, int bauJahr, String marke, Color farbe) {
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
	}
		


