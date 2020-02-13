import java.util.Scanner;

/* Task05
 * 
 * Write a program that reads a positive integer N>1 from console and prints out 
 * product of its greatest divisor that is less than itself. For example, if number 8 is 
 * entered, 4 must be printed. Or if number 9 is entered, 3 must be printed. 
 */

public class Task05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter the Integer N>1: ");
		int N = scan.nextInt();
		int max = 1;
		// As the greatest divisors are after sqrt of integer, program checks
		// only divisors that are <= sqrt of N
		for (int i = (int) Math.sqrt(N); i < N; i++) {
			if (N % i == 0) {
				max = (max > i) ? max : i;
			}
		}
		System.out.println("The greates divisor is: " + max);
		scan.close();
	}

}
