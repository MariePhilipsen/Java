package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef8 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("punten eerste examen");
		int examen1 = toetsenbord.nextInt();
		System.out.println("punten tweede examen");
		int examen2 = toetsenbord.nextInt();
		System.out.println("punten derde examen");
		int examen3 = toetsenbord.nextInt();
		
		float percentage = (float)(examen1+examen2+examen3)/60*100;
		
	
		if (percentage < 60) {
			System.out.println( (int) percentage +" %" + " onvoldoende");
		} else {
			if (percentage < 70){
				System.out.println( (int) percentage +" %"+ " voldoende");
			} else {
				if (percentage < 80) {
					System.out.println( (int) percentage +" %"+ " onderscheiding");
				} else {
					if (percentage < 90) {
						System.out.println( (int) percentage +" %"+ " grote onderscheiding");
					} else {
						 System.out.println ((int) percentage +" %"+ " grootste onderscheiding");
					}
				}
			}
			
		
}
}
}