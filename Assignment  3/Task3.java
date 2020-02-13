import java.util.Random;

/*
 * Write a Console Program that simulates rolling two die 
 * (Note: The word "dice" is a plural, as in "two dice." The singular is "die.") and 
 *  see if you can get Double Sixes within 3 chances. If you succeed, then print "Yeah, I rock at this!", 
 *  otherwise print "Ahh, today is just not my day, I guess :( ".
 */

//import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		Random rand = new Random();
		// Rolls 3 times
		for (int i = 1; i <= 3; i++) {
			int first = 1 + rand.nextInt(6);
			int second = 1 + rand.nextInt(6);
			System.out.println("Chance #" + i + ":  " + first + "  " + second);
			// if dice are both 6 you win!!!
			if (first == 6 && second == 6) {
				System.out.print("\nYeah, I rock at this!");
				break;
			}
			// if they are not
			if (i == 3 && !(first == 6 && second == 6)) {
				System.out.println("Ahh, today is just not my day, I guess :( ");
			}
		}
	}
}