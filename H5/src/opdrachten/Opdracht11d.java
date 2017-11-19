package opdrachten;

import java.util.Scanner;

public class Opdracht11d {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		float lengte;
		int gewicht;
		float bmi;
		
		System.out.println("Geef je lengte in");
		lengte = toetsenbord.nextFloat();
		
		System.out.println("Geef je gewicht in");
		gewicht = toetsenbord.nextInt();
		
		bmi = gewicht/(lengte*lengte);
		System.out.println("De bmi is " + bmi );
		
		if (bmi >= 40) {
			System.out.println("ziekelijk overgewicht");
		} else {
			if (bmi >= 30) {
				System.out.println("obesitas");
			} else {
				if (bmi >= 25) {
					System.out.println("overgewicht");
				} else {
				System.out.println("goed bezig!");
					if (bmi >=18) {
						System.out.println("ok");
					} else {
						System.out.println("ondergewicht");
					}
				}
			}
		}
		toetsenbord.close();
	}

}
