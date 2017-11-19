package H7;

import java.util.Random;
import java.util.Scanner;

public class H7ExtraOef3 {

	public static void main(String[] args) {
			String[] roman = { "XL", "X", "IX", "V", " IV", "I" };
			Scanner keyboard = new Scanner(System.in);
			Random getal = new Random();
			int isKleinst = 0;
			int totaal = 0;
			int[] lijst = new int[4];

			System.out.print("geef letter : ");
			char letter = keyboard.next().charAt(0);
			System.out.println();

			for (char A = 'a'; A < letter; A++) {
				System.out.println(" reeks " + A);
				int waarde = getal.nextInt(49) + 1;
				totaal = 0;
				while (waarde > isKleinst) {
					if (waarde > isKleinst) {
						isKleinst = waarde;
					}
					System.out.println("het romeinse cijfer voor het getal " + waarde + " is "
							+ zetOmNaarRomeinsCijfer(waarde, roman));
					waarde = getal.nextInt(50) + 1;
					totaal += waarde;
				}
				if (totaal < 50) {
					lijst[0]++;
				} else {
					if (totaal < 70) {
						lijst[1]++;
					} else {
						if (totaal < 90) {
							lijst[2]++;
						} else {
							lijst[3]++;
						}
					}
				}
				isKleinst = 0;

			}
			System.out.println();
			for (int n : lijst) {
				System.out.println("Aantal reeksen met een som van gegenereerde getallen minder dan 50 :" + n);
			}
			keyboard.close();

		}

		public static String zetOmNaarRomeinsCijfer(int waarde, String[] roman) {
			String romeins = "";
			while (waarde != 0) {
				if (waarde >= 40) {
					romeins += roman[0];
					waarde -= 40;
				} else {
					if (waarde >= 10) {
						romeins += roman[1];
						waarde -= 10;
					} else {
						if (waarde == 9) {
							romeins += roman[2];
							waarde -= 9;
						} else {
							if (waarde >= 5) {
								romeins += roman[3];
								waarde -= 5;
							} else {
								if (waarde == 4) {
									romeins += roman[4];
									waarde -= 4;
								} else {
									romeins += roman[5];
									waarde -= 1;
								}
							}
						}
					}
				}

			}
			return romeins;
		}
	}

