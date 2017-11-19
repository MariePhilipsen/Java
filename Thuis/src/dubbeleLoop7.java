import java.util.Scanner;

public class dubbeleLoop7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("geef een getal in");
		int getal = keyboard.nextInt();

		for (int rij = 1; rij <= getal; rij++) {
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(kol);
			}		
			System.out.println();
		}

		for (int rij = getal-1; rij >= 1; rij--) {
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(kol);
			}
			System.out.println();
		}

		keyboard.close();
	}
}
