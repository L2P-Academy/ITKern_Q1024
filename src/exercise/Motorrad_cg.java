package exercise;

public class Motorrad_cg {
	
	int kmStand;
	double doubleKmStand;
	int baujahr;
	double doubleBaujahr;
	String marke;
	int leistungKw;
	String leistungPs;
	int tankInhalt;
	double verbrauch;
	
	public int getTankInhalt() {
		return tankInhalt;
	}
	public void setTankInhalt(int tankInhalt) {
		this.tankInhalt = tankInhalt;
	}
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
//		System.out.println("Verbrauch = " + verbrauch);
		this.verbrauch = verbrauch;
	}
	public int getLeistungKw() {
		return leistungKw;
	}
	public void setLeistungKw(int leistungKw) {
		this.leistungKw = leistungKw;
	}
	public String getLeistungPs() {
		return leistungPs;
	}
	public int getLeistungPsInt() {
		double temp = Double.parseDouble(leistungPs);
		return (int) temp;
	}
	public void setLeistungPs(String leistungPs) {
		this.leistungPs = leistungPs;
	}
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke + " motorrad";
	}
	public double getDoubleKmStand() {
		return doubleKmStand;
	}
	public void setDoubleKmStand(double doubleKmStand) {
		this.doubleKmStand = doubleKmStand;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public double getDoubleBaujahr() {
		return doubleBaujahr;
	}
	public void setDoubleBaujahr(double doubleBaujahr) {
		this.doubleBaujahr = doubleBaujahr;
	}
	public void addDistance(int distance) {
		calcFuelConsumption(getLeistungPsInt());
//		if(verbrauch >= 18 || distance > 1000) {
		if(verbrauch >= 18 || ((18 / getVerbrauch()) * 100) < distance) {
			setTankInhalt(0);
			System.out.println(distance + " km gefahren, " + ((18 / getVerbrauch()) * 100) + " l verbraucht. Tank ist nun leer.");
		}
		setKmStand(kmStand += distance);
		System.out.println("Neuer kmStand: " + kmStand);
	}
	public Motorrad_cg(double kmStand, double bauJahr, String marke, int leistungKw, int tankinhalt) {
		this.doubleKmStand = kmStand;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungKw = leistungKw;
		this.leistungPs = calcKwToHp(leistungKw);
		this.tankInhalt = tankinhalt;
		calcFuelConsumption(this.getLeistungPsInt());
	}
	public Motorrad_cg(int kmStand, int bauJahr, String marke, int leistungKw, int tankinhalt) {
		this.kmStand = kmStand;
		this.doubleKmStand = kmStand;
		this.baujahr = bauJahr;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungKw = leistungKw;
		this.leistungPs = calcKwToHp(leistungKw);
		this.tankInhalt = tankinhalt;
		calcFuelConsumption(this.getLeistungPsInt());
	}
	public Motorrad_cg(double kmStand, double bauJahr, String marke, String leistungPs, int tankinhalt) {
		this.doubleKmStand = kmStand;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungPs = leistungPs;
		this.leistungKw = calcHpToKw(leistungPs);
		this.tankInhalt = tankinhalt;
		calcFuelConsumption(this.getLeistungPsInt());
	}
	public Motorrad_cg(int kmStand, int bauJahr, String marke, String leistungPs, int tankinhalt) {
		this.kmStand = kmStand;
		this.doubleKmStand = kmStand;
		this.baujahr = bauJahr;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungPs = leistungPs;
		this.leistungKw = calcHpToKw(leistungPs);
		this.tankInhalt = tankinhalt;
		calcFuelConsumption(this.getLeistungPsInt());
	}
	public Motorrad_cg() {}
	public void print() {
		System.out.println(this.toString());
	}
	public void getBikeInformation() {
		print();
	}
	@Override
	public String toString() {
		return ""
				+ "Motorrad_cg ["
				+ "\t\nKilometerstand=" + doubleKmStand
				+ ",\t\n Baujahr=" + doubleBaujahr
				+ ",\t\n Marke=" + marke
				+ ",\t\n Leistung [kw]=" + leistungKw + "\n"
				+ ",\t\n Leistung [ps]=" + leistungPs + "\n"
				+ ",\t\n Tankinhalt [l]=" + tankInhalt + "\n"
				+ ",\t\n Verbrauch / 100km [l]=" + verbrauch + "\n"
				+ "]";
	}
	public void printWithTab() {
		System.out.println("\tBaujahr: "+baujahr);
		System.out.println("\tKilometerstand: "+kmStand);
		System.out.println("\tLeistung [PS]: "+leistungPs);
		System.out.println("\tLeistung [KW]: "+leistungKw);
		System.out.println("\tTankinhalt [l]: "+tankInhalt);
		System.out.println("\tVerbrauch / 100km [l]: "+verbrauch);
		System.out.println("\tMarke: "+marke);
	}
	public void beispiel() {
		int count = 0;
		System.out.println();
		System.out.println("Meine Wunschliste:");
		System.out.println();
		Motorrad_cg obj1 = new Motorrad_cg(
				15000,
				2010,
				"bmw",
				50,
				18
				);
		System.out.println("Motorrad "+(++count)+":");
		obj1.printWithTab();
		obj1.setBaujahr(1990);
		obj1.addDistance(1050);
		obj1.setLeistungKw(40);
		obj1.setMarke("abc");
		if(obj1.isFuelEmpty()) {
			obj1.refillFuel();
		}
		System.out.println();
		System.out.println("Motorrad "+(count)+": (neue Werte)");
		obj1.printWithTab();
		obj1 = new Motorrad_cg(
				150000,
				2010,
				"yamaha",
				"60",
				25
				);
		obj1.addDistance(50);
		if(obj1.isFuelEmpty()) {
			obj1.refillFuel();
		}
		System.out.println();
		System.out.println("Motorrad "+(++count)+":");
		obj1.printWithTab();
	}
	private String calcKwToHp(double kw) {
		return String.valueOf(leistungKw * 1.341);
	}
	private String calcKwToHp(int kw) {
		return String.valueOf(kw * 1.341);
	}
	private int calcHpToKw(double ps) {
		
		return (int) (ps * 0.7457);
	}
	private int calcHpToKw(String ps) {
		double result = Double.valueOf(ps);
//		result = Double.parseDouble(ps);
		return (int) (result * 0.7457);
	}
	private boolean isFuelEmpty() {
		if(getTankInhalt() <= 0) {
			System.out.println("Tank ist leer! Bitte tanken!");
			return true;
		} else {
			System.out.println("Der Tank hat noch " + (getTankInhalt() - getVerbrauch()) + " Liter");
			return false;
		}
	}
//	private boolean isFuelEmpty() {
//		return tankInhalt <= 0;
//	}
	private void refillFuel() {
		setTankInhalt(18);
	}
	private void calcFuelConsumption(int leistungPs) {
		if(leistungPs < 5) {
			setVerbrauch(2.5);
		} else if(leistungPs >= 5 && leistungPs < 15) {
			setVerbrauch(3.5);
		} else if(leistungPs >= 15 && leistungPs < 48) {
			setVerbrauch(5.5);
		} else /* if(leistungPs > 48)*/ {
			setVerbrauch(6);
		}
	}
}
