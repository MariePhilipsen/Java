package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner toetsenbord = new Scanner(System.in);
		
		double eenheidsprijs = 11.5;
		int btw = 21;
		
		System.out.println("Hoeveel stuks wel je bestellen? ");
		
		int aantal = toetsenbord.nextInt();
		
		double btwBedrag = (aantal * eenheidsprijs)*btw/100;
		double prijs = aantal * eenheidsprijs + btwBedrag;
		double prijsExclBtw = aantal * eenheidsprijs;
		
		
		System.out.println("De totale prijs is " + prijs + " De prijs exclusief btw bedraagt " + prijsExclBtw + " Dus het BTW bedrag is " + btwBedrag);
		
		toetsenbord.close();
	}

}
