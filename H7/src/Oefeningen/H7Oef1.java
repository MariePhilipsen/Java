package Oefeningen;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal = 0;
		float som = 0;
		int kleiner = 0;
		float gemiddelde = 0;

		int[] getallenreeks = new int[15];
		for (int i = 0; i < getallenreeks.length; i++) {

			System.out.println("geef een getal in");
			getal = keyboard.nextInt();
			getallenreeks[i] = getal;
			}
			for (int a : getallenreeks) {
				System.out.println(a);
				som += a;
				
				gemiddelde = som / getallenreeks.length;
		
			if (getal < gemiddelde) {
				kleiner++;
				
			}
			
			System.out.printf("het gemiddelde is: %.1f", gemiddelde + ".");

		}
		

		System.out.println(" Er zijn " + kleiner + " getallen kleiner dan het gemiddelde");

		keyboard.close();
	}

}
