package opdrachten;

import java.util.Scanner;

public class OpdrachtBmi {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		
		System.out.println("Wat je is lengte in meter?");
		float lengte = keybord.nextFloat();
		
		System.out.println("Wat is je gewicht?");
		float gewicht = keybord.nextFloat();
		
		float BMI = gewicht / (lengte*lengte);
		System.out.println(BMI);
		keybord.close();
		
		if (BMI < 18) {
			System.out.println("je BMI bedraagt " + BMI + " ondergewicht");
		} else {
			if (BMI < 25) {
				System.out.println("je BMI bedraagt " + BMI + " OK");
			} else {
				if (BMI < 30) {
					System.out.println("je BMI bedraagt " + BMI + " overgewicht");
				} else {
					if (BMI < 40) {
						System.out.println("je BMI bedraagt " + BMI + " obesitas");
					} else {
						System.out.println("je BMI bedraagt " + BMI + " ziekelijk overgewicht");
					}
				}
			}
			
		}
	}

}
