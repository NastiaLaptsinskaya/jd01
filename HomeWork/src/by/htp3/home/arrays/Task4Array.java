package by.htp3.home.arrays;
import java.util.*;

public class Task4Array {
	public static void main(String[] args){
		
		int[] array = new int[] {0, 1, 2, 0, 10, 11, 0, 8};
		int zeroCount = 0;
		
		for (int i=0; i<array.length; i++){
			if (array[i]==0){
				zeroCount++;
			}
		}
		
		int[] arrayWithoutZeros = new int[array.length-zeroCount];
		int k = 0;
		for (int i=0; i<array.length; i++){
			if (array[i]!=0){
				arrayWithoutZeros[k] = array[i];
				k++;
			}
		}
		System.out.println(zeroCount);
		System.out.println(Arrays.toString(arrayWithoutZeros));
	}

}
