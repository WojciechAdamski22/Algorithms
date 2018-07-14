package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 * 
 * Example
 * 
 * Input: Array: [4,5,3,2,1,6,7] Target: 12
 * 
 * Output: 1,6 (because because sum of 5 and 7 is 12)
 * 
 * @author Wojciech Adamski
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] inputArray = { 4, 5, 3, 2, 1, 6, 7 };
		int target = 12;
		int[] output = findIndices(inputArray, target);
		System.out.println(Arrays.toString(output));
	}

	/**
	 * 
	 * @param inputArray
	 * @param target
	 * @return indices of elements that sum up to given target or null if there are
	 *         no such elements in input array
	 */
	private static int[] findIndices(int[] inputArray, int target) {
		int[] outputIndices = new int[2];

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inputArray.length; i++) {
			Integer match = map.get(target - inputArray[i]);
			if (match == null) {
				map.put(inputArray[i], i);
			} else {
				outputIndices[0] = match;
				outputIndices[1] = i;
				break; // if one solution then we can stop looking
			}
		}
		return outputIndices[1] == 0 ? null : outputIndices;
	}

}
