import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		int numOfHs = 1;
		for (int i = 0; i < lines; i++) { // number of lines
			numOfHs += i;
			for (int j = 1; j <= numOfHs; j++) { // adds +1 times #
				System.out.print("#");
			}
			System.out.println();
		}
		scan.close();
	}

}
