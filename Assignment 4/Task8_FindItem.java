package extra;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Create an ArrayList that can hold 10 Integers, and fill each index with a 
 *  different random value from 1-50. Display those values on the screen, and 
 *  then prompt the user for an integer input. Search through the ArrayList,
 *  and if the item is present, give the index number where it is located. 
 * If the value is not in the ArrayList, display a single message saying so. 
 * If the value is present more than once, display the message as many times 
 *  as necessary. 
 */

public class Task8_FindItem {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numOfUser = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		getTheNums(rand, nums);
		System.out.print("Value to find: ");
		checkingTheNums(sc, nums, numOfUser);
		sc.close();
	}

	/**
	 * This method checks if the item is present
	 * 
	 * @param sc
	 *            Scanner for user to enter the number he checks
	 * @param nums
	 *            Array of nums That already exist
	 * @param numOfUser
	 *            Number that user checks
	 */
	private static void checkingTheNums(Scanner sc, ArrayList<Integer> nums, int numOfUser) {
		numOfUser = sc.nextInt();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.contains(numOfUser)) {
				if (nums.get(i) == numOfUser) {
					System.out.println(numOfUser + " is in index " + i);
				} else {

				}
			} else if (!(nums.contains(numOfUser))) {
				System.out.println(numOfUser + " Is not in the ArrayList!");
				break;
			}
		}
	}

	/**
	 * This method gets 10 random numbers adds them to ArrayList
	 * 
	 * @param rand
	 *            Random for random numbers
	 * @param nums
	 *            ArrayList that is being modified
	 */
	private static void getTheNums(Random rand, ArrayList<Integer> nums) {
		for (int i = 0; i < 10; i++) {
			int randNum = 1 + rand.nextInt(50);
			nums.add(randNum);
		}
		System.out.println("ArrayList: " + nums.toString());
	}
}