package Oefeningen;

import java.util.Scanner;

public class Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int plaatsP=0;
		int plaatsN=0;
		int kleinste =1;
		
		int[] pos = new int[10];
		int[] neg = new int[10];
		for (int i=0; i<=9; i++) {
			System.out.println("geef getal:" );
		int getal = keyboard.nextInt();
		if(getal < 0) {
			neg[plaatsN]=getal;
			plaatsN++;
			if(getal<kleinste) {
				kleinste=getal;
			}
		} else {
			pos[plaatsP]=getal;
			plaatsP++;
		}
		
		}
		for(int i=0; i<plaatsP; i++) {
					System.out.print(pos[i]+ " ");
		}
		System.out.println();
		for(int el:neg) {
					System.out.print(el +" ");
		}
		System.out.println();
		System.out.println("het kleinste getal is: "+ kleinste);
		keyboard.close();
	}

}
