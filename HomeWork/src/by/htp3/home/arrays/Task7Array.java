package by.htp3.home.arrays;
import java.util.*;

public class Task7Array {
	public static void main(String[] args) {
    
		int[][] array = new int[][] {
										{8, 9, 2, 1},
										{7, 5, 4, 6},
										{11, 10, 12, 13},
									} ;
int tempMax = 0;
int countMembrsOfSequence = 0;	

		for(int i=0; i< array.length; i++){
			for (int j=0; j<array[0].length; j++){
				
				if (tempMax < array[i][j]){
					     tempMax = array[i][j];
					     countMembrsOfSequence++;
				}
			}
			
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(array.length);
		System.out.println(countMembrsOfSequence);
		
		/*for (int i=0, j=0; i<6, j<6; i++, j++){
			
		}*/
	}

}
