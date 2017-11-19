package opdrachten;

public class Opdracht14cdefg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("opdarcht C");
		
		for (int getal = 400; getal >= 350; getal--){
		System.out.println(getal);
		}
		System.out.println("opdarcht D");
		
		for (int getal = 0; getal < 200; getal += 7) {
			System.out.println(getal);
	
		}
		System.out.println("opdarcht E");
		for (char alfa = 'z'; alfa >='a'; alfa--) {
			System.out.println(alfa);
		}

		System.out.println("opdarcht E");
		for (int getal = -10; getal <=10; getal++) {
			if (getal > 0) {
				System.out.println("+" + getal);
			} else {
			System.out.println(getal);
			}
		}
		System.out.println("opdarcht F");
		for (int getal = 0; getal < 10000; getal++) {
			if (getal%6 == 0 && getal%28 ==0) {
				System.out.println(getal);
			}
		}

	
	}

}
