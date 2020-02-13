import java.util.Scanner;

/* Task02
 * 
 * Write a program that reads an integer N and a double D from console and 
 * prints out that double D on separate lines 2*N+1 times. 
 * 
 * For example, if user enters 1  4.5 then the output should be like this:
4.5
4.5
4.5

 */

public class Task02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter Integer: ");
		int N = scan.nextInt(); // Enter N
		System.out.print("Please enter Decimal: ");
		double D = scan.nextDouble(); // Enter D
		for (int i = 0; i < (2 * N + 1); i++) {
			System.out.println(D);
		}
		scan.close();
	}

}
