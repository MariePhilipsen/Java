package Oefeningen;

import java.util.Scanner;

public class Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantalAn=0;
		int aantalBart=0;
		int aantalAndries=0;
		int aantalInge=0;
		int totaal=0;
		double percentageAn, percentageBart, percentageAndries, percentageInge;

		
		System.out.println("Geef de code van een student in");
		int code=keyboard.nextInt();
		
		while(code > 0) {
			switch (code) {
			case 1:
				aantalAn++;
				totaal++;
				break;
			case 2:
				aantalBart++;
				totaal++;
				break;
			case 3:
				aantalAndries++;
				totaal++;
				break;
			case 4: 
				aantalInge++;
				totaal++;
				break;
			default:
				System.out.println("geef een code in tussen 1-4");
				break;
			}
			
			System.out.println("Geef de code van een student in");
			code=keyboard.nextInt();	
		}
		
		System.out.println("aantal stemmen An Janssen:"+"\t"+aantalAn);
		System.out.println("aantal stemmen Bart Vriends:"+"\t"+aantalBart);
		System.out.println("aantal stemmen Andries Michels:"+"\t"+aantalAndries);
		System.out.println("aantal stemmen Inge Kaas:"+"\t"+aantalInge);
	
		percentageAn = (double)aantalAn/(double)totaal*100;
		percentageBart = (double)aantalBart/(double)totaal*100;
		percentageAndries = (double)aantalAndries/(double)totaal*100;
		percentageInge = (double)aantalInge/(double)totaal*100;
		
		System.out.printf("het aandeel van An is: %.1f%% \n", percentageAn);
		System.out.printf("het aandeel van Bart is: %.1f \n", percentageBart);
		System.out.printf("het aandeel van Andries is: %.1f \n", percentageAndries);
		System.out.printf("het aandeel van Inge is: %.1f \n", percentageInge);
		keyboard.close();	
	}

}
