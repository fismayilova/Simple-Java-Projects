import java.util.ArrayList;
import java.util.Scanner;

/*
 * This program asks the user for a list of names (one per line) till the user 
 *  enters an empty line (just hits Enter with no name). Then, the program must 
 *  print out the list of names user entered. 
 * Note that, the list can NOT contain the duplicate of the same name. So, you should 
 *  let the user know if he/she enters the same name (no matter how many times they do).
 *  (Hint: You may find an ArrayList makes it easy to keep track of the names entered).
 */

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		getTheList(sc, names);
		sc.close();
	}

	/**
	 * This method gets the list of names written by user
	 * 
	 * @param sc
	 *            Scanner for getting the names
	 * @param names
	 *            ArrayList that is being modified
	 */
	private static void getTheList(Scanner sc, ArrayList<String> names) {
		String newName = "";
		while (true) {
			System.out.print("Enter name: ");
			newName = sc.nextLine();
			if (newName.equals("")) {
				System.out.println(names.toString() + ".");
				break;
			} else {
			}
			if (names.contains(newName)) {
				System.out.println(newName + " already exists in the list!");
			} else {
				names.add(newName);
			}
		}
	}
}