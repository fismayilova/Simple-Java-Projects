import java.util.Scanner;

/* Task03 
 * 
 * Write a program that reads an integer N from console and prints the first N 
 * elements of Fibonacci sequence using loop statement (NOT recursion!). 
 * The Fibonacci sequence is the series of numbers: 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34… 
 * The next number is found by adding up the two numbers before it: 
 * F(0)=0, F(1)=1, F(n) = F(n-1) + F(n-2)
 */

public class Task03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter an Integer: ");
		int N = scan.nextInt();
		int first = 0;
		int second = 1;
		int third = 1;
		// First 3 numbers of sequence are printed separately
		System.out.print("first N elements of Fibonacci sequence are: " + first + ", " + second + ", " + third);
		for (int i = 0; i < N - 3; i++) {
			first = second; // assigns two previous numbers to first and second
			second = third;
			third = first + second; // third is found by adding first and second
			System.out.print(", " + third);
		}
		System.out.print("...");
		scan.close();
	}
}
