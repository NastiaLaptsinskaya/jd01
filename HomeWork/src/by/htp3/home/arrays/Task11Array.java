package by.htp3.home.arrays;

public class Task11Array {
	public static void main(String[] args) {

		int n = 10;
		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				if (i == 0 | i % 2 == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = n - j;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			for (int p = 0; p < array[0].length; p++) {
				System.out.print(" " + array[k][p] + "\t");
			}
			System.out.println();
		}
	}

}
