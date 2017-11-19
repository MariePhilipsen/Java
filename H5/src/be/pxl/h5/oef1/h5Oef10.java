package be.pxl.h5.oef1;

import java.io.InputStream;
import java.util.Scanner;

public class h5Oef10 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner (System.in);
		
		System.out.println("Wat is je bruto jaarwedde?");
		float jaarwedde = toetsenbord.nextFloat();
		
		System.out.println("Welke beoordelingscode kreeg je? (cijfer tussen 1-4");
		int beoordelingscode = toetsenbord.nextInt();
		
		float vastPremiebedrag = jaarwedde/20;
		float variabelPremiebedrag, eindejaarspremie;
		
		
		switch (beoordelingscode) {
		
		case 1: variabelPremiebedrag = 0;
		eindejaarspremie = vastPremiebedrag;
		break;
		
		case 2: variabelPremiebedrag = vastPremiebedrag/100*18;
		eindejaarspremie = vastPremiebedrag + variabelPremiebedrag;
		break;
		
		case 3: variabelPremiebedrag = vastPremiebedrag/100*25;
		eindejaarspremie = vastPremiebedrag + variabelPremiebedrag;
		break;
		
		default: variabelPremiebedrag = vastPremiebedrag/100*33;
		eindejaarspremie = vastPremiebedrag + variabelPremiebedrag;
		break;
		
		}
		
		System.out.println("je totale eindejaarspremie bedraagt " + eindejaarspremie);
	}

}
