package H6;

import java.util.Scanner;

public class H6Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een tekst in");
		String tekst = keyboard.nextLine();
		
		StringBuilder a = new StringBuilder(tekst);
		System.out.println(a.reverse());
		
		
		keyboard.close();
	}

}
