package exercise;

import java.util.Scanner;

public class SM_Exercise {
Scanner scanner = new Scanner(System.in);
	
	double einzelPreisVorRabatt, faktorRabatt;
	
	double gesamtPreisVorRabatt, gesamtPreisNachRabatt, gesamtErsparnis; 
	
	int anzahl; {
	
	System.out.println("Standardpreis für das Produkt eingeben (in €): ");
	einzelPreisVorRabatt = scanner.nextDouble();
	 System.out.println("Rabattfaktor für das Produkt eingeben (Bsp: 0.95):");
	faktorRabatt = scanner.nextDouble();
	
	System.out.println("Artikelanzahl eingeben:");
	anzahl = scanner.nextInt();
	
	scanner.close(); 
	
	gesamtPreisVorRabatt = einzelPreisVorRabatt * anzahl;
	
	gesamtPreisNachRabatt = gesamtPreisVorRabatt * faktorRabatt;
	
	gesamtErsparnis = gesamtPreisVorRabatt - gesamtPreisNachRabatt; 
	
	System.out.println("Gesamtpreis Standard:" + gesamtPreisVorRabatt + " €");
	System.out.println("Gesamtpreis Rabatt:" + gesamtPreisNachRabatt + " €");
	System.out.println("Gesamtpreis Insgesamt:" + gesamtErsparnis + " €");
	
	}}


}
