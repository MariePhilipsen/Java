package H5;

import java.util.Scanner;

public class DubbeleLoop1 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Geef een getal in");
		int grootte = toetsenbord.nextInt();
			
			for (int rij = 1; rij <= grootte; rij++) {

				for (int kol = 1; kol <= rij; kol++) {
		
					System.out.print("a");

				}
				System.out.println();	
				
		}

		toetsenbord.close();
	}

}
