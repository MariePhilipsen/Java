package be.pxl.h4.oef5;

import java.util.Scanner;

public class H4Oef5 {
	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Hoeveel gram weegt een appel?");

		int gewicht = toetsenbord.nextInt();
		for (int aantal = 1; aantal < 100; aantal++) {
			System.out.println(aantal + "\t" + (aantal * gewicht));
		}
		toetsenbord.close();
	}
}
