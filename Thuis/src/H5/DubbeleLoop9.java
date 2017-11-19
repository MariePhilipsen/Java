package H5;

public class DubbeleLoop9 {

	public static void main(String[] args) {
		
		PrintPatern(5,'o','.');
		
	}
	
	public static void PrintPatern (int size, char A, char B) {
		for(int rij = 1; rij <= size; rij++) {
			for(int kol = 1; kol <= rij; kol++) {
				System.out.print(A + " ");
			}
			for (int kol = 1; kol <= size - rij; kol++) {
				System.out.print(B + " ");
			}
			System.out.println();
		}
	}

}
