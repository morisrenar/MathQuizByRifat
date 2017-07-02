package com.rifat.mathQuizPak;

/**
 * Created by bmshamsnahid on 7/2/17.
 */
public class ScoreCounter {
	
	private static Integer quizScore = 10;
	
	private static Integer myScore = 0;

	public static void increaseScore() {
		myScore += quizScore;
	}

	public static Integer getMyScore() {
		return myScore;
	}
	
}
