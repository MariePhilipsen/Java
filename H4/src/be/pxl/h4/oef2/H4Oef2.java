package be.pxl.h4.oef2;

import java.util.Scanner;

public class H4Oef2 {

	public static void main(String[] args) {

		int a, b, uitkomst;
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Geef een getal in");
		a = toetsenbord.nextInt();
		System.out.println("Geef nog een getal in");
		b = toetsenbord.nextInt();

		if (a > b) {
			uitkomst = (a-b);
			System.out.println(uitkomst * 5);
		} else {
			uitkomst = (b-a);
			System.out.println(uitkomst* 5);
		}
		
		
		toetsenbord.close();
	}
}
