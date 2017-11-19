package voorbeelden;

import java.util.Scanner;

public class VoorbeeldSom {
	public static void main(String[] args) {
		int getal1, getal2, som;
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Geef een getal in");
		getal1 = toetsenbord.nextInt();
		System.out.println("Geef nog een getal in");
		getal2 = toetsenbord.nextInt();
		
		som = getal1 + getal2;
		System.out.println("de som is " + som);
		
		toetsenbord.close();
	}
}
