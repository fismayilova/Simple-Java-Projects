/* 
 * Write a method public static String extractText(String str) that takes a string 
 * as argument and returns its content without digit characters and reducing whitespaces.
 * 
 * For example: 
 * extractText("He had 3 friends back in 2012.") -->  "He had friends back in."
 * Note that there are 1 space between had and friends, and no space after in.
 */

public class Task2 {

	public static void main(String[] args) {
		System.out.println(extractText("He had 3 friends back in 2012."));
		// He had friends back in.
		System.out.println(extractText("4 Friends + 4 emenies equals at least 5 Friends"));
		// Friends + enemies equals at least Friends
	}

	/**
	 * This method reduces numbers and whitespace
	 * 
	 * @param string
	 *            The original String
	 * @return new sentence
	 */
	private static String extractText(String string) {
		String sentence = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (!(ch >= '0' && ch <= '9' || (ch == ' '))) {
				sentence += ch;
			} else {
				sentence = sentence.trim();
			}
			if (ch == ' ' && !(string.charAt(i + 1) >= '0' && string.charAt(i + 1) <= '9')) {
				sentence += " ";
			}
		}

		return sentence;

	}

}