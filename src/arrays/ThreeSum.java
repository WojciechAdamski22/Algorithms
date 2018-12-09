package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, are there elements a, b, c in array such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * The solution set must not contain duplicate triplets.
 * 
 * @author Wojciech Adamski
 *
 */
public class ThreeSum {

	public static void main(String[] args) {
		int[] inputArray = { -4, -3, 5, 3, 2, 1, 2, 6, 2, 7 };
		List<List<Integer>> output = threeSum(inputArray);
		output.forEach(l -> {l.forEach(el -> System.out.print(el + ", ")); System.out.println();});
	}

	/**
	 * 
	 * @param inputArray
	 * @return list of triplets that sums up to 0
	 */
	private static List<List<Integer>> threeSum(int[] inputArray) {
		Arrays.sort(inputArray);
		List<List<Integer>> output = new ArrayList<>();
		for(int i = 0; i<inputArray.length-2; i++ ){
			if(inputArray[i] != inputArray[i+1] || (inputArray[i] == inputArray[i+1] && i==inputArray.length-3)){
			int lo = i+1;
			int hi=inputArray.length-1;
			while (lo<hi){
				if(inputArray[lo]+inputArray[hi] > -inputArray[i]) {
					hi--;
				} else if (inputArray[lo]+inputArray[hi] < -inputArray[i]){
					lo++;
				} else if(inputArray[lo]+inputArray[hi] == -inputArray[i]){
					output.add(Arrays.asList(inputArray[i], inputArray[lo], inputArray[hi]));
					break;
				}
			}
			}
		}
		return output;
	}

}
