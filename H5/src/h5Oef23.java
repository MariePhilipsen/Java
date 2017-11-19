import java.util.Scanner;

public class h5Oef23 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);

		System.out.println("geef een getal in");
		int getal = keybord.nextInt();

		while (getal != 0) {

			for (int rij = getal; rij > 0; rij--) {
				for (int kol = getal; kol > 0; kol--) {
					System.out.print(" @ ");
				}
				
				System.out.println();
				
				getal = getal - 1;
				/*System.out.println("geef een getal in");
				getal = keybord.nextInt();*/
			}
		}
		keybord.close();
	}
}
