package H5;

import java.util.Scanner;

//public class H5Oef25 {

//	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("geef het geslacht in");
//		char geslacht = keyboard.next().charAt(0);
//		
//		
//		float bmi = berekenBmi(gewicht,lengte);
//		int tataalPersonen = 0;
//		int aantalVrouwen = 0; 
//		int aantalTeZwaar = 0;
//		int kleinsteMan = 0;
//		float lengteKleinsteMan = 10000;
//		float lengte;
//		float gemiddeldeVrouwen, percentageOvergewicht, somLengteVrouwen = 0;
//		
//		percentageOvergewicht = totaalPersonen / personenTeZwaar * 100;
//		
//		while (geslacht != '2') {
//			System.out.println("Geef je gewicht in");
//			float gewicht = keyboard.nextFloat();
//			System.out.println("geef je lengte in");
//			lengte = keyboard.nextFloat();
//			
//			
//			if(bmi>40) {
//				System.out.println("ernstige zwaarlijvigheid");
//				aantalTeZwaar++;
//			} else {
//				if (bmi >= 30) {
//					System.out.println("zwaarlijvigheid");
//					aantalTeZwaar++;
//
//				} else {
//					if (bmi >=27) {
//						System.out.println("overgewicht");
//						aantalTeZwaar++;
//
//					} else {
//						if (bmi >= 25) {
//							System.out.println("neiging tot overgewicht");
//							aantalTeZwaar++;
//
//						} else {
//							if(bmi >= 18) {
//								System.out.println("normaal gewicht");
//							} else {
//								System.out.println("ondergewicht");
//							}
//						}
//					}
//				}
//			}
//
//			if(geslacht ==1 && lengte < lengteKleinsteMan) {
//				lengteKleinsteMan = lengte;
//			}
//			
//			if (geslacht == 0) {
//				aantalVrouwen ++;
//				somLengteVrouwen += lengte;
//			}
//			int totaalPersonen;
//			totaalPersonen ++; 
//		}
//		
//
//		keyboard.close();
//	}
//		
//}
