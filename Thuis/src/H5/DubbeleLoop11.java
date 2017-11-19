package H5;

public class DubbeleLoop11 {

	public static void main(String[] args) {
		
		int grootte = 5;
		char letter = 'C';
		
		for(int rij = 1; rij <= grootte; rij++) {
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(letter + " ");
			}
			System.out.println();
			letter++;
		}
		
	}

}
