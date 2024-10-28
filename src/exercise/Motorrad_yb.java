package exercise;

public class Motorrad_yb {
    private static final double KW_IN_HP = 1.341;

    private final double baujahr;
    private final String marke;
    private int leistungKw;
    private String leistungPs;
    private double kilometerstand = 0;

    public Motorrad_yb(int baujahr, String marke, int leistung) {
        this.baujahr = baujahr;
        this.marke = marke;
        this.leistungKw = leistung;
    }

    public Motorrad_yb(int kilometerstand, int leistung, String marke, int baujahr) {
        this(baujahr, marke, leistung);
        this.kilometerstand = kilometerstand;
    }

    public double getBaujahr() {
        return baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public int getLeistungKw() {
        return leistungKw;
    }

    public void setLeistungKw(int leistungKw) {
        this.leistungKw = leistungKw;
    }

    public double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public String getLeistungPs() {
        return leistungPs;
    }

    public void setLeistungPs(String leistungPs) {
        this.leistungPs = leistungPs;
    }

    public void showBikeInformation() {
        System.out.println("Marke: " + marke);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Leistung: " + leistungKw + " kW");
        // Casting ist in diesem Fall nicht Sinnvoll, da die Anwender:in
        // ggf. den genauen Kilometerstand wissen möchte
        System.out.println("Kilometerstand: " + kilometerstand + " km");
    }

    public static double calcKwToHp (double kw) {
        return kw * Motorrad_yb.KW_IN_HP;
    }

    public static double calcHpToKw (double hp) {
        return hp / Motorrad_yb.KW_IN_HP;
    }
}
