package arrays;

/**
 * 
 * Given n non-negative integers a1, a2 ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i,ai) and (i,0). Find two lines, which together with x-axis
 * forms a container that contains the most water.
 * 
 * n is at least 2
 * 
 * Example
 * 
 * Input: Array: [10, 9, 8, 40, 8, 8, 8, 30, 8, 8, 8, 8, 8, 160, 160, 11]
 * 
 * Output: "Best lines are number 3 and 14 because Capacity is 440"
 * 
 * @author Wojciech Adamski
 *
 */
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] heights = { 10, 9, 8, 40, 8, 8, 8, 30, 8, 8, 8, 8, 8, 160, 160, 11 };
		findBiggestContainer(heights);
	}

	private static void findBiggestContainer(int[] heights) {
		int maxCapacity = 0;
		int currentCapacity = 0;
		int left = 0;
		int right = heights.length - 1;
		int[] bestMatch = {left, right};
		while (left < right) {
			currentCapacity = Math.min(heights[left], heights[right]) * (right - left);
			if (currentCapacity > maxCapacity) {
				maxCapacity = currentCapacity;
				bestMatch[0] = left;
				bestMatch[1] = right;
				
			}
			if (heights[left] < heights[right]) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println("Best lines are number " + bestMatch[0] + " and " + bestMatch[1] + " because Capacity is " + maxCapacity);
	}
}
