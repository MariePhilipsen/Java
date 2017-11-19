import java.util.Scanner;

public class H5Oef13 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);

		System.out.println("Geef een getal in tussen 1 - 100");
		int getal = keybord.nextInt();

		while (getal < 1 || getal > 100) {
			if (getal < 1) {
				System.out.println("Fout! het getal moet groter zijn dan 1");
			} else {
				System.out.println("Fout! het getal moet kleiner zijn dan 100");
			}

			System.out.println("Geef een getal in tussen 1-100");
			getal = keybord.nextInt();
		}

		System.out.println("Proficiat " + getal + " is een correct getal");
		keybord.close();
	}

}
