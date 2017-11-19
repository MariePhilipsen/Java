package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef7 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Hoeveel km is de vlucht?"
				+ " Welke soort vlucht is het? (toeristenklasse = 1, charter = 2, zakenreis = 3");

		double prijs;

		double afstand = toetsenbord.nextInt();

		int soort = toetsenbord.nextInt();

		if (afstand < 1000) {
			prijs = afstand * 0.25;
		} else {
			if (afstand < 2999) {
				prijs = afstand * 0.20;
			} else {
				prijs = afstand * 0.12;
			}
		}
		switch (soort) {
		
		case 2:
			prijs = prijs - prijs * 20 / 100;
			break;
		case 3:
			prijs = prijs + prijs * 30 / 100;
		}

		System.out.println("De totale prijs is " + (int) prijs + " EUR");

	}

}
