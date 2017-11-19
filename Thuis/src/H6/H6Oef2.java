package H6;

import java.util.Random;
import java.util.Scanner;

public class H6Oef2 {

	public static void main(String[] args) {
		  	String text1 = "ha";
	        String text2 = "ld";
	        String concatText;
	        String sub;
	        
	        while (text1.length() < 4) {
	        	text1 = text1 +"*";
	        }
	        while (text2.length() < 4) {
	        	text2 = "+" + text2;
	        }
	        
	        sub = text2.substring(text2.length()-4);
	        
	        	concatText = text1.substring(0, 4).toUpperCase().concat(sub);
	        	System.out.println(concatText);
	}
}
