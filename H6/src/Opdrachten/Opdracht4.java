package Opdrachten;

public class Opdracht4 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder("het is weer maandag\nhoera!");
		System.out.println(tekst);
		
		System.out.println("*********************");
		
		tekst.append("Maar volgende week is het vakantie :-)");
		System.out.println(tekst);
		
		System.out.println("*********************");
		
		tekst.reverse();
		System.out.println(tekst);
		
		System.out.println("*********************");
		tekst = new StringBuilder (tekst.toString().replaceAll(" ", ""));
		System.out.println(tekst);
		
		System.out.println("*********************");
		tekst = new StringBuilder (tekst.toString().replaceAll("t", "tt"));
		System.out.println(tekst);
	}

}
