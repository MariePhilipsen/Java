package proefexamen;

import java.util.Scanner;

public class TestOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een even getal in");
		int eindGetal = keyboard.nextInt();
		int getal1 = eindGetal;

		while (eindGetal % 2 == 0) {
			for (int rij = 1; rij <= eindGetal / 2; rij++) {
				System.out.println(rij + " / " + getal1);
				getal1--;
			}
		} 
			
		while (eindGetal % 2 != 0) {
			
		System.out.println("geef een even getal in");
			eindGetal = keyboard.nextInt();
		}
		keyboard.close();
	}

}
