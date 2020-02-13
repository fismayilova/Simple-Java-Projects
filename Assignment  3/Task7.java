import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// entering the odd number > 2
		if (N > 2 && N % 2 != 0) {
			createPic(N);
		} else {
			System.out.print("Error!");
		}
		sc.close();
	}

	private static void createPic(int n) {
		// Number of rows
		for (int row1 = 0; row1 <= n - 1; row1++) {
			// Number of columns
			for (int col = 0; col <= n - 1; col++) {
				// we get the points around the middle or middle itself
				int column = n / 2 - Math.abs(n / 2 - col);
				int rows = n / 2 - Math.abs(n / 2 - row1);
				// we print * in the middle
				if (rows == n / 2 || column == n / 2) {
					System.out.print("* ");
				}
				// finding the location of #
				else if (column + rows >= n / 2) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
