package be.pxl.h4.oef3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class H4Oef3 {

	public static void main(String[] args) {

		int aantal, eenheidsprijs, totaalprijs, korting;
		korting = 10;

		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Hoeveel stuks?");
		aantal = toetsenbord.nextInt();

		System.out.println("eenheidsprijs");
		eenheidsprijs = toetsenbord.nextInt();

		totaalprijs = aantal * eenheidsprijs;

		if (totaalprijs > 500) {
			totaalprijs = totaalprijs - korting;
		}
		System.out.println("de totale prijs bedraagt " + totaalprijs + " Euro.");
		
		toetsenbord.close();
	}
}
