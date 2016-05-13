
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Matrix matr = new Matrix();
		
		MatrixFiller filler1 = new MatrixFiller(matr, 1);
		MatrixFiller filler2 = new MatrixFiller(matr, 2);
		MatrixFiller filler3 = new MatrixFiller(matr, 3);
		MatrixFiller filler4 = new MatrixFiller(matr, 4);
		
		Thread thr1 = new Thread(filler1);
		Thread thr2 = new Thread(filler2);
		Thread thr3 = new Thread(filler3);
		Thread thr4 = new Thread(filler4);
		
		matr.matrixShow();
		
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        
        thr1.join();
        thr2.join();
        thr3.join();
        thr4.join();
        
        System.out.println("-----------------------------------------------------------");
        matr.matrixShow();
	}

}
