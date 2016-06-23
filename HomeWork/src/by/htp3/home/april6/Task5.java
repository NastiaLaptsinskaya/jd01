package by.htp3.home.april6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		double Ds;
		double x1;
		double x2;

		String mes = "Vvedite koefficient";

		a = scan(mes);
		b = scan(mes);
		c = scan(mes);

		Ds = D(a, b, c);

		if (Ds >= 0) {
			if (a < 0 | a > 0) {
				x1 = koren1(a, b, c, Ds);
				x2 = koren2(a, b, c, Ds);

				System.out.println("Pervyj koren' vashego uravnenija raven x1 = " + x1);
				System.out.println("Vtoroj koren' vashego uravnenija raven x2 = " + x2);
			} else {
				x1 = -c / b;
				System.out.println("Koren' vashego uravnenija raven x1 = " + x1);
			}
		} else {
			System.out.println("Uvy! Diskriminant otricatel'nyj - uravnenie ne imeet kornej");
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

	public static double D(double aa, double bb, double cc) {
		double d;
		d = Math.pow(bb, 2) - 4 * aa * cc;
		return d;
	}

	public static double koren1(double aa, double bb, double cc, double DD) {
		return (((-bb + Math.sqrt(DD)) / (2 * aa)));
	}

	public static double koren2(double aa, double bb, double cc, double DD) {
		double temp;
		temp = ((+bb + Math.sqrt(DD)) / (2 * aa));
		return temp;
	}

	/*
	 * public static double korena0(double aa, double bb, double cc, double DD){
	 * return ( ( (-bb+Math.sqrt(DD) )/(2*aa) ) ); }
	 */

}
