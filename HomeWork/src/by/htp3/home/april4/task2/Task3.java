package by.htp3.home.april4.task2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		int x;
		int composition;
		String message = "Vvedite 4-ehznachnoe chiclo";

		@SuppressWarnings("all")
		Scanner sc = new Scanner(System.in);
		x = enterInt(message);

		composition = digitsCompos(x);
		System.out.println(composition);
	}

	public static int enterInt(String message) {

		int temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		temp = sc.nextInt();
		return temp;
	}

	public static int digitsCompos(int k) {
		int compos = 1;
		compos =  (k / 1000) * (k % 10) *  ((k % 1000) / 100) *  (((k % 100) / 10));
		// compos = compos * (int)Math.nextDown((k%1000)/100) *
		// (int)Math.nextDown((k%100)/10);

		return compos;
	}
}
