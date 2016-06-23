package by.htp3.home.arrays;

import java.util.*;

public class Task8Array {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 3, 5, 6, 8, 11, 90 };
		int[] array2 = new int[] { 222, 333, 444, 56, 33, 11 };

		int k = 3;
		int[] arrayNew = arrPlusArr(array1, array2, k);
		System.out.println("Your new array is look like ---> " + Arrays.toString(arrayNew));

	}

	public static int[] arrPlusArr(int[] array1, int[] array2, int k) {

		int[] arrayNew = new int[array1.length + array2.length];

		int j = 0;
		int m = 0;

		for (int i = 0; i < arrayNew.length; i++) {
			if (i >= k & i < (k + array2.length)) {
				arrayNew[i] = array2[j];
				j++;
			} else {
				arrayNew[i] = array1[m];
				m++;
			}

		}
		return arrayNew;
	}
}
