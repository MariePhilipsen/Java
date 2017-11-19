package H7;

import java.awt.Point;
import java.awt.Rectangle;

public class H7Oef5 {

	public static void main(String[] args) {

		// punt1
		int[] x = { 1, 1, 2, 4, 0 };
		int[] y = { 1, 0, 2, 1, 2 };
		Point[] punt = new Point[5];
		for (int i = 0; i < punt.length; i++) {
		punt[i] = new Point(x[i], y[i]);
		}
		// punt2
		Rectangle[] rect = new Rectangle[5];
		for (int i = 0; i < rect.length; i++) {
		rect[i] = new Rectangle(punt[i]);
		}
		for (int i = 0; i < rect.length; i++) {
		rect[i].setSize(1, 3);
		}
		// punt3
		for (int i = 0; i < rect.length; i++) {
		System.out.printf("Rechthoek nummer %d: x = %d y = %d h = %d b = %d %n", (i + 1), rect[i].x, rect[i].y,
		rect[i].height, rect[i].width);
		
		}
		// punt4
		rect[4].setBounds(0, 0, 3, 2);
		System.out.printf("Rechthoek nummer 5: x = %.0f y = %.0f h =%.0f b = %.0f %n", rect[4].getX(), rect[4].getY(),
		rect[4].getHeight(), rect[4].getWidth());
		// punt5
		for (int i = 0; i < rect.length; i++) {
		System.out.printf("Rechthoek nummer %d bevat:", i + 1);
		for (int j = 0; j < punt.length; j++) {
		if (rect[i].contains(punt[j])) {
		System.out.printf(" punt nr %d ", j + 1);
		}
		}
		System.out.println();
		}

		// punt6
		System.out.print("Rechthoeken die rechthoek nr 5 snijden:");
		for (int i = 0; i < rect.length - 1; i++) {
		if (rect[i].intersects(rect[4])) {
		System.out.printf(" rechthoek nr %d ", i + 1);
		}
		}
		}
}
