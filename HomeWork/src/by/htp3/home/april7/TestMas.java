package by.htp3.home.april7;
//import java.util.*;

public class TestMas {

/*	public static void main(String[] args) {
		ColoredPoint[] cpa = new ColoredPoint[10];
		Point[] pa = cpa;
		System.out.println(pa[1] == null);
		try {
			pa[0] = new Point();
		} catch (ArrayStoreException e) {
			System.out.println(e);
		}
	}
}
class Point {
	int x, y;
}
class ColoredPoint extends Point {
	int color;
}
*/ // пример 1
	
	////////////////////////////////////////////////////
	/*public static void main(String[] args) {
		int[] a1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] a2 = a1;
		a2[2] = a2[2]*2;
		System.out.println(Arrays.toString(a2));
		System.out.println(a2[2]);
		System.out.println(a1[2]);

	}*/
	///////////////////////////////////////////////////
	
	public static void main(String[] args) {
	String[] array = {"abc", "def"};
	array[0] = null;
	String str = new String("def");
	str = str.intern();
	if (array[1]==str){
		System.out.println("yes1");
	}
	str = "asd";
	if (array[1]==str){
		System.out.println("yes2");
	}
	//System.out.println(array[0].equals(array[1]));
}
}
