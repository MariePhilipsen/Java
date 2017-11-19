package voorbeelden;

import java.util.Scanner;

public class VoorbeeldIf {

	public static void main(String[] args) {
		int age;
		Scanner invoer = new Scanner(System.in);
		System.out.println("geef de leeftijd in");
		age = invoer.nextInt();

		if (age >= 18) {
			System.out.println("adult");
		} else {
			if (age >= 12) {
				System.out.println("teenager");
			} else {
				if (age >= 6) {
					System.out.println("child");
				} else {
					System.out.println("baby's");
				}
			}
		}
		invoer.close();
	}

}
