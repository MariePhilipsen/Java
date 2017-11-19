package proefexamen;

import java.util.Scanner;

public class TestOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een code in");
		int code = keyboard.nextInt();
		double inschrijvingsgeld = 0;
		int basis = 585;
		double surplus = 0;
		
		switch(code) {
		case 3:
			surplus = (double)basis/100*10;
			break;
		case 4:
		case 5:
			surplus = (double)basis/100*30;
			break;
		case 6:
		case 7:
			surplus = (double)basis/100*40;
			break;
		default:
			surplus = 20;
			break;
		}
		inschrijvingsgeld = basis + surplus;
		System.out.printf("het inschrijvingsgeld voor een student met code 3 is gelijk aan: %.2f", inschrijvingsgeld );
		
		
		keyboard.close();
	}

}
