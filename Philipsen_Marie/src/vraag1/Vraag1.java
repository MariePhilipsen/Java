package vraag1;

import java.util.Scanner;

public class Vraag1 {
//	Marie Philipsen
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef je deelnemersnummer in (e, E, s, S om te eindigen");
		String deelnemersnummer = keyboard.next();
		int categorieNr;
		String [] drankCategorieen = {"water","frisdrank en fruitsap","koffie/thee","wijn/bier","sterke drank"};
		
		while(deelnemersnummer != "e"|| deelnemersnummer != "E"||deelnemersnummer != "s"||deelnemersnummer != "S") {
			for(categorieNr = 1; categorieNr <= drankCategorieen.length; categorieNr ++) {
				System.out.println(categorieNr+"."+ drankCategorieen [categorieNr]);
			}
			
			System.out.println("Geef nummer van de categorie in");
			int categorieNrInput = keyboard.nextInt();
			
			while (categorieNrInput != 9) {
				
			System.out.println("Geef je aantal consumpties in");
			int aantalConsumpties = keyboard.nextInt();	
			
			switch (categorieNrInput) {
			case 1:
				
				break;
			}
			}
		System.out.println("Geef je deelnemersnummer in");
		deelnemersnummer = keyboard.next();
		}
		keyboard.close();
	}

}
