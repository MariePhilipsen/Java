package vraag3;

import java.util.Scanner;

public class Vraag3 {
//Marie Philipsen
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int hoeveelheidPlanken = berekenAantalPlanken;
		double kostprijs = berekenPrijsKamer;
		int aantalKamers;
		
		System.out.println("Geef het aantal kamers in");
		aantalKamers = keyboard.nextInt();
		
		for (int i=1; i <= aantalKamers; i++) {
			System.out.println("Geef de gegevens in van kamer"+ i);
			System.out.println("Geef de lengte in cm");
			
			float lengte = keyboard.nextFloat();
			System.out.println("Geef de breedte in cm");
			float breedte = keyboard.nextFloat();
			System.out.println("Geef type plank in");
			String type = keyboard.next();
		}
		
		keyboard.close();
		
		}
		
		public static float berekenAantalPlanken{
			String type;
			if(type.indexOf(type.length() == "m"|| type.indexOf(type.length() =="M"){
				
			}
			hoeveelheidPlanken = (int)lengte/125;
			return hoeveelheidPlanken;
		}
		
		public static float berekenPrijsKamer{
			double kostprijs;
			float opp = lengte*breedte;
			if (type )
			kostprijs = opp * 20.49;
		}
	

}
