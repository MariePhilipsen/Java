package H5;

public class DubbeleLoop5 {

	public static void main(String[] args) {
		int grootte = 5;
		int aantalSpatiesVooraan = grootte / 2;
		int aantalSpatiesMidden = 1;

		drukSpaties(aantalSpatiesVooraan);
		System.out.println(" x");

		for (int i = 0; i <= grootte / 2; i++) {

			drukSpaties(aantalSpatiesVooraan);
			System.out.print("x");
			drukSpaties(aantalSpatiesMidden);
			System.out.println("x");

			aantalSpatiesVooraan--;
			aantalSpatiesMidden += 2;
		}
		aantalSpatiesVooraan = 0;
		aantalSpatiesMidden = grootte;
		for (int i = grootte/2; i >= 1; i--) {
			aantalSpatiesVooraan++;
			aantalSpatiesMidden -= 2;

			drukSpaties(aantalSpatiesVooraan);
			System.out.print("x");
			drukSpaties(aantalSpatiesMidden);
			System.out.println("x");
		}

		drukSpaties(aantalSpatiesVooraan);
		System.out.println(" x");
	}

	public static void drukSpaties(int grootte) {
		for (int i = 1; i <= grootte; i++) {
			System.out.print(" ");
		}
	}
}
