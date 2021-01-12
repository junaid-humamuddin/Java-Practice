package com.cf.example.Practice;

public class GettersSettersExample2 {

	public static void main(String[] args) {
		Ecncapsule ec = new Ecncapsule();
		int[] myScores = { 5, 5, 4, 3, 2, 4 };
		ec.setScores(myScores);
		ec.displayScores();
		myScores[1] = 1;
		ec.displayScores();
	}

}

class Ecncapsule {
	private int[] scores;

	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return this.scores;
	}

	/**
	 * @param scores
	 *            the scores to set
	 */
	public void setScores(int[] scores) {
		// this.scores = scores; // if we dont want the array to be modified used the
		// snippet as shown below
		this.scores = new int[scores.length];
		System.arraycopy(scores, 0, this.scores, 0, scores.length);
	}

	public void displayScores() {
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
}
