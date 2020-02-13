
/*
 * Given array of integers, create a method int middleAverage(int[] arr) 
 *  which returns the "middle" average of an array of integers, which is 
 *  the mean average of its integers, except ignoring the largest and 
 *  smallest values in the array. If there are multiple copies of the 
 *  smallest value, ignore just one copy (consider other copies), 
 *  and likewise for the largest value. Use integer division to find the 
 *  final average. Assume that the array is length 3 or more.
 */

public class Task3 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 100 };
		int[] nums2 = { 1, 1, 5, 5, 10, 8, 7 };
		int[] nums3 = { -10, -4, -2, -4, -2, 0 };

		System.out.println((middleAverage(nums1))); // 3
		System.out.println((middleAverage(nums2))); // 5
		System.out.println((middleAverage(nums3))); // -3
	}

	/**
	 * 
	 * @param nums
	 *            Array whose middle average we need to find
	 * @return middle average
	 */
	public static int middleAverage(int[] nums) {
		int sum = 0;
		// For loops for sorting the Array
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					swapNums(nums, i, j);
				}
			}
		}
		for (int i = 1; i < nums.length - 1; i++) {
			sum += nums[i];
		}
		sum = sum / (nums.length - 2);
		return sum;
	}

	/**
	 * 
	 * @param array
	 *            that is being modified
	 * @param pos1
	 *            first int that is being swapped
	 * @param pos2
	 *            last int that is being swapped
	 */
	private static void swapNums(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}
