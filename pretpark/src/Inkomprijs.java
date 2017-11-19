import java.util.Scanner;

public class Inkomprijs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
	
	int aantalVolwassenen;
	int aantalKinderen;
	int prijsVolwassenen;
	prijsVolwassenen = 10;
	int prijsKinderen;
	prijsKinderen = 5;
	
	System.out.println("Hoeveel volwassenen?");
	
	Scanner keyboard = new Scanner(System.in);
	aantalVolwassenen = keyboard.nextInt();

	System.out.println("Hoeveel kinderen?");
	
	aantalKinderen = keyboard.nextInt();
			
	System.out.println(aantalVolwassenen*prijsVolwassenen + aantalKinderen*prijsKinderen+" euro");
	}

}
