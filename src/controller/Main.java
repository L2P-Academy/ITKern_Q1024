package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
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
		
		}

}
