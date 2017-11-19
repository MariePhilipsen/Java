package H5;

import java.util.Scanner;
public class DubbeleLoop3 {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--) {
			for(int k=i-1; k>=1;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=5-i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
