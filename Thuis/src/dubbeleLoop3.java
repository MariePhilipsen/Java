
public class dubbeleLoop3 {

	public static void main(String[] args) {

		doeIets(10,'c');
	}

	private static void doeIets(int size, char symbool) {
		for (int rij=1; rij <= size; rij++) {
			
			for (int kol=1; kol<=size; kol++) {

				System.out.print(symbool + "\t");
			}
			System.out.println();	
		}
	}

}
