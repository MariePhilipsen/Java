import java.util.Scanner;

public class H5Oef20 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);

		System.out.println("Voor een getal in");
		int getal = keybord.nextInt();

		while (getal != 0) {

			int uitkomst = faculteit(getal);

			System.out.println(uitkomst);

			System.out.println(" Geef een ander getal in");
			getal = keybord.nextInt();

		}

		keybord.close();

	}

	public static int faculteit(int getal) {
		int berekening = 1;

		for (int i = 1; i <= getal; i++) {
			berekening *= i;

		}
		return berekening;
	}
}