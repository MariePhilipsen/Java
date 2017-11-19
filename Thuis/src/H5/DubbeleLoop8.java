package H5;

public class DubbeleLoop8 {

	public static void main(String[] args) {

		drawTriangle(5, 'C');
	}

	public static void drawTriangle(int getal, char letter) {
		for (int rij = 1; rij <= getal; rij++) {
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(letter + "\t");

			}
			System.out.println();
			letter++;
		}
	}
}
