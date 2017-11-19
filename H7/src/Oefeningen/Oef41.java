package Oefeningen;

import java.util.Scanner;

public class Oef41 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[] students = { "An Janssen", "Bart Vriends", "Andries Miciels", "Inge Kaas" };
		System.out.println("geef een code in");

		int[] counter = new int[4];
		int ingegevenCode = keyboard.nextInt();
		int totaal = 0;
		double percentage;

		while (ingegevenCode > 0) {
			counter[ingegevenCode - 1]++;

			totaal++;
			
			System.out.println("Geef opnieuw een code in");
			ingegevenCode = keyboard.nextInt();
		}
		for(int i = 0; i< counter.length; i++) {
		percentage = (double) counter[i]/totaal*100;
				System.out.printf("Student %s behaalde %d stemmen, het aandeel is %.1f procent \n",students[i],counter[i],percentage);
				
				
		}
		keyboard.close();
	}	
}
