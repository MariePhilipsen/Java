package Opdrachten;

import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
//		Scanner toetsenbord = new Scanner(System.in);
//		
//		System.out.println("Geef je naam");
//		String naam = toetsenbord.nextLine(); // is ok als je geen spaties in naam hebt, stel je hebt spaties dan worden deze in de volgende next gestoken.
//		// om dit te voorkomen gebruik je beter toetsenbord.nextLine()
//		System.out.println("Geef je voornaam");
//		String voornaam = toetsenbord.nextLine();
//		
//		System.out.println("De naam is " + naam);
//		System.out.println("De voornaam is " + voornaam);

		String tekst = "dit is een inhaalles op vrijdag";
		System.out.println(tekst);
		System.out.println("de lengte is " + tekst.length());
		System.out.println(tekst.toUpperCase()); // hier hebben we dezelfde output maar de inhoud van tekst staat nog steeds in kleine letters
		tekst = tekst.toUpperCase();
		System.out.println(tekst);
		tekst = tekst.toLowerCase();
		System.out.println(tekst);
		tekst = tekst.replace('a', 'o');
		System.out.println(tekst);
		
		int teller = 0;
		for (int i = 0; i < tekst.length(); i++) {
			if (tekst.charAt(i) =='e') {
				teller++;
			}
		}
		System.out.println("aantal e: " + teller);
		
		String tekst2 = "ik vind het fijn als jullie stil zouden zijn";
		if (tekst.equals(tekst2)) {
			System.out.println("ze zijn gelijk ");
		     } else {
		    	System.out.println("ze zijn ongelijk ");
			  
		}
		
		tekst = "Zoe";
		tekst2 = "Annemarie";
		if (tekst.compareTo(tekst2) < 0) {
			System.out.println(tekst + "  "+ tekst2);
		} else {
			System.out.println(tekst2 + "  "+ tekst);

		}
		
		// spaties vooraan en achteraan wegdoen
		tekst = "        extra spaties      ";
		tekst = tekst.trim();
		
		System.out.println(tekst +"!");
		
		// Voor en achternaam afkorten + naar hoofd- en kleine letter
		
		String voornaam = "jEf";
		String familienaam = "Van DEn bOsche";
		
		String naam;
		naam = voornaam.substring(0, 1).toUpperCase();
		naam = naam + ". ";
		naam = naam + familienaam.substring(0, 1).toUpperCase();
		naam = naam + familienaam.substring(1).toLowerCase();
		
		System.out.println(naam);
		
		// middelste letter eruit halen
		tekst = "moeder";
		if(tekst.length()%2 == 0) { // even aantal tekens
			System.out.println(tekst.substring(tekst.length()/2-1, tekst.length()/2+1)); // even aantal bv "moeder" = 6/2 = 3 en 3-1= 2
		 } else {
			 System.out.println(tekst.substring(tekst.length()/2, tekst.length()/2+1));
			 
		 }
////			/*tekst = "moeder";
////			if(tekst.length()%2 == 0) { // even aantal tekens
////				System.out.println(tekst.substring(tekst.length()/2-1, tekst.length()/2+1)); // even aantal bv "moeder" = 6/2 = 3 en 3-1= 2*/
////		
//		}
	}

}
