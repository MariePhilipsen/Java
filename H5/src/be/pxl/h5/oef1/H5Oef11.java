package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef11 { 
	public static void main(String[] args) {
	Scanner toetsenbord = new Scanner (System.in);
	int a;
	int b;
	int som;
	
	System.out.println("Geef een getal in");
	a = toetsenbord.nextInt();
	System.out.println("Geef een tweede getal in");
	b = toetsenbord.nextInt();
	som = a + b;
	while (a != 0 && b != 0) {
		System.out.println(som);
		
		System.out.println("Geef een getal in");
		a = toetsenbord.nextInt();
		System.out.println("Geef een tweede getal in");
		b = toetsenbord.nextInt();
		som = a + b;
	
	}
	
	toetsenbord.close();
	}
}
