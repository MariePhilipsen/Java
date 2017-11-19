package H5;

import java.util.Scanner;

public class Oef19 {

public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("geef de grootte");
	int grootte = keyboard.nextInt();
	char a = '*';
	
		printPatern(grootte,a);
	
	keyboard.close();
	}
	public static void printPatern(int grootte,char a) {
		for (int rij = 1; rij <= grootte; rij++) {
			for (int kol = grootte; kol >= rij; kol--) {
				System.out.print(a +" ");
			}
			System.out.println();
		}
	}
}

