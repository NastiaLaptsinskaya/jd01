
public class MatrixFiller implements Runnable {
	private Matrix matrix;
	private int id;

	public MatrixFiller(Matrix matrix, int id) {
		this.matrix = matrix;
		this.id = id;
		System.out.println("Hi! I've just created MatrixFiller with  " + id + " ID ");
	}

	/////////////////////////////////////////

	public int getId() {
		return id;
	}

	//////////////////////////////////////////
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {

			synchronized (this.matrix) {
				fillDiagMatrix(this.matrix);
				
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/////////////////////////////////////////////////////////
	public void fillDiagMatrix(Matrix m) {
		int[][] array = m.getMatrix();
		for (int i = 0; i < array.length; i++) {

			if (array[i][i] == 0) {

				array[i][i] = this.id; // in the case of not zero diagElement -->
				// thread fills the el with ID
				break;
			}
		}
	}
}
