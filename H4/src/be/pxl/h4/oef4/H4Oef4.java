package be.pxl.h4.oef4;

import java.util.Scanner;

public class H4Oef4 {
	public static void main(String[] args) {
		int jaartal, rating, basisprijs = 5, totalePrijs = 0;

		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Van welk jaar is de film");
		jaartal = toetsenbord.nextInt();

		System.out.println("Welke rating heeft de film (Geef een cijfer tussen 1-5?)");
		rating = toetsenbord.nextInt();

		if (jaartal > 2015) {
			basisprijs = basisprijs + 1;
		}
		if (rating > 3) {
			basisprijs = basisprijs + 2;
		}

		if (basisprijs > 7) {
			basisprijs = 7;
		}
		System.out.println("de prijs van de film is " + basisprijs + " Euro");
		
		toetsenbord.close();
	}

}
