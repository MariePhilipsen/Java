package proefexamen;

import java.util.Scanner;

public class Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("geef tekst in");
		String tekst = keyboard.nextLine();
		System.out.println("geef het max aantal karakters per regel in");
		int max = keyboard.nextInt();
		
		while (max > 0) {
			for (int i = 1; i <= max; i++) {
				System.out.print("-");
			}
			System.out.println();
			
			if (tekst.length() > max) {
				int counter = tekst.length()/max;
				for (int j = 1; j<= counter; j++) {
					int k = 0;
					int l = max;
					System.out.println(tekst.length());
					System.out.println(tekst.substring(k, l) + "\n");
					k += max;
					l += max;
					System.out.println(tekst.substring(5, 10));
				}
			}
		System.out.println("geef het max aantal karakters per regel in");
		max = keyboard.nextInt();
		}
		keyboard.close();
	}

}
