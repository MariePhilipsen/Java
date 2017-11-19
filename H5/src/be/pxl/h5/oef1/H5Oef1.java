package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("geef een bedrag in BEF");
		
		int getal = toetsenbord.nextInt();
		double koers = 40.3399;
		
		
		double res = getal/koers;
		
		System.out.println("het bedrag in Eur is " + res);
		
		toetsenbord.close();
	}

}
