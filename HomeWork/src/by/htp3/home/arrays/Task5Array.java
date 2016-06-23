package by.htp3.home.arrays;
import java.util.*;

public class Task5Array {

	public static void main(String[] args) {
		String[] animalArr = new String[] { "cat", "panda", "dog", "cat", "monkey", "parrot", "monkey", "dog", "kiwi", 
											"panda", "bear", "duck", "duck", "parrot", "rabbit", "rabbit", "monkey", 
											"cat", "kiwi", "dragon", "kiwi", "dragon", "dragon", "dragon" };

		String tempMaxAnimal = animalArr[0];
		int tempMaxCount = 1;
		
		String[] animalNamesArr = new String[animalArr.length];
		int[] animalNums = new int[animalArr.length];
		
		int numIndx = -1;

		for (int i = 0; i < animalArr.length; i++) {
			if (animalArr[i] != "seen") {
				String tempAnimal = animalArr[i];
				int tempCount = 0;
				numIndx++;

				for (int j = i; j < animalArr.length; j++) {
					if (animalArr[j].equals(tempAnimal)) { // Esli postavit' ravno, to poluchim to zhe samoe i vse budet ok
						animalArr[j] = "seen";
						tempCount++;
					}
				}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
				animalNamesArr[numIndx] = tempAnimal;
				animalNums[numIndx] = tempCount;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
				if (tempCount >= tempMaxCount) {
					tempMaxCount = tempCount;
					tempMaxAnimal = tempAnimal;
				}
			}

		}
		double percents = (double)tempMaxCount/animalArr.length * 100;
		System.out.println(" ' " + tempMaxAnimal + " ' " + " zanimaet " + percents + " %  vseh otvetov");
	//////////////////////////////////////////////////////////////////////////////////////////////////////////	
		System.out.println(Arrays.toString(animalNamesArr));
		System.out.println(Arrays.toString(animalNums));
	}
	
	/*public static double theLargstAnmlPercNum(String[] animalArr){
		
		
	}*/
}
