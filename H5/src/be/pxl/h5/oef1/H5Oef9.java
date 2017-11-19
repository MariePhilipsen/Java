package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef9 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner (System.in);
		
		System.out.println("Geef een getal in");
		int a = toetsenbord.nextInt();
		System.out.println("Geef een tweede getal in");
		int b = toetsenbord.nextInt();
		System.out.println("Geef een bewerkingscode in (getal tussen 1-5");
		int c = toetsenbord.nextInt();
		int resultaat;
		
		
		switch (c) {
		case 1:
			resultaat = a + b;
			System.out.println(a+ " +  " +b+ " =   "+resultaat);		
			break;
		case 2:
			resultaat = a - b;
			System.out.println(a+ " -  " +b+ " =   "+resultaat);
			break;
		case 3:
			resultaat = a * b;
			System.out.println(a+ " * "  +b+ " =  "+resultaat);
			break;
		case 4:
			resultaat = a * a;
			System.out.println(a+ " * "  +a+ " =  "+resultaat);
			break;
		case 5:
			resultaat = b * b;
			System.out.println(b+ " * "  +b+ " =  "+resultaat);
			break;
		default:
			System.out.println("Foutieve code");
		}

	}

}

