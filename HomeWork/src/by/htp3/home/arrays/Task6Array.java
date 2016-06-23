package by.htp3.home.arrays;
import java.util.*;

public class Task6Array {

	public static void main(String[] args) {
		int[] array = new int[] { 0, 1, 2, 0, 10, 11, 0 };

		int j = (array.length) / 2;

		for (int k = 0; k < j; k++) {
			int temp;
			temp = array[k];
			array[k] = array[((array.length) - 1) - k];
			array[((array.length) - 1) - k] = temp;
		}
		System.out.println(Arrays.toString(array));

	}

}
