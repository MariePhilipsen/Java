package Opdrachten;

import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een regel teskt is");
		String tekst = keyboard.nextLine();
		String [] words = tekst.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		
		keyboard.close();
	}
}
