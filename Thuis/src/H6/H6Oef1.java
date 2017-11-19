package H6;

import java.util.Random;

public class H6Oef1 {

	public static void main(String[] args) {

		Random getal = new Random();
		char a = 'A';

		for (int j = 1; j <= 5; j++) {
			System.out.println("reeks " + a);
			System.out.println();
			a++;

			for (int i = 1; i <= 10; i++) {
				int getal1 = getal.nextInt(20) ;
				int getal2 = getal.nextInt(20);
				
				if (getal1>getal2) {
					int resultaat = getal1 - getal2;
					System.out.println(i + ") " + getal1 + " - " + getal2 + " = " + resultaat);
				} else {
					int resultaat = getal2 - getal1;
					System.out.println(i + ") " + getal2 + " - " + getal1 + " = " + resultaat);
				}
			}
			System.out.println();
		}

	}
}