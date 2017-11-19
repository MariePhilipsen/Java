package proefexamen;
import java.util.Random;
import java.util.Scanner;

public class examen2oef1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		int totaal = 0;
		
		System.out.println(" hoeveel random getallen moeten er zijn ?");
		int aantalGetallen = keyboard.nextInt();

		while (aantalGetallen < 1) {
			System.out.println(" aantal getallen moet groter zijn dan 1 ");
			aantalGetallen = keyboard.nextInt();
		}
		int[] getallen = new int[aantalGetallen];
		int[] omgekeerd = new int[aantalGetallen];

		System.out.println(" geef het veelvoud op ");
		int veelvoud = keyboard.nextInt();

		while (veelvoud > 10) {
			System.out.println("veelvoud moet kleiner zijn dan 10 ");
			veelvoud = keyboard.nextInt();
		}
		
		int i = 0;
		while (i != aantalGetallen) {
			int getal = random.nextInt(101);
			if (getal % veelvoud == 0) {
				getallen[i] = getal;
				totaal += getallen[i];
				i++;
			}
		}

		System.out.println("de genereerde getallen zijn ");
		for (int n : getallen) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("speciale array is ");
		int k = aantalGetallen - 1;
		for (int j = 0; j < aantalGetallen; j++) {
			omgekeerd[j] = getallen[k];
			--k;
			System.out.print(omgekeerd[j] + " ");
		}
		System.out.println();
		System.out.println("getallen kleiner dan gemiddelde zijn ");
		for (int n : getallen) {
			if (n < (totaal / aantalGetallen)) {
				System.out.print(n + " ");
			}
		}

		keyboard.close();
	}

}
