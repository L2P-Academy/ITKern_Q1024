package launcher;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import exercise.Auto;
import exercise.CB_Rocco;
import exercise.Example;
import exercise.Motorrad_tm;

// DO NOT PUSH THIS CLASS
public class Main {  

	public static void main(String[] args) {

		/*
		Auto bmw = new Auto(10000, 1989, "bmw", Color.BLACK); // Objekt erzeugen
		System.out.println("Alter Stand:" + bmw.getKmStand());
		bmw.setKmStand(bmw.getKmStand() + 500);
		System.out.println(bmw.getFarbe()); // hole die aktuelle Farbe
		bmw.setFarbe(Color.BLUE); // ändere die farbe (setzen) auf blau
		System.out.println(bmw.getFarbe()); // hole die aktuelle Farbe
		*/
		
		Motorrad_tm kawasaki = new Motorrad_tm(20000, 2000, "Kawasaki", 125);
		System.out.println(kawasaki.getLeistung());
		kawasaki.setLeistung(500);
		System.out.println(kawasaki.getLeistung());
		kawasaki.setKmStand(kawasaki.getKmStand() + 15000);
		System.out.println(kawasaki.getKmStand());
		
		kawasaki.showBikeInformation();
		
		
		
				
		}

}
