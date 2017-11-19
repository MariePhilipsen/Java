package be.pxl.h4.oef6;

import java.util.Scanner;

public class H4Oef6 {

	public static void main(String[] args) {
	Scanner toetsenbord = new Scanner (System.in);
	System.out.println("geef een getal in");
	int invoer = toetsenbord.nextInt();
	
	for (int getal = 1; getal<20; getal++) {
		int uitkomst = getal*invoer;
		
		System.out.println(getal + "\t x " + "\t" + invoer + "\t" + "=" + "\t" + uitkomst);
	}


	}

}
