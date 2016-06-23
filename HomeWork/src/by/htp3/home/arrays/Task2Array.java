package by.htp3.home.arrays;

//import java.util.*;

import java.util.Scanner;

public class Task2Array {

	public static void main(String[] args) {
		int[] array;
		int sum = 0;
		
		array = enterArrayFromConsole("Please enter ur array: ", 7);
		for (int i=0; i<array.length; i++){
		   if (array[i]==i) {
			   sum += array[i];
		   }				
		}
		System.out.println("Sum of the array's elements for which index=the element: " + sum);
		
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
}
