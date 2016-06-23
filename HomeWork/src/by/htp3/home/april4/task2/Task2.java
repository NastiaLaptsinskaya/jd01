package by.htp3.home.april4.task2;

import java.util.Scanner;
//import static java.lang.Math.*;

public class Task2 {

	public static void main(String[] args) {
		String s = "Vvedite znachenije X i Y : ";
		double x;
		double y;
		double result;

		x = enterInt(s);
		y = enterInt(s);

		result = ecuationCalc(x, y);
		System.out.println(result);
	}

	public static double enterInt(String message) {
		double temp;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(message);
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print(message);
		}
		temp = scan.nextDouble();
		return temp;
	}

	public static double ecuationCalc(double a, double b) {
		double num; // numerator
		double den; // denominator
		double result;

		num = 1 + Math.pow((Math.sin(a + b)), 2);
		den = 2 + Math.abs(a - 2 * a / (1 + Math.pow(a * b, 2)));
		result = num / den + a;
		return result;
	}
}
