package exercise;

public class Motorrad_yb {
    private static final double KW_IN_HP = 1.341;

    private final double baujahr;
    private final String marke;
    private final double verbrauch;
    private final int leistungKw;
    private double kilometerstand = 0;
    private double tankInhalt;

    public Motorrad_yb(int baujahr, String marke, int leistungKw) {
        this.baujahr = baujahr;
        this.marke = marke;
        this.leistungKw = leistungKw;
        this.verbrauch = calcFuelConsumption(calcHpToKw(leistungKw));
    }

    public Motorrad_yb(int baujahr, String marke, int leistungKw, double kilometerstand) {
        this(baujahr, marke, leistungKw);
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

    public double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public double getLeistungPs() {
        return calcKwToHp(leistungKw);
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public void showBikeInformation() {
        System.out.println("Marke: " + marke);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Leistung: " + leistungKw + " kW, bzw. " + getLeistungPs() + " PS");
        System.out.println("Kilometerstand: " + kilometerstand + " km");
        System.out.println("Tankinhalt: " + tankInhalt + " L");
    }

    public boolean isFuelEmpty() {
        if (tankInhalt == 0) {
            System.out.println("Tank ist leer! Bitte tanken!");
            return true;
        }
        System.out.println("der Tank hat noch " + tankInhalt + " Liter");
        return false;
    }

    public void refillFuel() {
        this.tankInhalt = 18;
    }

    public static double calcKwToHp(double kw) {
        return kw * Motorrad_yb.KW_IN_HP;
    }

    public static double calcHpToKw(double hp) {
        return hp / Motorrad_yb.KW_IN_HP;
    }

    public static double calcFuelConsumption(double leistungPs) {
        if (leistungPs < 5) {
            return 2.5;
        }
        if (leistungPs < 15) {
            return 3.5;
        }
        if (leistungPs < 48) {
            return 4.5;
        }
        return 6;
    }
}
