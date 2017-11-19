package H6;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1;
		Point p2;
		p1 = new Point (5,8);
		p2 = new Point(p1);
		p2.translate(2, 3);
		
		System.out.printf("de x en y voor p1 zijn: %.0f-%.0f \n",p1.getX(), p1.getY());
		System.out.printf("de x en y voor p2 zijn: %.0f-%.0f \n",p2.getX(), p2.getY());
		controleerObjecten(p1,p2);
	}
	public static void controleerObjecten(Point p1, Point p2) {
		if (p1 == p2) {
			System.out.println("de waarde van p1 is gelijk aan de waarde van p2");
		} else {
			System.out.println("de waarde van p1 is verschillend van de waarde van p2");
		}
		if (p1.equals(p2)) {
			System.out.println("het gaat om hetzelfde object");
		} else {
			System.out.println("het zijn 2 verschillende objecten");
		}
	}
}
