import java.util.Scanner;

/*
 * This program finds an integer between given m and n that has the largest number
 * of factors. It prints out the maximum number of factors and an integer that
 * has that many factors.
 */

public class Task4 {
	static Scanner scan = new Scanner(System.in);
	private static int numOfFactors;
	private static int maxNum;
	private static int first;
	private static int last;

	public static void main(String[] args) {
		/*
		 * the error handling
		 */
		while (true) {
			first = scan.nextInt();
			last = scan.nextInt();
			if (last < first) {
				System.err.print("Wrong Input! Please re-enter m & n  ((m+1) < n): ");
				continue;
			} else
				break;
		}
		findTheFactors(first, last);
		System.out.println("");
		scan.close();
	}

	/**
	 * 
	 * @param first
	 *            first number in the sequence
	 * @param last
	 *            last in the sequence
	 */
	private static void findTheFactors(int first, int last) {
		for (int i = first; i <= last; i++) {
			int num = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					num++;
				}
			}
			if (num > numOfFactors) {
				numOfFactors = num;
				maxNum = i;
			}
		}
		System.out.println("Among numbers between " + first + " and " + last);
		System.out.println(maxNum + " Is the first number with maximum " + numOfFactors + " divisors.");
	}
}
