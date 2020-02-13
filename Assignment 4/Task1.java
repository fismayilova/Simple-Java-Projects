/*
 * Given array of integers, create a boolean method 
 *  boolean isOnly916(int[] arr) which returns true 
 *  if every element is 9, 1 or 6.  
 */

public class Task1 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 9, 1, 6 };
		int[] nums2 = { 1, 9, 2, 6 };
		int[] nums3 = { 1 };

		System.out.println(isOnly916(nums1)); // true
		System.out.println(isOnly916(nums2)); // false
		System.out.println(isOnly916(nums3)); // true
	}

	/**
	 * This method checks if array consists of 1,9,6
	 * 
	 * @param arr
	 *            Array we need to modify
	 * @return true if array consist of
	 */
	public static boolean isOnly916(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1 || arr[i] > 1 && arr[i] < 6 && arr[i] < 9 || arr[i] > 9) {
				return false;
			}
		}
		return true;
	}

}
