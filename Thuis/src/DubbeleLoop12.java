import java.util.Scanner;

public class DubbeleLoop12 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		System.out.println("geef de lengte in");
		int lengte = keyboard.nextInt();
		System.out.println("geef de breedte in");
		int hoogte = keyboard.nextInt();
		
		for(int rij=1; rij < hoogte; rij++) {
			for(int kol= 1; kol < lengte; kol++) {
				System.out.print("*"+ "\t");
			}
			System.out.println();
		}
	
	keyboard.close();
	}
}
