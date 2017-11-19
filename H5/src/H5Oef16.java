import java.util.Scanner;

public class H5Oef16 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
	
		int afstand = 36;
		int renners=0;
		int traag = 0;
		int snelsteTijd = 9999999;
		int nummerSnelste;
		int tijd;
		int percentage;
		
		System.out.println("Geef het inschrijvingsnummer");
		int inschrijvingsnummer = keybord.nextInt();
	
		
		while (inschrijvingsnummer > 0) {
			System.out.println(" De tijd van renner in seconden");
			tijd = keybord.nextInt();
			
			if (tijd > 3600) {
				traag++;
			}
			renners++;
			
			if (tijd < snelsteTijd) {
				nummerSnelste = inschrijvingsnummer;
				snelsteTijd = tijd;
			}
			
			System.out.println("Geef het inschrijvingsnummer");
			inschrijvingsnummer = keybord.nextInt();
			
		}
			percentage = (int)((double) traag/renners*100);
			
			System.out.println("het percentage van de renners die er langer dan een uur over rijden is" + percentage);
		
		keybord.close();

	}

}
