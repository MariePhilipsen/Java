package opdrachten;

import java.util.Scanner;

public class Opdracht16A {

	public static void main(String[] args) {

			Scanner keybord = new Scanner(System.in);
			
			System.out.println("Geef een getal");
			int getal = keybord.nextInt();
			
			toonTafel(getal);
			
			keybord.close();
	}
	
	public static void toonTafel(int getal) {
		for (int i = 0; i<= 10; i++){
			System.out.println(i + "*" + getal + "=" + (i*getal));
		}
	}

}
