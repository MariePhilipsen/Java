import java.util.Scanner;

public class H5Oef14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keybord = new Scanner(System.in);
		int artikelnr, hoeveelheid;
		double eenheidsprijs, bedrag;
		double totaalbedrag = 0;
		
		System.out.println("geef het artikelnr");
		artikelnr = keybord.nextInt();
		while (artikelnr != 999) {
			System.out.println("Geef het aantal artikels");
			hoeveelheid = keybord.nextInt();
			System.out.println("Geef de eenheidsprijs");
			eenheidsprijs = keybord.nextDouble();
			bedrag = eenheidsprijs * hoeveelheid;
			totaalbedrag = totaalbedrag + bedrag;
			
			System.out.println("artikelnr" + artikelnr);
			System.out.println("hoeveelheid" + hoeveelheid);
			System.out.println("eenheidsprijs" + eenheidsprijs);
			System.out.println("bedrag" + bedrag);
			
			
			System.out.println("Geef het artikelnummer");
			artikelnr = keybord.nextInt();
		}
		
		System.out.println("het totaalbedrag is" + totaalbedrag);

keybord.close();
	}

}
