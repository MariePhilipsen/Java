package Opdrachten;

public class Opdracht3 {

	public static void main(String[] args) {
	 int [] [] tabel = new int [4][6];
	 
	 //tabel vullen
	 
	 for(int rij=0; rij < tabel.length; rij++) {
		 for(int kol=0; kol < tabel[rij].length; kol++) {
			tabel [rij] [kol] = rij*kol; 
		 }
	 }
	 // tabel drukken via for each
	 for (int rij [] : tabel) {
		 for (int el : rij) {
			 System.out.print(el + "\t");
		 }
		 System.out.println();
	 }
	}

}
