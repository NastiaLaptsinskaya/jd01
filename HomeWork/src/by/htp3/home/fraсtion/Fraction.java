package by.htp3.home.fraсtion;

public class Fraction {
	private int numerator;
	private int denominator;
//////////////////////////////////////////////
	Fraction(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}
	Fraction(){

	}
//////////////////////////////////////////////
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
//////////////////////////////////////////////	
	
	private void castNumeratorsDenominators(Fraction fr2){
		int den2 = fr2.getDenominator();
		int num2 = fr2.getNumerator();
		
		int den1 = this.getDenominator();
		int num1 = this.getNumerator();
		
		int maxDen = den1;
		if(den2>den1){
			maxDen = den2;
		}
		
		int comDenominator = maxDen;
		if( !(comDenominator % den1 == 0 & comDenominator % den2 == 0) ){
			comDenominator += maxDen;
		}
		
		num1 = comDenominator/den1 * num1;
		num2 = comDenominator/den2 * num2;
		
		this.setNumerator(num1);
		this.setDenominator(comDenominator);
		
		fr2.setNumerator(num2);
		fr2.setDenominator(comDenominator);
		
		//den1 = den2 = comDenominator;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println( "After castNumeratorsDenominators x = " + this.getNumerator() + "/" + this.getDenominator());
		System.out.println( "After castNumeratorsDenominators y = " + fr2.getNumerator() + "/" + fr2.getDenominator());
		System.out.println("-------------------------------------------------------------------------");
		
 	}
	
	public Fraction sum(Fraction fr2){
		this.castNumeratorsDenominators(fr2);
		Fraction result = new Fraction(this.getNumerator() + fr2.getNumerator(), this.getDenominator());
		//result.setNumerator( this.getNumerator() + fr2.getNumerator());
		//result.setDenominator(this.getDenominator());
		return result;
	}
	
	public Fraction residual(Fraction fr2){
		this.castNumeratorsDenominators(fr2);
		Fraction result = new Fraction(this.getNumerator() - fr2.getNumerator(), this.getDenominator());
		//result.setNumerator( this.getNumerator() - fr2.getNumerator());
		//result.setDenominator(this.getDenominator());
		return result;
	}
	
	public Fraction composition(Fraction fr2){
		Fraction result = new Fraction(this.getNumerator() * fr2.getNumerator(), this.getDenominator()* fr2.getDenominator());
		//result.setNumerator(this.getNumerator() * fr2.getNumerator());
		//result.setDenominator( (int)Math.pow(this.getDenominator(), 2) );
		return result;
	}
	
	public Fraction quotient(Fraction fr2){
		Fraction result = new Fraction(this.getNumerator() * fr2.getDenominator(), this.getDenominator() * fr2.getNumerator() );
		//result.setNumerator(this.getNumerator() * fr2.getDenominator());
		//result.setDenominator( this.getDenominator() * fr2.getNumerator() );
		return result;
	}


}
