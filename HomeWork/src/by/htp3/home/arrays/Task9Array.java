package by.htp3.home.arrays;

import java.util.*;

public class Task9Array {

	public static void main(String[] args) {
		double[] array1 = { 1.45, 67.98, 9.67, 10.3, 7.2, 11, 45, 13 };
		double[] array2 = new double[] { 12.11, 45, 8, 9, 12 };

		double[] newArr = new double[array1.length + array2.length];

		int i = 0;
		do {
			newArr[i] = array1[i];
			i++;
		} while (i < array1.length);
		int j = 0;
		do {
			newArr[i] = array2[j];
			i++;
			j++;
		} while (j < array2.length);

		double tempMaxEl;

	   for (int n = newArr.length - 1; n > 0; n--) {
			for (i = 0; i < n; i++) {
				if (newArr[i] > newArr[i + 1]) {
					tempMaxEl = newArr[i];
					newArr[i] = newArr[i + 1];
					newArr[i+1] = tempMaxEl;
				}
			}
		}

		System.out.println("Your new array is look like ---> " + Arrays.toString(newArr));

	}

}
