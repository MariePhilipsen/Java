import java.util.Scanner;

public class H5Oef21 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner (System.in);
		
		int aantalSchitterend=0;
		int aantalPersoneelsleden=0;
		float percentageSchitterend = (float)aantalSchitterend/aantalPersoneelsleden*100;
			
		System.out.println("Wat is je bruto jaarwedde?");
		double jaarwedde = toetsenbord.nextFloat();
		
		while (jaarwedde > 0) {
			aantalPersoneelsleden ++;
			
			System.out.println("Welke beoordelingscode kreeg je? (cijfer tussen 1-4");
			int beoordelingscode = toetsenbord.nextInt();
			
			if (beoordelingscode == 4) {
				aantalSchitterend ++;
			}
			
			double eindejaarspremie = bereken (jaarwedde, beoordelingscode);
			System.out.println("premie = " + eindejaarspremie);
			// hier roepen we methode op
			
			System.out.println("Wat is je bruto jaarwedde?");
			jaarwedde = toetsenbord.nextFloat();
			

			}
		
		System.out.println("het percentage is" + percentageSchitterend);
		toetsenbord.close();
		}
		
		
		public static double bereken (double jaarwedde, int beoordelingscode) {
		// hier maken we methode aan	
			double vastPremiebedrag = jaarwedde/20;
			double variabelPremiebedrag = 0;
		
		switch (beoordelingscode) {
		
		
		case 2: variabelPremiebedrag = vastPremiebedrag/100*18;
		
		break;
		
		case 3: variabelPremiebedrag = vastPremiebedrag/100*25;
		
		break;
		
		case 4: variabelPremiebedrag = vastPremiebedrag/100*33;
		break;
		
		
		}
		double eindejaarspremie = vastPremiebedrag + variabelPremiebedrag;
		return eindejaarspremie;
		
	}


	}


