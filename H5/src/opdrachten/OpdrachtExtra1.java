package opdrachten;

import java.util.Scanner;

public class OpdrachtExtra1 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		int b, dubbel;
		
		for (int a = 1; a <=5; a++) {
			System.out.println("geef een getal in");
			b = keybord.nextInt();
			
			dubbel = b * 2;
			
			System.out.println("het dubbel is " + dubbel);
		
		}
		
		keybord.close();
	}

}
