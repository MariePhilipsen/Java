package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef6 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Hoeveel artikels wil je bestellen?");
		
		double eenheidsprijs = 11.5;
		double btw = 1.21;
		int aantal = toetsenbord.nextInt();
		float totaal = aantal * (float) eenheidsprijs * (float) btw;
		
		if (totaal > 1000) {
			totaal = totaal - totaal / 100 * 10;
		}	
		System.out.println("Je totaal is " + totaal);
		
		
		
		
		
	}

}
