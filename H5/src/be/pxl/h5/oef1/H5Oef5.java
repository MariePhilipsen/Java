package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef5 {

	public static void main(String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.println("Geef een geldbedrag in euro’s in (geen eurocenten)");
		
		int bedrag = toetsenbord.nextInt();
		
		int twintig = bedrag/20;
		
		int rest = bedrag % 20;
		
		System.out.println("je kan dit inruilen voor " + twintig +" briefjes van 20 euro de rest bedraagt " + rest + " Euro");
		
		toetsenbord.close();
	}

}
