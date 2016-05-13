
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
		for (int i = 0; i <20; i++) {

			synchronized (matrix) {
				matrix.fillDiagMatrix(id);;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
