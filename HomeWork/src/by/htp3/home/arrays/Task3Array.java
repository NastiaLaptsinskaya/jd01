package by.htp3.home.arrays;


import java.util.Scanner;

public class Task3Array {

	public static void main(String[] args) {
		int[] array;

		array = enterArrayFromConsole("Please enter ur array: ", 7);
		double pNumOfOdd = percentNumOfOddEl(array);

		System.out.println("The percent number of odd elements is --- " + pNumOfOdd + "%");

	}

	public static int[] enterArrayFromConsole(String mes1, int arrayLength) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] array = new int[arrayLength];
		System.out.println(mes1);
		for (int i = 0; i < arrayLength; i++) {
			System.out.print("Please enter  " + (i + 1) + "  member of the array:  ");
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static double percentNumOfOddEl(int[] arr) {
		int oddNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 2 == 0)) {
				oddNum++;
			}
		}
		double percentNumOfOddEl = ((double) oddNum / (double) arr.length) * 100;
		return percentNumOfOddEl;
	}
}
