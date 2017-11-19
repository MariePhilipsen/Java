package H6;

public class H6ExtraOef4 {

	public static void main(String[] args) {
		StringBuilder alfabet = new StringBuilder();
		String letter1;
		
		for(char letter = 'a'; letter <= 'z'; letter++) {
			alfabet.append(letter);
		}
		
		for (int i = 1; i <= alfabet.length(); i +=2) {
			letter1 = alfabet.substring(i, i+1).toUpperCase();
			alfabet.replace(i, i+1, letter1);
		}
		System.out.println(alfabet);
		
		System.out.println(alfabet.toString().replace('H', 'X'));
	}

}
