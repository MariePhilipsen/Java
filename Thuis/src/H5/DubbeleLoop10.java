package H5;

public class DubbeleLoop10 {

	public static void main(String[] args) {
		int grootte = 5;
		
		for(int rij = 1; rij <= grootte; rij++) {
			for(int kol = 1; kol <= rij; kol++) {
				System.out.print(kol);
			}
			System.out.println();
		}
		for(int rij = 1; rij <=grootte-1; rij++) {
			for(int kol = 1; kol <= grootte-rij; kol++) {
				System.out.print(kol);
			}
			System.out.println();
		}
	}

}
