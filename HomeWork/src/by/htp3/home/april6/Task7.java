package by.htp3.home.april6;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		double x;
		double y;
		boolean h;

		int r1 = 4;
		int r2 = 3;

		String message = "Vvedite koordinatu";

		x = scan(message);
		y = scan(message);

		h = hit(x, y, r1, r2);

		if (h == true) {
			System.out.println("Popadanie");
		} else {
			System.out.println("Mimo");
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

	public static boolean hit(double xx, double yy, int r1, int r2) {
		boolean hit;
		int maxrad;

		if (r1 > r2) {
			maxrad = r1;
		} else {
			maxrad = r2;
		}
		if (xx > 0 && Math.abs(xx) <= maxrad && Math.abs(yy) <= maxrad) {
			if (yy > 0 && Math.pow(xx, 2) + Math.pow(yy, 2) <= Math.pow(r1, 2)) {
				hit = true;
			} else {
				if (yy < 0 && Math.pow(xx, 2) + Math.pow(yy, 2) <= Math.pow(r2, 2)) {
					hit = true;
				} else {
					hit = false;
				}
				// hit = false;
			}

			// Math.pow(xx, 2) + Math.pow(yy, 2) = Math.pow(r1, 2);
			// Math.pow(xx, 2) + Math.pow(yy, 2) = Math.pow(r2, 2);
		} else {
			hit = false;
		}
		return hit;
	}
}
