package Oefeningen;

import java.awt.Point;
import java.awt.Rectangle;

public class Oef5 {

	public static void main(String[] args) {

		int[] x = { 1, 1, 2, 4, 0 };
		int[] y = { 1, 0, 2, 1, 2 };

		Point[] points = new Point[5];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(x[i], y[i]);
		}
		Rectangle[] rectangles = new Rectangle[points.length];
		for(int i=0; i < points.length; i++) {
			rectangles[i] = new Rectangle(x[i],(int)points[i].getY(), 1, 3);
		}
		
		Rectangle laatsteRectangle = rectangles[rectangles.length-1];
		
		for (Rectangle rectangle : rectangles) {
			laatsteRectangle.intersects(rectangle);
		}
	}

}
