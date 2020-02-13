
/*
 * Given array of integers, create a method 
 *  int[] zeroComesFirst(int[] arr) which returns 
 *  an array that contains the exact same numbers 
 *  as the given array, but rearranged so that all 
 *  the zeros come at the start of the array. 
 * The order of the non-zero numbers does not matter. 
 * So {1, 0, 0, 1} becomes {0, 0, 1, 1}. 
 * You may modify and return the given array or 
 *  make a new array. If the given array does not have any zeros, 
 *  the method must return the exact same array.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		arr = getarray(n, sc, arr);
		arr = zeroComesFirst(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] getarray(int n, Scanner sc, int[] arr) {
		int nums = 0;
		for (int i = 0; i < n; i++) {
			nums = sc.nextInt();
			arr[i] = nums;
		}
		return arr;
	}

	public static int[] zeroComesFirst(int[] arr) {
		int someInt = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i+1]) {
				arr[i] = arr[someInt];
				arr[someInt] = 0;
			}
		}
		return arr;
	}
}
