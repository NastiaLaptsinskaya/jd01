package by.htp3.home.arrays;

public class Task12Array {

	public static void main(String[] args) {
		
		int n = 10;
		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				if (i == 0 | i == n-1 | j == 0 | j == n-1) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
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
