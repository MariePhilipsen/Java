package H6;

import java.awt.Rectangle;
import java.util.Random;

public class H6Oef9 {

	public static void main(String[] args) {
		Random getal = new Random();
		Rectangle rect = new Rectangle();
		Rectangle rectCompare = new Rectangle(0,0,100,100);
		Rectangle biggestRect = new Rectangle();
		StringBuilder tabel = new StringBuilder();
		StringBuilder toegevoegd = new StringBuilder();
		String greatest;
		int x,y,b,h;
		double oppCurrent;
		double oppGreatest=0;
		
		tabel.append("\tx\ty\tbreedte\thoogte\n");
		for(int i=0; i < 20; i++) {
			x = getal.nextInt(100);
			y = getal.nextInt(100);
			b = getal.nextInt(70)+1;
			h= getal.nextInt(70)+1;
			
			rect = new Rectangle(x,y,b,h);
			
			tabel.append("\t" + rect.x + "\t" + rect.y + "\t" + rect.width + "\t" + rect.height);
			if(rectCompare.contains(rect)) {
				tabel.append("\tgeplaatsd");
				toegevoegd.append("Rechthoek " + i + " is toegevoegd\n");
				oppCurrent=rect.x*rect.y;
				if(oppCurrent>oppGreatest) {
					biggestRect = new Rectangle(rect.x, rect.y,rect.width,rect.height);
				}
			}
			tabel.append("\n");
		}
		System.out.print(tabel);
		System.out.print(toegevoegd);
		greatest = biggestRect.toString();
		System.out.println(biggestRect.toString());
		System.out.println("De grootste geplaatste vierhoek: " + 
		greatest.substring(greatest.indexOf("[")+1, greatest.indexOf("]")));
	}

}

