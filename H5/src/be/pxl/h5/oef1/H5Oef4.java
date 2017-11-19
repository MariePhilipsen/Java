package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef4 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		int sec, min, uren, rest, hulp;
		
		System.out.println("Geef het aantal seconden in");
		sec = toetsenbord.nextInt();
		hulp = sec;
		uren = sec / 60 / 60 ;
		min = sec / 60 - (uren * 60);
		rest = sec - uren * 60 * 60 - min*60;
		
		System.out.println("Aantal seconden omgezet naar uren, minuten en seconden is " + uren + " uur " + min + " minuten " + rest + " seconden ");

		
		uren = hulp / 3600;
		hulp = hulp%3600;
	}

}
