package exercise;

public class Motorrad_cg {
	
	int kmStand;
	double doubleKmStand;
	int baujahr;
	double doubleBaujahr;
	String marke;
	int leistungKw;
	String leistungPs;
	
	public int getLeistungKw() {
		return leistungKw;
	}
	public void setLeistungKw(int leistungKw) {
		this.leistungKw = leistungKw;
	}
	public String getLeistungPs() {
		return leistungPs;
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
		this.marke = marke;
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
	public Motorrad_cg(double kmStand, double bauJahr, String marke, int leistungKw) {
		this.doubleKmStand = kmStand;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungKw = leistungKw;
		this.leistungPs = calcKwToHp(leistungKw);
	}
	public Motorrad_cg(int kmStand, int bauJahr, String marke, int leistungKw) {
		this.kmStand = kmStand;
		this.doubleKmStand = kmStand;
		this.baujahr = bauJahr;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungKw = leistungKw;
		this.leistungPs = calcKwToHp(leistungKw);
	}
	public Motorrad_cg(double kmStand, double bauJahr, String marke, String leistungPs) {
		this.doubleKmStand = kmStand;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungPs = leistungPs;
		this.leistungKw = calcHpToKw(leistungPs);
	}
	public Motorrad_cg(int kmStand, int bauJahr, String marke, String leistungPs) {
		this.kmStand = kmStand;
		this.doubleKmStand = kmStand;
		this.baujahr = bauJahr;
		this.doubleBaujahr = bauJahr;
		this.marke = marke + " motorrad";
		this.leistungPs = leistungPs;
		this.leistungKw = calcHpToKw(leistungPs);
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
				+ "]";
	}
	public void printWithTab() {
		System.out.println("\tBaujahr: "+this.getBaujahr());
		System.out.println("\tKilometerstand: "+this.getKmStand());
		System.out.println("\tLeistung: "+this.getLeistungKw()+" ps");
		System.out.println("\tMarke: "+this.getMarke());
	}
	public void beispiel() {
		System.out.println();
		System.out.println("Meine Wunschliste:");
		System.out.println();
		Motorrad_cg obj1 = new Motorrad_cg(
				15000,
				2010,
				"bmw",
				50
				);
		obj1.print();
		obj1.setBaujahr(1990);
		obj1.setKmStand(1000);
		obj1.setLeistungKw(40);
		obj1.setMarke("abc");
		obj1.print();
		Motorrad_cg obj2 = new Motorrad_cg(
				150000,
				2020,
				"yamaha",
				60
				);
		obj2.print();
		System.out.println();
		System.out.println("Motorrad 1:");
		obj1.printWithTab();
		System.out.println();
		System.out.println("Motorrad 2:");
		obj2.printWithTab();
	}
	String calcKwToHp(double kw) {
		return String.valueOf(leistungKw * 1.341);
	}
	String calcKwToHp(int kw) {
		return String.valueOf(kw * 1.341);
	}
	int calcHpToKw(double ps) {
		return (int) (ps * 0.7457);
	}
	int calcHpToKw(String ps) {
		double result = Double.valueOf(ps);
		return (int) (result * 0.7457);
	}
}
