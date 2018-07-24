package arrays;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory. The order of elements can be changed. It doesn't matter what
 * you leave beyond the new length.
 * 
 * Example
 * 
 * Input: Array: [3,2,2,1,3,1], value = 3
 * 
 * Output: length = 4 with the first four elements in array 2,2,1,1 in any order
 * 
 * @author Wojciech Adamski
 *
 */
public class RemoveElement {

	public static void main(String[] args) {
		int[] array = { 2, 3, 2, 1, 3, 1 };
		int value = 3;
		System.out.println("New length = " + removeElement(array, value));

	}

	private static int removeElement(int[] nums, int val) {
		int slow = 0;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != val) {
				nums[slow++] = nums[fast];
			}
		}
		System.out.println("Array after changes = " + Arrays.toString(nums));
		return slow;

	}

}
