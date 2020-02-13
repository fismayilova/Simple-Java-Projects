import java.util.Scanner;

/* Task06
 * 
 * Implement a program that reads several integers (more than two integers) from 
 * console input and prints out the sum of the minimum and the maximum of the 
 * numbers user entered. Your program should read from console until it reads a 
 * sentinel that is 0 (zero). After reading 0 (zero), it should stop reading input print 
 * out the sum of min and max. Keep in mind, that Zero itself should NOT be 
 * considered as one of integers. 
 * 
 * For example, if the following is entered 3 -1 5 9 0, then 8.
 */

public class Task06 {
	private static final int SENTINEL = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Please enter integers ");
		System.out.println("Use " + SENTINEL + " to signal the end of the list.");
		int N = sc.nextInt();
		// The first max integer
		int max = N;
		// First min integer
		int min = N;
		System.out.print("The sum of Min and Max is: " + findTheSum(sum, max, min, sc));
		sc.close();
	}

	/**
	 * 
	 * @param sum
	 *            is the value that we are finding
	 * @param max
	 *            maximum value from the list of integers
	 * @param min
	 *            minimum value from the list of integers
	 * @param sc
	 *            scanner for continuation of list
	 * @return Sum of min and max
	 * 
	 * 
	 */
	private static int findTheSum(int sum, int max, int min, Scanner sc) {
		int N = sc.nextInt();
		while (N != SENTINEL) {
			if (N > max) {
				max = N;
			}
			if (N < min) {
				min = N;
			}
			N = sc.nextInt();
		}
		return sum = max + min;
	}

}