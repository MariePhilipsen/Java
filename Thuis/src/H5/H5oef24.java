package H5;

import java.util.Scanner;

public class H5oef24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantal;
		int genreNummer;
		int ster;
		int jaar;
		int tijdInMin;
		int huurTijd;
		double huurPrijs;
		double totaleKostprijs = 0;
		double gemiddeldeKostprijs;
		
		System.out.println("Geef het aantal films in");
		aantal = keyboard.nextInt();
		
		for (int i = 1; i <= aantal; i++) {
		System.out.println("Geef het genrenummer in (getal bestaande uit 5 cijfers)");
		genreNummer = keyboard.nextInt();
		
		System.out.println("Geef het aantal sterren in");
		ster = keyboard.nextInt();
		
		System.out.println("geef jaar van uitgave in");
		jaar = keyboard.nextInt();
		
		System.out.println("geef speeltijd in minuten in");
		tijdInMin = keyboard.nextInt();
		
		huurPrijs = berekenPrijs(ster, jaar, genreNummer,
		tijdInMin);
		
		totaleKostprijs = totaleKostprijs + huurPrijs;
		
		huurTijd = berekenTijd(jaar, ster, genreNummer);
		System.out.print("Film" + i + " €" + huurPrijs + " " + huurTijd);
		
		if (huurTijd == 1) {
		System.out.println(" dag");
		} else
		System.out.println(" dagen");
		}
		gemiddeldeKostprijs = totaleKostprijs / aantal;
		
		System.out.println("Te betalen: € " + totaleKostprijs);
		System.out.println("Gemiddelde kostprijs per film: € " + gemiddeldeKostprijs);
		
		keyboard.close();
		}

	public static double berekenPrijs(int ster, int jaar, int genreNummer, int tijd) {
		double prijs;
		if (genreNummer / 10000 == 1) {
			prijs = 0.005 * tijd;
		} else {
			if (ster == 1) {
				prijs = 3;
			} else if (ster <= 3) {
				prijs = 3.75;
			} else {
				prijs = 4.5;
			}
			if (2017 - jaar > 10) {
				prijs = prijs - 0.5;
			}
		}
		return prijs;
	}

	public static int berekenTijd(int jaar, int ster, int genreNummer) {
		if (2017 - jaar <= 2 && (ster == 5 || genreNummer / 10000 == 5)) {
			return 1;
		} else {
			return 2;
		}
	}
}
