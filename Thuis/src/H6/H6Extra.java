package H6;

import java.awt.Point;

public class H6Extra {

	public static void main(String[] args) {
		Point a = new Point();
		a.move(5,8);
		Point b = new Point((int)a.getX(),(int)a.getY());
		
		if (a==b) {
			System.out.println("ze hebben dezelfde waarde");
		} else {
			System.out.println("ze hebben niet dezelfde waarde");
		}
		
		if (a.equals(b)) {
			System.out.println("de punten liggen gelijk");
		} else {
			System.out.println("de punten liggen niet gelijk");
		}
	}

}
