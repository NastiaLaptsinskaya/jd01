package by.htp3.home.arrays;
import java.util.*;

public class Task10Array {
	public static void main(String[] args){
		
		int[] fractionNumerators = {5, 4, 7, 8, 2, 2};
		int[] fractionDenominators = new int[]{12, 36, 4, 18, 9, 3};
		
		int comDen = commonDenominator (fractionDenominators);
		fractionNumerators = castNumeratorsDenominators(comDen, fractionNumerators, fractionDenominators);
		fractionNumerators = ascendindOrderFractns(fractionNumerators);
		
		System.out.println("Your ascending array is ---->  " + Arrays.toString(fractionNumerators));
		
	}
	
	
	
	private static int commonDenominator (int[] array){
		System.out.println("Your array on the first iteration is ---->  " + Arrays.toString(array));
		////////////////
		int max = array[0];
		for (int i=0; i<array.length; i++){
			if (array[i]> max){
				max = array[i];
			}
		}///////////////
		System.out.println("Max element is ---->  " + max);
		////////////////
		int comDenominator = max;
		
		for (int i=0; i<array.length; i++){
			if( !(comDenominator % array[i] == 0) ){
				comDenominator += max;
			}
		}
		////////////////
		System.out.println("Common denominator is ---->  " + comDenominator);
		////////////////
		return comDenominator;
	}
	
	
	private static int[] castNumeratorsDenominators(int commonDenominator, int[]fractionNumerators, int[]fractionDenominators ){
		for (int k = 0; k < fractionNumerators.length; k++){
			fractionNumerators[k] = commonDenominator/fractionDenominators[k] * fractionNumerators[k];
		}
		return fractionNumerators;
	}
	
	public static int[] ascendindOrderFractns(int[] fractionNumerators){
		int tempMaxEl;

		   for (int n = fractionNumerators.length - 1; n > 0; n--) {
				for (int i = 0; i < n; i++) {
					if (fractionNumerators[i] > fractionNumerators[i + 1]) {
						tempMaxEl = fractionNumerators[i];
						fractionNumerators[i] = fractionNumerators[i + 1];
						fractionNumerators[i+1] = tempMaxEl;
					}
				}
			}
		   return fractionNumerators;
	}
	
	}
