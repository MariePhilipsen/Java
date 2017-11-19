package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5ExtraOef1 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner (System.in);
		
		System.out.println("Voer het aantal graden in Celcius in");
		
		int celcius = toetsenbord.nextInt();
		float farenheit = (9f/5) * celcius + 32;
		
		System.out.println("het aantal graden in Farenheit is " + farenheit);
		

	}

}
