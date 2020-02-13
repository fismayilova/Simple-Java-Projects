import java.util.Scanner;

/*
 * Write a Console Program that can output the integer numbers from m to n (both inclusive!). 
 * However, if the current number is divisible by 3, then print "Love" instead of the number and if the number 
 *  is divisible by 7, then print "Java". For numbers which are divisible by both 3 and 7 print "LoveJava". 

Note 1: You should also do the error handling, such as when user enters wrong m and n (where m>n) you notify 
 the user about the wrong input and ask to re-enter! 
Note 2: Create a method (that takes two int parameters) to print the results on the Console window.

 */

//import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * the error handling
		 */
		while (true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (n > m) {
				printNums(m, n);
				break;
			} else {
				System.err.println("ERROR!!! Please enter M<N.");
				continue;
			}
		}
		sc.close();
	}

	/**
	 * 
	 * @param m
	 *            first number in the sequence
	 * @param n
	 *            last number in the sequence
	 */
	private static void printNums(int m, int n) {
		for (int i = m; i <= n; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) {
				System.out.println("LoveJava");
			} else if (i % 7 == 0) {
				System.out.println("Java");
			} else if (i % 3 == 0) {
				System.out.println("Love");
			} else {
				System.out.println(i);
			}
		}
	}
}
