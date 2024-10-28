package exercise;

import java.nio.file.Path;
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
		double genaueKommazahl = 128;
		
		// weitere Datentypen
		boolean wahrheitsWert = true; // oder false
		char buchstabe = 'a';
		
		// Type-Casting = Umwandlung von Datentypen
		// Allgemeines Vorgehen: (gewünschter Datentyp) alterDatentyp
		// Numerische Umwandlung meist unkompliziert
		
		System.out.println("Genaue Kommazahl: " + genaueKommazahl);
		int cutNumber = (byte) genaueKommazahl;
		System.out.println("Abgeschnittene Zahl: " + cutNumber);
		double longerNumber = (double) cutNumber;
		System.out.println("Kommazahl aus Ganzzahl: " + longerNumber);
		
		// int oneOrZero = (int) wahrheitsWert; -> nicht machbar
		
		// Nicht-numerisches Casting (Textbasiert), komplexe Datentypen
		// String charToString = (String) buchstabe; -> nicht machbar
		// Verwenden der String-Klasse:
		String charToString1 = String.valueOf(buchstabe);
		
		// Verwenden der Character-Klasse (Wrapper-Klasse):
		String charToString2 = Character.toString(buchstabe);
		
		// Hinzufügen einer leeren Zeichenkette (leer = ohne Leerzeichen)
		String charToString3 = buchstabe + " ";
		
		System.out.println("Ein String aus einem Char: " + charToString3);
		
		// Strings
		// absoluter Pfad:
		String absoluterPfad = "C:/user/name/.."; // -> führt öfter zu Problemen
		// relativer Pfad:
		String relativerPfad = "res/meinFoto.png";		
		
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
		//System.out.println(hauptStaedte.get("Deutschland"));
		
		// alle Werte der Hashmap ausgeben
		//System.out.println(hauptStaedte);
		
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
     
}

