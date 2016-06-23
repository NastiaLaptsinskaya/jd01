package by.htp3.home.april6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		double x;
		double y;

		String message = "Vvedite koordinatu";

		x = scan(message);
		y = scan(message);

		if ((x > -4 && x < 4) && (y > -3 && y < 4)) {
			if (((x > -4 && x < 4) && (y > -3 && y < 0)) | ((x > -2 && x < 2) && (y > 0 && y < 4)))
				System.out.println("Tochka prinadlezhit oblasti");

		} else {
			System.out.println("Mimo :(");
		}
	}

	@SuppressWarnings("resource")
	public static double scan(String message) {

		double temp;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}
		temp = sc.nextDouble();
		// sc.close();
		return temp;

	}
}
