package by.htp3.home.april6;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		double di;
		double bi;
		
		double sum;
		double res;
		double comp;
		double quot;
		
		String mes = "Vvedite chislo";
		
		di = scan(mes);
		bi = scan(mes);
		
		sum = sum(di, bi);
		res = residual(di, bi);
		comp = composition(di, bi);
		quot = quotient(di, bi);
		
		System.out.println("Summ = " + sum + "; Residual = " + res + "; Composition = " + comp + "; Quotient = " + quot);
		

	}
	@SuppressWarnings("resource")
	public static double scan(String message){
		
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
	
	public static double sum(double x, double y){
		return(x+y);
	}
	
	public static double residual(double x, double y){
		return(x-y);
	}
	
	public static double composition(double x, double y){
		return(x*y);
	}
	
	public static double quotient(double x, double y){
		return(x/y);
	}

}
