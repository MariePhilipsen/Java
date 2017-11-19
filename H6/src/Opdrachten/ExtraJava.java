package Opdrachten;

import java.util.Scanner;

public class ExtraJava {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 100;
		int levelCompleted = 3;
		int bonus = 500;
		int finalScore = berekenFinalScore(score, levelCompleted, bonus);
		
		System.out.println("Final Score:" + finalScore);
		
		if(finalScore<100){
			System.out.println("Rookie");
		}else if (finalScore < 500) {
				System.out.println("Beginner");
			} else if (finalScore < 1000) {
					System.out.println("Advanced");
				} else {
					System.out.println("expert");
				}
		}

	public static int berekenFinalScore(int mijnScore, int mijnLevel, int mijnBonus) {
	int finalScore = mijnBonus * mijnLevel + mijnScore;

		return finalScore;

	}
}
