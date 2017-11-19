package H4;

import java.util.Scanner;

public class H4Oef1 {
private static final String Int = null;

public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Hoeveel volwassenen?");
	int aantalVolwassenen = keyboard.nextInt();
	System.out.println("Hoeveel kinderen?");
	int aantalKinderen = keyboard.nextInt();
	int inkomprijsVol = 28;
	int inkomprijsKind = 15;
	int totaal = (aantalVolwassenen*inkomprijsVol) + (aantalKinderen*inkomprijsKind);
	System.out.println("het totale bedrag is " + totaal + " Euro");
	
	keyboard.close();
}
}
