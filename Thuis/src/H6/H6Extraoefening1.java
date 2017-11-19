package H6;

import java.util.Random;
import java.util.Scanner;

public class H6Extraoefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Random getal = new Random();
		int getal1 = getal.nextInt(10 - 1 - 1) +1;
		System.out.println("welk getal denk je dat het is?");
		System.out.println(getal1);

		int gok = keyboard.nextInt();
		int i = 0;	
		
			while (gok != getal1 && i< 3) {
			
					if (gok < getal1) {
						System.out.println("hoger");
					} else {
						System.out.println("lager");
					}
					System.out.println("Doe nog maar een gokje");
					gok = keyboard.nextInt();
					
					i++;
				}
		if (gok == getal1) {
			System.out.println("Proficiat je hebt het geraden");
		} else {
			System.out.println("spijtig je hebt het getal niet geraden en al je beurten zijn op");
		}

		keyboard.close();
	}

}
