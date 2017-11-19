package opdrachten;

import java.util.Scanner;

public class Opdracht16B {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);

		System.out.println("Geef je bruto inkomen in");
		double bruto = keybord.nextDouble();

		double belastingen = berekenBelastingen(bruto);
		System.out.println("te betalen belastingen: " + belastingen);

		keybord.close();
	}

	public static double berekenBelastingen(double bedrag) {

		double belast;
		if(bedrag<=25000){
			belast = bedrag / 100 * 38.4;
		}else{
			if (bedrag <= 55000) {
				belast = 25000 * 38.4 / 100 + (bedrag - 25000) * 50 / 100;
			} else {
				belast = 25000 * 38.4 / 100 + 30000 * 50.0 / 100 + (bedrag - 55000) * 60 / 100;
			}
			
		}
		return belast;
	}
	
}