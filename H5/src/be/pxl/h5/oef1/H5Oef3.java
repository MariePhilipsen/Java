package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Hoeveel km rij je per jaar? ");
		int aantalKmPerJaar = toetsenbord.nextInt();
		
		System.out.println("Wat is je verbruik in L per 100km? ");
		double verbruik = toetsenbord.nextDouble();
		
		System.out.println("Wat is de prijs van brandstof per L ");
		double prijs = toetsenbord.nextDouble();
		
		double totaalVerbruikskosten = (aantalKmPerJaar/100)*verbruik*prijs;
		
		double kostprijs = (verbruik/100)*prijs;
		
		System.out.println("De totale verbruikskosten per jaar zijn " + totaalVerbruikskosten + " EUR" + " De kostprijs per km is " + kostprijs + " EUR");
		
		toetsenbord.close();
		
	}

}
