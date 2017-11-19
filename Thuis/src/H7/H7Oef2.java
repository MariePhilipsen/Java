package H7;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random getal = new Random();
		
		int[] randomGetallen = new int[500];
		long som = 0;
		
		for (int i = 0; i < randomGetallen.length; i++) {
			randomGetallen[i] = getal.nextInt();

		}
		
		for (int el : randomGetallen) {
			if (el > 100) {
				som += el;
			}
		}
		System.out.println(som);
	}

}
