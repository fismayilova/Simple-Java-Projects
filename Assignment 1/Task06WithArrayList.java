import java.util.ArrayList;
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

public class Task06WithArrayList {
	private static final int SENTINEL = 0;

	public static void main(String[] args) {
		System.out.print("Please enter integers ");
		System.out.println("Use " + SENTINEL + " to signal the end of the list.");
		ArrayList<Integer> list = readArrayList();
		System.out.println("The sum is: " + findSum(list));
	}

	/**
	 * 
	 * @param list
	 *            The full Array list of integers
	 * @return the sum of maximum and minimum values of the list
	 */
	private static int findSum(ArrayList<Integer> list) {
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			min = (min < list.get(i)) ? min : list.get(i);
			max = (max > list.get(i)) ? max : list.get(i);
		}
		return (max + min);
	}

	/**
	 * This method adds entered integers to the ArrayList of integers
	 * 
	 * @return the full list of integers whose sum of min and max will be
	 *         computed
	 */
	private static ArrayList<Integer> readArrayList() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			int value = sc.nextInt();
			if (value == SENTINEL)
				break;
			list.add(value);
		}
		sc.close();
		return list;
	}
}
