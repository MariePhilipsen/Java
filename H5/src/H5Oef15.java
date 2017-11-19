import java.util.Scanner;

public class H5Oef15 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		int dagen;
		double gemiddeldeTemp;
		
		System.out.println("Geef de temperatuur om 12u 's middags");
		float temperatuur = keybord.nextFloat();
		double hoogsteTemp = temperatuur;
		double gemetenTemp = temperatuur;

		
		for (dagen = 1; dagen <= 9; dagen++) {
			if (temperatuur > hoogsteTemp) {
				hoogsteTemp = temperatuur;
			}
			gemetenTemp += temperatuur;
			System.out.println("Geef de temperatuur om 12u 's middags van de volgende dag");
			temperatuur = keybord.nextFloat();
		}
		gemiddeldeTemp = gemetenTemp / 10;
		
		System.out.println("De hoogste temperatuur van deze 10 dagen was " + hoogsteTemp);
		System.out.println("De gemiddelde temperatuur was " + gemiddeldeTemp);
		
		keybord.close();

	}

}
