package Oefeningen;

public class H6Oef2 {

	public static void main(String[] args) {
		
		String tekst = "diT is een Teks als es";
		String hulp = tekst.toLowerCase();
		
		int indext = hulp.indexOf('t');
		System.out.println(indext);
		
		if (indext > 0) {
			
				int length = tekst.length();
				if (length % 2 != 0) {
					tekst = tekst.substring(0, indext)+tekst.substring(indext).toUpperCase();
					System.out.println(tekst);
					
				} else {
					
					tekst = tekst.substring(0, indext)+tekst.substring(indext).toLowerCase();	
					System.out.println(tekst);
					
				}
			
		} else {
			System.out.println("in deze tekst komt geen t of T voor");
		}
	}
}