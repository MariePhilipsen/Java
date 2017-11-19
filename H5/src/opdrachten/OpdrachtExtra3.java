package opdrachten;

public class OpdrachtExtra3 {

	public static void main(String[] args) {
		int getal;

		for (getal = 0; getal < 10000; getal++) {
			if (getal % 6 == 0 && getal % 28 == 0) {
				System.out.println(getal);
			}
		}
	}
}
