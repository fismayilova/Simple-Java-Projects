/*
 * Write a method public static String invertString(String str) that 
 *  takes a string as input and returns a string with all the letter 
 *  cases inverted. However, note that you CANNOT use Character class.
 *  
 *  For example:
 *  invertString("Hello World There!") --> "hELLO wORLD tHERE!"
 */

public class Task1 {

	public static void main(String[] args) {
		System.out.println(invertString("Hello World There!")); // hELLO wORLD
																// tHERE!
		System.out.println(invertString("Bye Bye World :(")); // bYE bYE wORLD
																// // :(
	}

	/**
	 * This method inverts the cases of every char in the string
	 * 
	 * @param string
	 *            The original String
	 * @return new sentence with inverted case
	 */
	private static String invertString(String string) {
		String sentence = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			sentence += (ch >= 'A' && ch <= 'Z') ? (char) (ch - 'A' + 'a') : (char) (ch + 'A' - 'a');
			if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
				sentence += ch;
			}
		}
		return sentence;
	}

}
