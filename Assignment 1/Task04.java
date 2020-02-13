import java.util.Scanner;

/* Task04 
 * 
 * Write a program that reads a positive integer N from console 
 * and prints out the maximum of its digits using loop statement. 
 * For example, if user enters 922396 then number 9 is printed. 
 */

public class Task04 {
	private static int max = 0;
	private static int reminder;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter positive integer N: ");
		int myNum = scan.nextInt();
		System.out.println("Maximum of its digits is: " + getMax(myNum));
		scan.close();
	}

	/**
	 * 
	 * @param myNum
	 *            The Number whose max digit will be computed
	 * @return greatest digit of the given integer
	 * 
	 */
	private static int getMax(int myNum) {
		while (myNum / 10 != 0) {
			myNum /= 10;
			max++;
		}
		return max+1;
	}

}
