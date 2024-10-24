package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example {
	public int ganzZahl;
	
	public void demonstration() {
		System.out.println("Hallo Teilnehmer!");
		
		// primitive Datentypen (numerisch), Ganzzahl
		byte ganzKleineZahl = 127;
		short kleineZahl = 32767;
		int ganzZahl = 2123456789;
		long grosseZahl = 9223372036854775807L;
		
		// Dezimalzahlen
		float ungenaueKommazahl = 3.14159f;
		double genaueKommazahl = 3.333333333333333333;
		
		// weitere Datentypen
		boolean wahrheitsWert = true; // oder false
		char buchstabe = 'a';
		
		// komplexe Datentypen
		String text1 = new String("abc");
		// oder 
		String text2 = "abc"; // -> ohne new klappt nur mit Strings!!!
		List<String> list = new ArrayList<>();
		HashMap<String, String> hauptStaedte = new HashMap<>();
		hauptStaedte.put("Deutschland", "Berlin");
		hauptStaedte.put("Griechenland", "Athen");
		hauptStaedte.put("Polen", "Warszawa");
		hauptStaedte.put("Somalia", "Mogadischu");
		hauptStaedte.put("Peru", "Lima");
		hauptStaedte.put("Türkei", "Ankara");
		
		// Einen Wert aus der Hashmap erhalten (über Key)
		System.out.println(hauptStaedte.get("Deutschland"));
		
		// alle Werte der Hashmap ausgeben
		System.out.println(hauptStaedte);
		
		// Klassenreferenzierung (Klassenobjekt) und Aufruf einer fremden Methode
		Example example = new Example();
		int result = example.calculateRectangleArea(5, 10);
		// Ganz schlechte Praxis!
		example.ganzZahl = 5;
		
		// Besser mit Set & Get:
		example.setGanzZahl(5); // setze die Zahl in der Example-Klasse
		int exampleNumber = example.getGanzZahl(); // hole die gesetzte Zahl aus der Example-Klasse
		
	}

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
	
	
	  int S1 = 236;
      double S2 = 13524687464674.0;
      long S3 = 13_544;
      
      
  
  
  public static void main (int S1 , double S2)   {
    
      System.out.println("Der Flächeninhaltet beträgt:"+ (long)(S1*S2)+" Meter²"); //casten
      
  }
  public static void main (int S1 , double S2, long S3)   {
    
      System.out.println("Das Volumen beträgt:"+(long)(S1*S2*S3)+" Meter³");

      int x = 1;
      int y =++x+x++;
      System.out.println(y);
  }
}

