package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5ExtraOef2 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);

		System.out.println("Geef het aantal graden in Farenheit in");
		int farenheit = toetsenbord.nextInt();
		int celcius = (int)((farenheit - 32)*5.0f/9);
		
		System.out.println("Het aantal graden in Celcius is " + celcius);
	}

}
