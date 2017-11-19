package opdrachten;

import java.util.Scanner;

public class OpdrachtExtra {

	public static void main(String[] args) {
		Scanner keybord = new Scanner (System.in);
		System.out.println("Geef een getal in tussen 0-10");
		int getal = keybord.nextInt();
		
		while (getal < 0 || getal > 10) {
			System.out.println("fout getal! Voer een getal in tussen 0-10");
			getal = keybord.nextInt();
		}
		
		keybord.close();
	}

}
