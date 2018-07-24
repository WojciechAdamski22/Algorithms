package arrays;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array. The input array will only contain 0s and 1s.
 * 
 * Example
 * 
 * Input: Array: [1,1,0,1,1,1]
 * 
 * Output: 3
 * 
 * @author Wojciech Adamski
 *
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] array = { 1, 1, 0, 1, 1, 1 };
		System.out.println("Maximal count of consecutive ones in array = " + findMaxConsecutiveOnes(array));
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int currentCount = 0;
		int max = 0;
		for (int n : nums) {
			max = Math.max(max, currentCount = (n == 0 ? 0 : currentCount + 1));
		}
		return max;
	}

}
