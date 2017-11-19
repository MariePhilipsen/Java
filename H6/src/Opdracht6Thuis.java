
public class Opdracht6Thuis {

	public static void main(String[] args) {
		String tekst = "hallo";
		System.out.println(tekst.length());
		String middelste;
		if(tekst.length()%2 == 0) {
			middelste = tekst.substring(tekst.length()/2 - 1, tekst.length()/2+1).toUpperCase();
			
		} else {
			middelste = tekst.substring(tekst.length()/2, tekst.length()/2+1).toUpperCase();
			System.out.println(middelste);
		}
		
		System.out.println(tekst.substring(0, tekst.length()/2) +middelste+ tekst.substring(tekst.length()/2+1, tekst.length()));
	}
}
