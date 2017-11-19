
public class dubbeleLoop6 {

	public static void main(String[] args) {

			int size = 5;
			
			for (int rij = 1; rij<=size; rij++) {
				
				for (int kol = 1; kol<=rij ; kol++ ) {
					System.out.print(kol);
				}	
				System.out.println();
			}
			
			for (int rij = size-1; rij>=1; rij--) {
				for (int kol = 1; kol<=rij ; kol++ ) {
					System.out.print(kol);
			}
				System.out.println();
				
			}
			
		}

	}
