package be.pxl.h4.exoef2;

import java.util.Scanner;

public class H4ExOef2 {
	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Geef een getal in");

		int a = toetsenbord.nextInt();

		System.out.println("Geef nog een getal in");

		int b = toetsenbord.nextInt();

		System.out.println("Geef nog een getal in");
		int c = toetsenbord.nextInt();

		int som = a + b;

		if (som < 19) {
			som = a + b + c;
			System.out.println(som);
		} else {
			System.out.println("Te groot");
			
	toetsenbord.close();
	}
	}

}
