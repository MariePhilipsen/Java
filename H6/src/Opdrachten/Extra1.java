package Opdrachten;

public class Extra1 {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = sum(a, b);

		System.out.println(c);

		int d = 8;
		int e = 7;
		int f = sum(d, e);

		System.out.println(f);

	}

	public static int sum(int getal1, int getal2) {
		int result = getal1 + getal2;

		return result;
	}
}
