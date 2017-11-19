import java.util.Scanner;

public class dubbeleLoop4 {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Geef de grootte in");
		int grootte = keyboard.nextInt();
		
		for (int rij = 1; rij <= grootte; rij++) {
			
			for (int kol = 1; kol <= grootte; kol++) {
				
				System.out.println();
			}
		}
		
		
		
		
		keyboard.close();
	}

}
