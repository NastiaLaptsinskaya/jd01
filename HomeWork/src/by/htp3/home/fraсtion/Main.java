package by.htp3.home.fraсtion;

public class Main {
		public static void main(String[] args) {
			Fraction fract1 = new Fraction(1, 8);
			Fraction fract2 = new Fraction(7, 24);
			
			System.out.println( "Before manipulations --> x =  " + fract1.getNumerator() + "/" + fract1.getDenominator());
			System.out.println( "Before manipulations --> y =  " + fract2.getNumerator() + "/" + fract2.getDenominator());
			
			Fraction cmp = fract1.composition(fract2);
			Fraction qtnt = fract1.quotient(fract2);
			Fraction sum = fract1.sum(fract2);
			Fraction rsdl = fract1.residual(fract2);
			
			//ConsoleOutput cl = new ConsoleOutput();
			ConsoleOutput.consoleFrOutput(fract1);
			
/*			System.out.println(" x + y =  " + sum.getNumerator() + "/" + sum.getDenominator());
			System.out.println(" x - y =  " + rsdl.getNumerator() + "/" + rsdl.getDenominator());
			System.out.println(" x * y =  " + cmp.getNumerator() + "/" + cmp.getDenominator());
			System.out.println(" x : y =  " + qtnt.getNumerator() + "/" + qtnt.getDenominator());*/
		}
}
