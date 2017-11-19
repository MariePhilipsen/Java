package H7;

import java.util.Random;
import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int som = 0;
		int aantalKleiner=0;
		int gemiddelde;
		float percentKleiner;
		int[] getallen = new int[15];
		
		for(int i = 0; i < getallen.length; i++) {
			System.out.print("geef een getal in");
			getallen[i]=keyboard.nextInt();
		}
		for(int n : getallen) {
			som += n;
		}
		gemiddelde = som / getallen.length;
		
		for(int n : getallen) {
			if(n < gemiddelde) {
				aantalKleiner++;
			}
		}
		
		percentKleiner = (float)aantalKleiner / getallen.length * 100;
		
		System.out.printf("Het gemiddelde is %d en het percentage kleiner dan het gemiddelde is %.2f", gemiddelde, percentKleiner);
		
		keyboard.close();
	}

}