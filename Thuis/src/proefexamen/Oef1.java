package proefexamen;

import java.util.Scanner;

public class Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int laagsteTemp = 40;
		int totaalTemp = 0;
		int temperatuur = 0;
		double gemiddeldeTemp = (double) totaalTemp / 7;

		System.out.println("geef de temperatuur in");
		temperatuur = keyboard.nextInt();
		
		System.out.println("geef de hoeveelheid neerslag in");
		String neerslag = keyboard.next();
		
		for (int i = 1; i <= 6; i++) {

			while (neerslag != "overvloed") {
				System.out.println("geef de temperatuur in");
				temperatuur = keyboard.nextInt();

				totaalTemp += temperatuur;

				System.out.println("geef de hoeveelheid neerslag in");
				neerslag = keyboard.next();

				if (temperatuur < laagsteTemp) {
					laagsteTemp = temperatuur;
				}
			}
		}
		if (laagsteTemp > 15 && temperatuur > laagsteTemp / 100 * 20 && neerslag != "veel") {
			System.out.println("Joepie, we gaan op 2daagse!");
		} else {
			if (neerslag.equals("overvloed") == true) {
				System.out.println("spijtig we gaan niet op stap");
			} else {
				System.out.println("we gaan op daguitstap");
			}
		}
		keyboard.close();
	}
}
