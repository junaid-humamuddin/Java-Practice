package Junaid.JournalDev;

import java.util.Arrays;

public class ForLoopWithLabels {

	public static void main(String[] args) {
		int[][] intArr = { { 1, -2, 3 }, { 0, 3, 7, 8, 7 }, { 1, 2, 5 }, { 9, 2, 5 } };

		process: for (int i = 0; i < intArr.length; i++) {
			boolean allPositive = true;
			for (int j = 0; j < intArr[i].length; j++) {
				if (intArr[i][j] < 0) {
					allPositive = false;
					continue process;
				}
			}
			if (allPositive) {
				// process the array
				System.out.println("Processing " + Arrays.toString(intArr[i]));
			}
			allPositive = true;
		}

	}

}
