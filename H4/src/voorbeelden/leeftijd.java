package voorbeelden;

import java.util.Scanner;

public class leeftijd {
public static void main(String[] args) {
	Scanner toetsenbord = new Scanner(System.in);
	
	System.out.println("Wat is je leeftijd?");
	int leeftijd = toetsenbord.nextInt();
	
	if (leeftijd >= 18) {
		System.out.println("Adult");
	} else {
	if (leeftijd >=10){
		System.out.println("Teenager");
	}
	if (leeftijd >=2){
		System.out.println("Child");
	}
	else {
		System.out.println("Baby");
	}
	
}
}
}
