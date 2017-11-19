package H6;

import java.util.Random;

public class OefRandom {

	public static void main(String[] args) {
		Random willekeurig = new Random();

		for (int i = 20; i < 40; i++) {
			int getal = willekeurig.nextInt(40);

			System.out.println(getal);
		}
	}
}
