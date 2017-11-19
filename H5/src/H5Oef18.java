import java.util.Scanner;

public class H5Oef18 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner (System.in);
		
		System.out.println("Voor een getal in");
		int getal = keybord.nextInt();
		int faculteit = 1;
		
		
		
		while (getal != 0) {
			for (int i = 1 ; i <= getal; i++ ) {
				faculteit *= i;
					
			}
			System.out.print(faculteit);
			
			System.out.println(" Geef een ander getal in");
				getal = keybord.nextInt();
				
		}
		
		keybord.close();

	}

}
