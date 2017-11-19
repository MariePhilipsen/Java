package H5;

public class DubbeleLoop6 {

	public static void main(String[] args) {
		int hoogte = 4;
		int lengte = 6;
		printPatern (hoogte,lengte,'+',' ');
	}
		public static void printPatern(int hoogte, int lengte, char a, char b) {
			
			for(int rij = 1; rij <= hoogte; rij++) {
				for(int kol = 1; kol <= lengte; kol++) {
					
					if(rij == 1 || rij == hoogte || kol ==1 || kol ==lengte) {
						System.out.print(a);
					} else {
						System.out.print(b);
					}
				}
				System.out.println();

			}
		}
		
		
	

}
