package H5;

public class dubbeleLoop12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {

			for(int j=i; j< 6; j++) {
				System.out.print("  ");
			}
			for(int k=1; k < (i*2); k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
