package arrays;

import java.util.Arrays;

/**
 * Given an sorted array of integers, remove all duplicates from it
 * 
 * Example
 * 
 * Input: Array: [1,1,2,3,4,4,5,6]
 * 
 * Output: Array: [1,2,3,4,5,6]
 * 
 * @author Wojciech Adamski
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arrayWithDuplicates = {1,1,2,3,4,4,5,6};
		int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);
		System.out.println(Arrays.toString(arrayWithoutDuplicates));
	}

	private static int[] removeDuplicates(int[] arrayWithDuplicates) {
		return Arrays.stream(arrayWithDuplicates).distinct().toArray();
	}

}
