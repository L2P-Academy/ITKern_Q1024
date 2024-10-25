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
	public Motorrad_cg() {}
	public void print() {
		System.out.println(this.toString());
	}
	public void getBikeInformation() {
		print();
	}
	@Override
	public String toString() {
		return "Motorrad_cg [\t\nKilometerstand=" + kmStand + ",\t\n Baujahr=" + bauJahr + ",\t\n Marke=" + marke + ",\t\n Leistung="
				+ leistung + " ps\n]";
	}
	public void printWithTab() {
		System.out.println("\tBaujahr: "+this.getBauJahr());
		System.out.println("\tKilometerstand: "+this.getKmStand());
		System.out.println("\tLeistung: "+this.getLeistung()+" ps");
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
		obj1.setBauJahr(1990);
		obj1.setKmStand(1000);
		obj1.setLeistung(40);
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
}
