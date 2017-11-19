package H5;

public class DubbeleLoop4 {

	public static void main(String[] args) {
		int grootte = 9;
		int aantalSpatiesVooraan = 0;
		int aantalSpatiesMidden = grootte - 2;
		for (int i = 1; i <= grootte / 2; i++) {

			drukSpaties(aantalSpatiesVooraan);
			System.out.print("x");
			drukSpaties(aantalSpatiesMidden);
			System.out.println("x");

			aantalSpatiesVooraan++;
			aantalSpatiesMidden -= 2;
		}
		drukSpaties(aantalSpatiesVooraan);
		System.out.println("x");

		for (int i = 1; i <= grootte / 2; i++) {
			aantalSpatiesVooraan--;
			aantalSpatiesMidden += 2;
			if (i==5) {
				drukSpaties(aantalSpatiesVooraan);
				System.out.print("x");
			}else {
				drukSpaties(aantalSpatiesVooraan);
				System.out.print("x");
				drukSpaties(aantalSpatiesMidden);
				System.out.println("x");
			}
			
		}
	}

	public static void drukSpaties(int grootte) {
		for (int i = 1; i <= grootte; i++) {
			System.out.print(" ");
		}
	}
}
