package H7;

import java.util.Scanner;

public class H7Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[][] punten = new int[5][4];
		
		String[] vakken = { "vak 1", "vak 2", "vak 3", "vak 4" };
		String[] student = { "stud 1", "stud 2", "stud 3", "stud 4", "stud 5" };
		
		int kleinste;
		int som;
		int klnr;
		double gem;
		
		for (int i = 0; i < punten.length; i++) {
			System.out.println("Geef de punten van " + student[i]);
			
			for (int j = 0; j < punten[i].length; j++) {
				System.out.println("behaald op " + vakken[j]);
				
				punten[i][j] = keyboard.nextInt();
			}
		}
		for (int j = 0; j < vakken.length; j++) {
			kleinste = 20;
			som = 0;
			klnr = 0;
			
			for (int i = 0; i < student.length; i++) {
				
				if (punten[i][j] < kleinste) {
					kleinste = punten[i][j];
					klnr = i;
				}
				som = som + punten[i][j];
			}
			gem = (double) som / student.length;
			System.out.printf("%s laagste behaalde score %d behaald door %s gemiddeld behaalde score %.1f \n",
					vakken[j], kleinste, student[klnr], gem);
		}
		keyboard.close();
	}
}
