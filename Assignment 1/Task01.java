import java.util.Scanner;

/* Task01
 * 
 * Write a program, which gets as input four integers from console (use Scanner) 
 * and prints out their sum and product. 
 */

public class Task01 {
	private static int sum = 0;
	private static int prod = 1;
	private static int num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 4 Integers: ");
		sumAndProd(scan); // Gets sum and product in one method
		System.out.println("Sum is: " + sum);
		System.out.println("Product is: " + prod);
		scan.close();
	}

	/**
	 * This Method scans 4 integers. Adds and multiplies them.
	 * 
	 * @param scan
	 *            needed to get numbers from user
	 */

	private static void sumAndProd(Scanner scan) {
		for (int i = 1; i <= 4; i++) {
			num = scan.nextInt();
			sum += num;
			prod *= num;
		}
	}

}
