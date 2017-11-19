package H6;

public class H6ExtraOef6 {

	public static void main(String[] args) {
		String tekst = "dit is een oefen tekst";
		
		vervangLetter(tekst);
	}
		public static void vervangLetter(String tekst) {
			
			char [] a = new char [tekst.length()];
			StringBuilder aangepast = new StringBuilder();

			for(int i=0; i<tekst.length();i++) {
				if (tekst.charAt(i)== 'a'|| tekst.charAt(i) == 'e'|| tekst.charAt(i) == 'u' || tekst.charAt(i) == 'i'|| tekst.charAt(i) == 'o') {
					aangepast.append('*');
				} else {
					aangepast.append(tekst.charAt(i));
				}
			}
			System.out.println(aangepast);
		}
}
