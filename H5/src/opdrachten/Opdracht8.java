package opdrachten;

public class Opdracht8 {

	public static void main(String[] args) {
		short a, b, c;
		a = 5;
		b = 4;
		b += a;
		// b = a + b; gaat niet omdat je dan een Int in een Short wil steken
		b +=1;
		
		System.out.println("b is nu " + b);
		
	}

}
