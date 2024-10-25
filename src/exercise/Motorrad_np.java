package exercise;

import java.awt.Color;


public class Motorrad_np {

		
		int kmStand; 
		int bauJahr;
		int leistumg;
		String marke;
		Color farbe;	
		

		
		
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

		public int getLeistumg() {
			return leistumg;
		}

		public void setLeistumg(int leistumg) {
			this.leistumg = leistumg;
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
		
		
		
				public Motorrad_np(int kmStand, int bauJahr,int leistung, String marke, Color farbe) {
					this.kmStand = kmStand;
					this.bauJahr = bauJahr;
					this.leistumg=leistung;
					this.marke = marke;
					this.farbe = farbe;
				}
				
				
				
				public int fahren(int strecke) {
					int neuerKmStand = this.kmStand + strecke;
					return neuerKmStand;
				}
				
				
}
		


