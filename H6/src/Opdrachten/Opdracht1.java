package Opdrachten;

import java.util.Random;

public class Opdracht1 {

	public static void main(String[] args) {
		Random willekeurig = new Random();
		
		int getal = willekeurig.nextInt(20);
		System.out.println(willekeurig);
		
		// 20 gehele getallen tussen 0 en 10 (incl)
		
		for(int i = 0; i < 20; i++) {
			getal = willekeurig.nextInt(11);
			System.out.println(getal);
		
		// 10 getallen tussen 20 en 30 (incl)
		// rand.next(int) (bovengrens-ondergrens + 1) +1
		// = enkel wanneer bovengrens inclusief is, kijken hoeveel getallen in het totaal gegenereerd moeten worden.
		}
		
		for(int i = 0; i < 20; i++) {
			getal = willekeurig.nextInt(30-20+1)+20;
			System.out.println(getal);

			
		}
	}

}
