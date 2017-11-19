package opdrachten;

import java.util.Scanner;

public class OpdrachtenExtra6 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		
		int g;
		int tot = 0;
		int i = 12;
		
		do {
			g = keybord.nextInt();
			tot = tot + g;
			i = i - 2;
		} while (i != 9);
		
		keybord.close();
	}
}
