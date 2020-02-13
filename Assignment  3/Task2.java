import java.util.Random;
import java.util.Scanner;

/* Create a simple command line game program guessing a whole number.

•	Let the computer "think" about a whole number between -12~19 (both exclusive) 
using following statement to generate a random number:
•	During the game, player continuously guesses a number by entering it from console
•	If the guess was bigger than X print out “Nope! Try smaller”
•	If the guess was smaller than X print out “Nope! Try bigger”
•	If the player finds the correct number, print out “Now you got it!”, 
then in the new line print how many guesses you did all together
(e.g. “Total guesses you did to win: 11”) and quit the program.
*/

public class Task2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int X = 13 + rand.nextInt(7);
		int count = 0;
		guessTheNumber(X, count);
	}

	/**
	 * 
	 * @param x
	 *            Random number picked by computer
	 * @param count
	 *            Counter for the number of guesses of the user
	 */
	private static void guessTheNumber(int x, int count) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number (-12~19): ");
		while (true) {
			int myGuess = scan.nextInt();
			if (myGuess == x) {
				count++;
				System.out.println("Now you got it!" + '\n' + "Total guesses you did to win: " + count);
				break;
			} else if (myGuess < x) {
				System.out.println("Nope! Try bigger");
				count++;
				continue;
			} else if (myGuess > x) {
				System.out.println("Nope! Try smaller");
				count++;
				continue;
			}
		}
		scan.close();
	}
}
