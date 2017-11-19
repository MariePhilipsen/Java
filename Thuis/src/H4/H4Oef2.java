package H4;

import java.util.Scanner;

public class H4Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een getal in");
		int a = keyboard.nextInt();
		System.out.println("geef nog een getal in");
		int b = keyboard.nextInt();
		int result = bereken(a, b);
				
		keyboard.close();
	}
	public static int bereken (int a,int b) {
		int result;
		if (a > b) {
			int grootste = a;
			int kleinste = b;
			result = a-b;
		} else {
			int grootste = b;
			int kleinste = a;
			result = b-a;

		}
		return result;

	}

}