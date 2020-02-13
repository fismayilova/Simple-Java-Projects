import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		// Number of rows
		for (int row = 1; row <= N; row++) {
			// Number of columns
			for (int col = 1; col <= N * 2 - 1; col++) {
				int col_sym = N - Math.abs(N - col);
				// we start checking from row = 2
				if (row > 1) {
					// if the col_sum is less than the number in the middle
					if (col_sym <= (N - num))
						System.out.print(col_sym + "  ");
					else
						System.out.print("   ");
				}
				// printing the rest
				else
					System.out.print(col_sym + "  ");
			}
			// numbers in the middle changes line by line
			num++;
			System.out.println();
		}
		sc.close();
	}
}
