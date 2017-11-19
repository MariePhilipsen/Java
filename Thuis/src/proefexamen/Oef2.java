package proefexamen;

import java.math.BigInteger;

public class Oef2 {

	public static void main(String[] args) {

		BigInteger a= BigInteger.valueOf(0);
		for (int i = 1; i <= 100; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		System.out.println(a);
	}

}
