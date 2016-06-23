package by.htp3.home.april4.task1;

import java.util.Scanner;
import static java.lang.Math.*;

public class Start {

	public static void main(String[] args) {
		double x;
		double y;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite znachenije x:  ");
		x = sc.nextDouble();
		y = x - pow(x, 3) / 3 + pow(x, 5) / 5;
		System.out.println("y =" + y);
	}

}


/*import java.util.Scanner;

public class Example1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);
    }
}*/