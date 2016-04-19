package by.htp3.home.fraсtion;
import java.util.*;

public class ConsoleOutput {
	private Fraction fr1;
	private Fraction fr2;
	private Fraction[] frArr;
	private ArrayList<Fraction> frArrList;
	
/*	ConsoleOutput(Fraction fr1, Fraction fr2){
		this.fr1 = fr1;
		this.fr2 = fr2;	
	}
	
	ConsoleOutput(Fraction[] fr){
		this.frArr = fr;
	}
	
	ConsoleOutput(ArrayList<Fraction> frArrList){
		this.frArrList = frArrList;
	}*/
	
	public void consoleFrOutput(Fraction fr1){
		System.out.println("x =  " + fr1.getNumerator() + "/" + fr1.getDenominator());
	}
	
	public void consoleFrOutput(Fraction[] fr1){
		for(int i = 0; i<fr1.length; i++){
			System.out.print("x" + i + fr1[i].getNumerator() + "/" + fr1[i].getDenominator() + "  " );
		}
	} 
	
	public void consoleFrOutput(ArrayList<Fraction> frArrList){
		
	}
	
	
	

}
