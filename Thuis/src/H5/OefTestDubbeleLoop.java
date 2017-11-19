package H5;

import java.util.Scanner;

public class OefTestDubbeleLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de grootte van de tabel");
		int grootte = keyboard.nextInt();

		for (int rij = 1; rij <= grootte; rij++) {
			System.out.print(rij + ":");

			for (int kol = 1; kol <= rij; kol++) {
				int berekening = rij * kol;
				System.out.print(berekening + " ");
			}
			System.out.println();
		}

		keyboard.close();
	}

}
