package by.htp3.home.arrays;

import java.util.*;

public class Task1Array {

	public static void main(String[] args) {
		double[] array = new double[10];
		int[] nums;
		String message = "Please, enter your array";

		array = enterArrayFromConsole(message, array.length);
		System.out.println(Arrays.toString(array));

		nums = createArrayOfIndxsNlls(array);
		System.out.println(Arrays.toString(nums));
	}

	public static double[] enterArrayFromConsole(String mes1, int arrayLength) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double[] array = new double[arrayLength];
		System.out.println(mes1);
		for (int i = 0; i < arrayLength; i++) {
			System.out.print("Please enter  " + (i + 1) + "  member of the array:  ");
			array[i] = sc.nextDouble();
		}
		return array;
	}

	public static int countNulls(double[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				count += 1;
			} // Schitaem kol-vo nulej v massive i zapisyvaemih ih kol-vo v peremennuju count
			
		}
		return count;
	}

	public static int[] createArrayOfIndxsNlls(double[] ar) {

		int count = countNulls(ar);

		int[] arrayOfIndxs = new int[count];
		int tempIndx = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				// int tempIndx = 0;
				arrayOfIndxs[tempIndx] = i + 1;
				tempIndx++;
			}
		}
		return arrayOfIndxs;
	}
}
