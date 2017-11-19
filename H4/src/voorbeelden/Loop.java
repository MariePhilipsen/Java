package voorbeelden;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		int getal;
		
		System.out.println("Geef een getal in >100");
		getal = toetsenbord.nextInt();
		while(getal>100) {
			
		int driedubbel= getal*3;
				System.out.println("het driedubbel van "+ getal+ " = " + driedubbel);
			
		
		System.out.println("Geef een getal in >100");
		getal = toetsenbord.nextInt();
		
				
		}
		
		toetsenbord.close();
	}

}
