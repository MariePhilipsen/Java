package H5;

import java.util.Scanner;

public class H5Oef16 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		int snelsteRenner = 0;
		int snelsteTijd=50000;
		int totaalRenners = 0;
		int trageRenners = 0;
		int nummerSnelste= 0;
		
		System.out.println("geef inschrijvingsnr");
		int inschrijvingsnummer = keyboard.nextInt();
		
		while(inschrijvingsnummer > 0) {
			System.out.println("geef aantal seconden in");
			int tijd = keyboard.nextInt();
			
			if (tijd < snelsteTijd) {
				nummerSnelste = inschrijvingsnummer;
				snelsteTijd = tijd;
			}
			
			if(tijd > 3600) {
				trageRenners++;
			}
			totaalRenners++;
			System.out.println("geef inschrijvingsnr");
			inschrijvingsnummer = keyboard.nextInt();
		}
		double percentage = (double)trageRenners/totaalRenners*100;

		System.out.println("de snelste renner is renner met inschrijvingsnummer: "+ nummerSnelste);
		System.out.println(trageRenners);
		System.out.println(totaalRenners);
		System.out.println("het percentage van de renners dat er langer dan 1uur over doet is: "+ percentage);
		
		keyboard.close();
	}

}
