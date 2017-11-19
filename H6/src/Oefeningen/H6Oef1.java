package Oefeningen;

import java.util.Random;

public class H6Oef1 {

	public static void main(String[] args) {
		int resultaat = 0;
		char aantal = 'A';
		int oef = 1;
		Random bewerking = new Random();
		
		//System.out.printf("%s"reeks A);
			for (int j = 1; j <= 6; j++) {
				
				System.out.println();
				System.out.println("reeks " + aantal);
				
				aantal += 1;

				for (int i = 1; i <= 5; i++) {

					int getal1 = bewerking.nextInt(20);
					int getal2 = bewerking.nextInt(20);
					
					if (getal1 >= getal2 ){
					
					System.out.println(oef +")" +"\t"+ getal1 + " - " + getal2 + " = ");
					
					} else {
						 System.out.println(oef +")" +"\t"+ getal2 + " - " + getal2 + " = ");	
				}
					oef += 1;
			}

		}

	}

}
