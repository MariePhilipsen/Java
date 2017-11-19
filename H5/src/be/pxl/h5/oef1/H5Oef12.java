package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef12 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner (System.in);
		float percentageMaan =16.5f;
		float percentageJupiter = 253.7f;
		float percentageMars = 27.8f;
		float maan;
		float jupiter;
		float mars;
		System.out.println("aarde");
		for (int gewichtAarde = 50; gewichtAarde < 120; gewichtAarde +=5 ) {
		maan = (float)gewichtAarde / 100 * percentageMaan;
		jupiter = (float)gewichtAarde / 100 * percentageJupiter;
		mars = (float)gewichtAarde / 100 * percentageMars;
		
		System.out.println(maan +"\t" + jupiter +"\t" + mars);
		}
				
		toetsenbord.close();
	}

}
