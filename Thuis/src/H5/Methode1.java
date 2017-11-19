package H5;

public class Methode1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		int c = bereken(a,b);
		System.out.println(c);
		
		int d = 8;
		int e = 2;
		int f = bereken(d,e);
		System.out.println(f);
	}
	public static int bereken(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}	
		return result;
	}
}
