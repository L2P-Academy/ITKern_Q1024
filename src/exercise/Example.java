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
		
		// komplexe Datentypen
		String text1 = new String("abc");		
		// oder 
		String text2 = "abc"; // -> ohne new klappt nur mit Strings!!!	
		
		// Strings und String-Operationen
		// absoluter Pfad:
		String absoluterPfad = "C:/user/name/.."; // -> führt öfter zu Problemen
		// relativer Pfad:
		String relativerPfad = "res/meinFoto.png";
		
		// Textlänge + Position (Index)
		String longText = " Das ist ein Text mit vielen mit Buchstaben ";
		System.out.println(longText);
		System.out.println("Die Textlänge ist: " + longText.length() + " Zeichen");
		System.out.println("Caps-Lock:" + longText.toUpperCase());
		System.out.println("Alles klein: " + longText.toLowerCase());
		System.out.println(longText.indexOf("mit")); // erstes Auftreten
		System.out.println(longText.lastIndexOf("mit")); // letztes Auftreten
		
		// "Konkatenation" = Anhängen
		// Variante 1: concat
		System.out.println(longText.concat(" und einem angehangenen Text!"));
		// Variante 2: +
		System.out.println(longText + " und einem angehangenen Text!");
		
		// Leerzeichen bzw. Zeichen entfernen/ersetzen
		System.out.println(longText.trim() + "ohne führende/abschließende Leerzeichen");
		// mit char
		System.out.println(longText.replace('e', 'a')); // alle e zu a (als char)
		// mit String
		System.out.println(longText.replace("a", "e")); // alle a zu e (als String)
		System.out.println(longText);
		// alle Leerzeichen entfernen
		System.out.println("Text ohne Leerzeichen: " + longText.replace(" ", "")); // alle Leerzeichen zu "nichts"
		
		System.out.println("Text beinhaltet Leerzeichen: " + longText.contains("Das")); // prüfe, ob die Zeichen vorkommen (true/false)
		System.out.println("Text leer: " + longText.isEmpty());
		
		// Vergleiche von Strings
		String shortText = new String("Kurzbeschreibung");
		System.out.println("Textinhalt vergleichen: " + shortText.equals(longText)); // vergleicht die Inhalte der Strings
		
		// Bedingungen & Vergleichsoperatoren
		int a = 5;
		int b = 10;
		
		// größer/kleiner/gleich
		if (a < b) {			
		}		
		if (a >= b) {			
		}
		
		// Und && 
		if (a == b && b > 5 && a > 2) {			
		}
		
		// Oder ||
		if (a == b || b > 5) {			
		}
		
		// Negation
		if (a != b) { // a ist ungleich b
			System.out.println("A ist ungleich B (einzeln)");
		}
		if (!(a==b)) { // negation eines Ausdrucks
			System.out.println("A ist ungleich B (gesamt)");
		}
		
		// NAND
		if (!(a == b && b > 5)) {			
		}
		
		// NOR
		if (!(a == b || b > 5)) {			
		}
		
		// komplexe Vergleiche
		String text = "";
		if (text.length() == 0) {			
		}
		
		if (text.isEmpty() && !shortText.isEmpty()) {
			System.out.println("Text1 ist leer, Text2 nicht");
		} else if (!text.isEmpty()) {
			System.out.println("Text1 ist nicht leer");
		} else {
			System.out.println("Bedingung nicht aufgelistet - alle anderen Fälle");
		}
		
		
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

