import java.util.Scanner;

public class H50ef22 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("wat is de breedte?");
		double breedte = toetsenbord.nextDouble();
		
		System.out.println("wat is de lengte?");
		double lengte = toetsenbord.nextDouble();
		
		double benodigdeHoeveelheid = berekenHoeveelheid (breedte, lengte);
		
		System.out.println("de benodigde hoeveelheid verf is " + benodigdeHoeveelheid + "l");
		
		System.out.println("hoeveel liter kan er in 1pot?");
		int k = toetsenbord.nextInt();
		int aantalPotten = berekenHoeveelheid(benodigdeHoeveelheid, k);
		
		System.out.println("Je hebt " + aantalPotten + " potten verf nodig");
		
		toetsenbord.close();

	}
	
	public static double berekenHoeveelheid (double breedte, double lengte) {
		double vierkanteMeter = (int) breedte * lengte;
		double benodigdeHoeveelheid = (double)1 / 7 * (double)vierkanteMeter;
		
	return benodigdeHoeveelheid;	
	}
	public static int berekenHoeveelheid (double benodigdeHoeveelheid,int k) {
		double aantalPotten = benodigdeHoeveelheid/k;
			if (aantalPotten != (int)aantalPotten) {
				aantalPotten ++ ;
				}
		
	return (int)aantalPotten;
	}
	

	}
	

