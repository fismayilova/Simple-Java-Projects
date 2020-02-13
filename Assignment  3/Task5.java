import java.util.Scanner;

public class Task5 {
	private static String smallSpace = "  ";
	private static String bigSpace = "   ";
	private static String properSpace;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printMutTable(num);
		scan.close();
	}

	/**
	 * This method calculates and prints the multiplication table
	 * 
	 * @param num
	 *            Program prints multiplication table until that number
	 */
	private static void printMutTable(int num) {
		decorating(num);
		for (int row = 1; row <= num; row++) {
			System.out.print(row + " |");
			for (int col = 1; col <= num; col++) {
				properSpace = (row * col >= 10) ? smallSpace : bigSpace;
				System.out.print(properSpace);
				System.out.print(row * col);
			}
			System.out.println();
		}
	}

	/**
	 * This method is for star, dashes and extra numbers
	 * 
	 * @param num
	 *            Program prints multiplication table until that number
	 * 
	 */
	private static void decorating(int num) {
		System.out.print("* " + "|   ");
		for (int star = 1; star <= num; star++) {
			System.out.print(star + bigSpace);
		}
		System.out.println();
		for (int dash = 1; dash <= num * 2 + 2; dash++) {
			System.out.print("_ ");
		}
		System.out.println();
		System.out.println();
	}

}
