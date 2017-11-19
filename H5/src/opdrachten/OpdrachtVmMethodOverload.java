package opdrachten;

public class OpdrachtVmMethodOverload {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		int c = 7;
		
		int som = berekenSom(a,b);
		System.out.println("De eerste som is " + som);

		int som2 = berekenSom(a,b,c);
		System.out.println("De tweede som is" + som2);
		
		drukAf(a);
		drukAf(c);			
	}
	
	public static int berekenSom (int x, int y) {
		int som = x + y;
		return som;
	}
	// binnen 1 klasse zijn er 2 methoden met dezelfde naam
	// wel een verschillend aantal/type parameters --> method overloading!

	public static int berekenSom (int x, int y, int z) {
		int som = x + y +z;
		return som;
	}

	public static void drukAf (int getal) {
		for (int i = 0; i < getal; i++) {
			System.out.println(getal);
		}
		System.out.println();
	}
	}
	
