package opdrachten;

public class Opdracht4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h = 3;
		int b = 4;
		short res;
		
		res = (short)(h * b);// casten naar short - ook haakjes rond de bewerking!
				System.out.println("De vermenigvuldiging is " + res);
				
		res = (short)(h / b);
				System.out.println("de deling is " + res);
				
		res = (short)(b % h);
				System.out.println("de modulus is " + res);
		
				float kommaresultaat;
				kommaresultaat = (float) b / h;
				System.out.println("de kommadeling is " + kommaresultaat);
				
		char teken = 'a';
		System.out.println("het teken is " + teken);
		teken++;
		System.out.println("het teken is " + teken);
		teken = (char)(teken + 6);
		System.out.println("het teken is " + teken);
	}

}
