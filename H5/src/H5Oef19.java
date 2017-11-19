import java.util.Scanner;

public class H5Oef19 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);

		System.out.println("geef een getal in");
		int getal = keybord.nextInt();

		while (getal != 0) {

			for (int rij = 1; rij <= getal; rij++) {
				for (int kol = 1; kol <= rij; kol++) {
					System.out.print(" @ ");
				}
				
				System.out.println();
				
				
				/*System.out.println("geef een getal in");
				getal = keybord.nextInt();*/
			}
		}
		keybord.close();
	}
}

/*
 * for (int rij = 1; rij <= 5; rij++) { for (int kol = 1; kol <= 10; kol++) {
 * int product = rij * kol;
 * 
 * System.out.print(product +"\t"); } System.out.println();
 */