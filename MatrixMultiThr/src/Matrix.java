import java.util.Arrays;

public class Matrix {
	private int[][] matrix;

	/////////////////////////////////////////////////////////
	public Matrix(int numRows, int numColumns) {
		this.matrix = createMatrix(numRows, numColumns);
	}

	public Matrix() {
		this.matrix = createMatrix(10, 10);
	}

	/////////////////////////////////////////////////////////
	public int[][] getMatrix() {
		return this.matrix;
	}

	/////////////////////////////////////////////////////////
/*	public void fillDiagMatrix(int value) {
		for (int i = 0; i < this.matrix.length; i++) {
           
			if (matrix[i][i] == 0) {

				matrix[i][i] = value; // in the case of not zero diagElement -->
								      // thread fills the el with ID
                break;
			} 
		}
	}
*/
	/////////////////////////////////////////////////////////
	private int[][] createMatrix(int numRows, int numColumns) {
		int[][] matrix = new int[numRows][numColumns];

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {

				matrix[i][j] = 0;

			}
		}
		return matrix;
	}

	/////////////////////////////////////////////////////////
	public void matrixShow() {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
