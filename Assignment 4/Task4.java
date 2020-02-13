
/*
 * Given array of integers, create a method 
 *  int [] order49(int[] arr) which returns an array 
 *  that contains exactly the same numbers as the given
 *  array, but rearranged so that every 4 is immediately
 *  followed by a 9. Do not move the 4's, but every other
 *  number may move. The array contains the same number 
 *  of 4's and 9's, every 4 has a number after it that is
 *  not a 4 or 9, and a 4 appears in the array before any 9.
 */

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 4, 1, 9 };
		int[] nums2 = { 1, 4, 1, 9, 9, 4, 1 };
		int[] nums3 = { 4, 2, 2, 9 };

		nums1 = order49(nums1);
		nums2 = order49(nums2);
		nums3 = order49(nums3);

		System.out.println(Arrays.toString(nums1)); // [1,4,9,1]
		System.out.println(Arrays.toString(nums2)); // [1,4,9,1,1,4,9]
		System.out.println(Arrays.toString(nums3)); // [4,9,2,2]
	}

	/**
	 * this method moves nines so that they are near the fours
	 * 
	 * @param arr
	 *            array that is being modified
	 * @return modified version of the given Array
	 */
	public static int[] order49(int[] arr) {
		int post = 0;
		int forJ = 0;
		for (int i = forJ; i < arr.length; i++) {
			for (int j = post; j < arr.length; j++) {
				if (arr[i] == 4 && (arr[j] == 9) && j != 0 && arr[j - 1] != 4) {
					post = i + 1;
					swapElements(arr, j, post);
					forJ = i;
				}
			}
		}
		return arr;
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
	private static void swapElements(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}