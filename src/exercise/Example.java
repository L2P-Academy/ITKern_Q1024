package exercise;

public class Example {
	public int ganzZahl;

	// public -> Sichtbarkeit, int -> Rückgabetyp, zahl1/zahl2 -> Übergabeparameter
	// return -> Rückgabeanweisung (Wert = result)
	public int calculateRectangleArea(int zahl1, int zahl2) {
		int result = zahl1 * zahl2;
		return result;
	}
	
	// Getter & Setter = Holen & Setzen -> Zugriffsmethode / Akzessor
	public int getGanzZahl() {
		return ganzZahl;
	}

	public void setGanzZahl(int ganzZahl) {
		this.ganzZahl = ganzZahl;
	}
	
}

