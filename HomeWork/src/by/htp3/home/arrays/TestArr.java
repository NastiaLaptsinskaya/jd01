package by.htp3.home.arrays;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TestArr {

	public static void main(String[] args) {
		ColoredPoint[] cpa = new ColoredPoint[10];
		Point[] pa = cpa;
		
		ColoredPoint m = new ColoredPoint();
		//m.color = 8;
		//Object mObj = m;
		//System.out.println(m==mObj);
		
		m.out("6");
		
		pa[1] = new ColoredPoint();
		System.out.println(pa[1] == null);
		try {
			pa[0] = new Point();
		} catch (ArrayStoreException e) {
			System.out.println(e);
		}
		
		//mObj.out("1");

		/*
		 * int[][] ia = { { 1,2 }, null }; int ja[][] = (int[][])ia.clone();
		 * System.out.println(Arrays.deepToString(ia));
		 * System.out.println(Arrays.deepToString(ja));
		 */

		/*
		 * int[][] array = new int[][]{ {1,2,3,4,5}, {1,2,3,4,5,6,7}, {1,2,3},
		 * {1,2,3,4}, {1}
		 * 
		 * }; int lengthStr = array.length; int[] lengthColumn = new
		 * int[lengthStr];
		 * 
		 * for (int i=0; i<lengthStr; i++){ lengthColumn[i] = array[i].length;
		 * 
		 * }
		 * 
		 * System.out.println("length = " + lengthStr); System.out.println(
		 * "length array = " + Arrays.toString(lengthColumn));
		 */

		/*
		 * String str = "I like"; System.out.println("Before: " + str);
		 * changeString(str); System.out.println("After: " + str); }
		 * 
		 * public static void changeString(String s){ System.out.println(
		 * "          - before change: " + s); s = s + " Java.";
		 * System.out.println("          - after change: " + s);
		 */
	}

}

class Point {
	int x, y;
	public void out(String s){
		System.out.println(s + "  вызвался родитель1");
	}
	/*public void out(int s){
		System.out.println(s + "  вызвался родитель2");
	}*/
}

class ColoredPoint extends Point {
	int color;
	protected  void out(int s){
		System.out.println(s + "  вызвался наследник");
	}
}