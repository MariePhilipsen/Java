package be.pxl.h4.exoef1;

import java.util.Scanner;

public class H4ExOef1 {
	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		int klein;
		
		System.out.println("Geef een getal in");
		int getal = toetsenbord.nextInt();
		
		System.out.println("Geef nog een getal in");
		int tweedeGetal = toetsenbord.nextInt();
		
		if (getal < tweedeGetal) {
			klein = getal;
			
			
		} else {
			klein = tweedeGetal;
			
			
		}
		int kwadraat = klein*klein;
		System.out.println("het kleinste getal = " + klein + " het kwadraat = " + kwadraat);
		
		
		toetsenbord.close();
}
}
