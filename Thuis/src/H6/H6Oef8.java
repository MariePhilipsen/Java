package H6;

import java.awt.Point;
import java.awt.Rectangle;

public class H6Oef8 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(1,2,20,30);
		Point a = new Point(5,5);
		boolean b = rect.contains(a);
		if (b == true) {
			System.out.println("Point punt bevindt zich in rectangle");
		} else {
			System.out.println("Point punt bevindt zich niet in rectangle");
		}
		
		a.translate(30, 40);
		Rectangle rect2 = new Rectangle(a);
		rect2.setSize(100, 110);;
		System.out.printf("de xy coordinaten van rect2 zijn: %d en %d \n", (int)rect2.getX(),(int)rect2.getY());
	
		if (rect.contains(rect2)) {
			System.out.println("rect bevindt zich volledig in rect2");
		} else {
			System.out.println("rect bevindt zich niet in rect2");
		}
		System.out.println(rect2);
		rect.grow(40/2, 80/2);
		System.out.println(rect);
		
		if (rect2.height == rect.height) {
			System.out.println("de hoogten van rect en rect2 zijn gelijk");
		} else {
			System.out.println("de hoogten zijn niet gelijk");
		}
		
	}

}
