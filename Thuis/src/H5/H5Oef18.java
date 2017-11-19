package H5;

import java.util.Scanner;

public class H5Oef18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een getal");
		int getal = keyboard.nextInt();
		int faculteit = 1;

		while (getal != 0) {
			for (int i = 1; i <= getal; i++) {
				faculteit *= i;
			}
		System.out.println(faculteit);

		System.out.println("geef nog een getal");
		getal = keyboard.nextInt();
		}
		keyboard.close();
	}

}
