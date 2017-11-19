package H6;

import java.util.Random;
import java.util.Scanner;

public class H6ExtraOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een tekst voor encryptie");
		String tekst = keyboard.nextLine();
		Random getal = new Random();
		int randGetal = getal.nextInt(24 - 2 - 1) + 2;
		String encryptie;

		while (randGetal % 2 != 0) {
			randGetal = getal.nextInt(24 - 2 - 1) + 2;
		}
		encryptie = encrypteerTekst(tekst, randGetal);
		keyboard.close();
		System.out.println(encryptie);
	}

	public static String encrypteerTekst(String tekst, int randGetal) {
		StringBuilder encryptie = new StringBuilder();
		char huidigKarakter;
		for (int i = 0; i <= tekst.length(); i++) {
			huidigKarakter = tekst.charAt(i);
			huidigKarakter += randGetal;
			encryptie.append(huidigKarakter);
		}
		return encryptie.toString();
	}
}
