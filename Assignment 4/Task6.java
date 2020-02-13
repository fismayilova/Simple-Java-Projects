/*
 * Given a 2D (two dimensional) NxN array of integers 
 *  (N>2, N is always odd), create the following method
 *  boolean isOddMatrix(int[][] arr) which returns true
 *  if the product (multiplication) of the  numbers in 
 *  both diagonals of the matrix is odd, otherwise false.
 *  
 * (Help note:  Think of a matrix (2D array) as a square 
 *  rectangle. Therefore, in the matrix below, the numbers
 *  in the 1st diagonal is 1, 5, 7 and in the 2nd diagonal 3, 5, 7).
 */

public class Task6 {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 4, 3 }, { 2, 5, 6 }, { 7, 8, 7 } };
		int[][] matrix2 = { { 0, 5, 9, 7, 3 }, { 1, 5, 6, 8, 3 }, { 4, 7, 5, 9, 3 }, { 3, 2, 1, 6, 0 },
				{ 4, 2, 6, 7, 9 } };

		System.out.println(isOddMatrix(matrix1)); // true
		System.out.println(isOddMatrix(matrix2)); // false
	}

	/**
	 * This method checks two diagonals of Array
	 * 
	 * @param arr
	 *            Two Dimensional Array that is being checked
	 * @return True if the product of the numbers in both diagonals of the
	 *         matrix is odd.
	 */
	public static boolean isOddMatrix(int[][] arr) {
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					n *= arr[i][j];
				} else {
					continue;
				}
			}
		}
		for (int i = arr.length; i <= 0; i--) {
			for (int j = arr.length; j <= 0; j--) {
				if (i == j) {
					n *= arr[i][j];
				} else {
					continue;
				}
			}
		}
		if (n % 2 == 0) {
			return false;
		}
		return true;
	}
}
