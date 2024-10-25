package exercise;

public class Motorrad_yb {
    private final int baujahr;
    private final String marke;
    private int leistung;
    private int kilometerstand = 0;

    public Motorrad_yb(int baujahr, String marke, int leistung) {
        this.baujahr = baujahr;
        this.marke = marke;
        this.leistung = leistung;
    }

    public Motorrad_yb(int kilometerstand, int leistung, String marke, int baujahr) {
        this(baujahr, marke, leistung);
        this.kilometerstand = kilometerstand;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void showBikeInformation() {
        System.out.println("Marke: " + marke);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Leistung: " + leistung + " kW");
        System.out.println("Kilometerstand: " + kilometerstand + " km");
    }
}
