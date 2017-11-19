package H6;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random willekeurig = new Random();
		
		int dice = 0;
		
		dice = willekeurig.nextInt(50-20-1) + 1;
		
		System.out.println(dice);
	}

}
