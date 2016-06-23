package by.htp3.home.april4.nod;

import java.util.Scanner;

public class Nod {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		int nod;

		a = enterInt("Vvedite pervoe chislo dlia opredelenija NOD : ");
		b = enterInt("Vvedite vtoroe chislo dlia opredelenija NOD : ");
		c = enterInt("Vvedite tret'e chislo dlia opredelenija NOD : ");
		nod = nod(a, b, c);
		System.out.println("NOD(" + a + "," + b + "," + c + ")= " + nod);

	}

	@SuppressWarnings("all") // отключение всех предупреждений
	public static int enterInt(String message) {

		int temp;
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		temp = sc.nextInt();
		// sc.close();
		return temp;

	}

	public static int nod(int x, int y, int z) {
		int nod = 0;
		if ((x > y) && (x > z)) {
			nod = y;
			if (y > z) {
				nod = z;
			} else {
				nod = y;
			}
		} else {
			nod = x;
			if (x > z) {
				nod = z;
			} else {
				nod = x;
			}

			while (!((x % nod == 0) && (y % nod == 0) && (z % nod == 0))) {
				nod--;
			}
			return nod;
		}
		return nod;

	}
}
/*
 * public static int nod(int x, int y, int z){ int nod = 0; if (x>y){ nod = y; }
 * else { nod = x; }
 * 
 * while (! ((x % nod == 0) && (y % nod == 0))){ nod--; } return nod; }
 */
