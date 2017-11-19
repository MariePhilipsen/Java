package be.pxl.h4.oef1;

import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aantalVolwassenen, aantalKinderen, prijsVolwassenen, prijsKinderen, totaal;
		prijsVolwassenen = 28;
		prijsKinderen = 15;
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Met hoeveel volwassen zijn jullie?");
		aantalVolwassenen = toetsenbord.nextInt();
		
		System.out.println("Met hoeveel kinderen zijn jullie?");
		aantalKinderen = toetsenbord.nextInt();
			
		System.out.println(aantalVolwassenen*prijsVolwassenen + aantalKinderen*prijsKinderen+" euro");
		
		toetsenbord.close();
	}

}