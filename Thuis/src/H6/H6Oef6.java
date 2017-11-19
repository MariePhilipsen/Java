package H6;

import java.util.Scanner;

public class H6Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de naam van de verkoper");
		String naamVerkoper = keyboard.nextLine();
		
		System.out.println("geef de hoogte");
		float hoogte = keyboard.nextFloat();
		
		System.out.println("geef de breedte");
		float breedte = keyboard.nextFloat();
		
		float opp = berekenOpp(hoogte, breedte);
		int gewichtAlluminium = 11;
		float gewicht = berekenGewicht(opp, gewichtAlluminium);
		String typeMotor = "";
		double prijsMotor = berekenPrijsMotor(typeMotor);
		double prijsPoort = berekenPrijsPoort(opp, prijsMotor);
		double totalePrijs = 0;
		
		berekenOfferteNummer(naamVerkoper,totalePrijs);
		controleHoogte(hoogte);
		controleBreedte(breedte);

		if (gewicht > 300) {
			typeMotor = "A105";
		} else {
			if (gewicht > 150) {
				typeMotor = "X300";
			} else {
				typeMotor = "A101";
			}
		}
		System.out.println("is er een speciale kleur gewenst? ja/nee?");
		String kleur = keyboard.nextLine();
		boolean specialeKleur;
		if(kleur.equals("ja")) {
			specialeKleur = true;
			totalePrijs = prijsPoort + (prijsPoort/100*10);
		}else {
			specialeKleur = false;
			totalePrijs = prijsPoort;
		}

		keyboard.close();
	}

	public static float controleHoogte(float hoogte) {
		while (hoogte < 2 || hoogte > 6.5) {
			System.out.println("Geef een geldige hoogte in");
		}
		return hoogte;
	}

	public static float controleBreedte(float breedte) {
		while (breedte < 2 || breedte > 8) {
			System.out.println("Geef een geldige breedte in");
		}
		return breedte;
	}

	public static float berekenOpp(float breedte, float hoogte) {
		float opp;
		opp = breedte * hoogte;
		return opp;
	}

	public static float berekenGewicht(float opp, int gewichtAlluminium) {
		float gewicht;
		gewicht = opp * gewichtAlluminium;
		return gewicht;
	}

	public static double berekenPrijsMotor(String typeMotor) {
		double prijsMotor;
		if (typeMotor.equals("A101")) {
			prijsMotor = 120;
		} else {
			if (typeMotor.equals("A105")) {
				prijsMotor = 220.5;
			} else {
				prijsMotor = 250.5;
			}
		}
		return prijsMotor;
	}

	public static double berekenPrijsPoort(float opp, double prijsMotor) {
		double prijsPoort;
		prijsPoort = opp * 113.5 + prijsMotor;

		return prijsPoort;
	}
	
	public static void berekenOfferteNummer(String naamVerkoper, double totalePrijs) {
		StringBuilder totaal = new StringBuilder();
		totaal.append(totalePrijs);
		
		System.out.printf( "2016_%s_%f", naamVerkoper.toUpperCase(),totaal.reverse());
		
	}
}
