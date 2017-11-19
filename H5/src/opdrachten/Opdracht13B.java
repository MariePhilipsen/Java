package opdrachten;

import java.util.Scanner;

public class Opdracht13B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int getal;
		
		System.out.println("oplossing met while ");
		System.out.println("Geef een getal tussen o en 10");
		getal = scanner.nextInt();
		
		while (getal < 0 || getal > 10){ //je gaat in de lus bij ingave van een fout getal!
			System.out.println("Het getal is fout, geef een getal in tussen 0 en 10");
			
			getal = scanner.nextInt();
		}
		System.out.println("oplossing met een do-while");
		int getal2;
		
		do {
			System.out.println("geef een getal tussen 0 en 10");
			getal2 = scanner.nextInt();
			}
		while	(getal2 < 0 || getal2 < 10);
		
		
		scanner.close();
		}
	}


