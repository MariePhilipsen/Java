package Oefeningen;

import java.util.Random;

public class Oef2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int som = 0;
		int [] numbers = new int [500];
		
		
		for(int i=0; i<numbers.length; i++) {
			numbers [i] = rand.nextInt(500);
			
			if (numbers [i] > 100) {
				
				som += numbers [i];
			}
			
			System.out.println(numbers [i]);
		
		}
		System.out.println("*************");
		System.out.println(som);
	}

}
