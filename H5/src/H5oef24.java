import java.util.Scanner;

public class H5oef24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("aantal films?");
		int aantalFilms = keyboard.nextInt();

		for (int i = 1; i <= aantalFilms; i++) {

			System.out.println("Welk genrenummer?");
			int genrenummer = keyboard.nextInt();

			System.out.println("aantal sterren?");
			int aantalSterren = keyboard.nextInt();

			System.out.println("jaar van uitgave?");
			int jaarUitgave = keyboard.nextInt();

			System.out.println("speeltijd in minuten?");
			int speeltijdMin = keyboard.nextInt();

//			double kostprijs = berekenPrijs((double)aantalSterren, jaarUitgave, genrenummer);
		}
//
//		System.out.println(kostprijs);
//		keyboard.close();
	}

	public static double berekenPrijs(int aantalSterren, int jaarUitgave, int genrenummer, int speeltijdMin) {

		double kostprijs = 0;

		if (genrenummer / 10000 == 1) {
			kostprijs = 0.5 * speeltijdMin;
		} else {
			switch (aantalSterren) {
			case 1:
				kostprijs = 3;
				break;
			case 2:
			case 3:
				kostprijs = 3.75;
				break;
			case 4:
			case 5:
				kostprijs = 4.75;
				break;
			}
		}

		if (jaarUitgave < 2007) {
			kostprijs = kostprijs - 0.5;
		}

		return kostprijs;
	}

}
