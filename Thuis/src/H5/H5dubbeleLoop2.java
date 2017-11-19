package H5;

import java.util.Scanner;

public class H5dubbeleLoop2 {

	public static void main(String[] args) {
		int lengte = 6;
		int hoogte = 4;

		for (int rij = 1; rij <= hoogte; rij++) {
			for (int kol = 1; kol <= lengte; kol++) {
				if (rij == 1 || rij == hoogte || kol == 1 || kol == lengte) {

					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
