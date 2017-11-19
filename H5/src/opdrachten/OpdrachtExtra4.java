package opdrachten;

import java.util.Scanner;

public class OpdrachtExtra4 {

	public static void main(String[] args) {
	Scanner toetsenbord = new Scanner(System.in);	
		System.out.println("geef de grootte van de tabel in");
		int grootte = toetsenbord.nextInt();
		int rij; 
		
		for (rij = 1; rij <= grootte; rij++){
			System.out.print( rij +": ");
			
			for (int kol = 1; kol <= rij; kol++) {
				int berekening = rij * kol;
				System.out.print(berekening + " ");
				
			}
			
			System.out.println();
			
		}
		
	
	toetsenbord.close();	

	}

}
