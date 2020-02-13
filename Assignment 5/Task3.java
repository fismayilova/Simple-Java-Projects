/*
 * Write a method  public static int countDistinctVowels(String str) that  takes 
 *  as input two parameters consisting of an English and returns number of distinct 
 *  vowel occurrences inside the string (which means you must not count the same vowels twice). It must be case insensitive (means case of a letter must NOT matter).
 *  
 *  For example:
 *  countDistinctVowels("Hello Love Earth") -->  3

 */

public class Task3 {

	public static void main(String[] args) {
		System.out.println(countDistinctVowels("Hello Love Earth")); // 3
		System.out.println(countDistinctVowels("Be The Change You Wanna See In The World!")); // 5
	}

	/**
	 * This method counts the number of distinct vowels in the string
	 * 
	 * @param string
	 *            The original String
	 * @return number of distinct vowels
	 */
	private static int countDistinctVowels(String string) {
		int number = 0, a = 0, e = 0, u = 0, o = 0, i = 0;
		string = string.toLowerCase();
		for (int j = 0; j < string.length(); j++) {
			char ch = string.charAt(j);
			if (ch == 'a') {
				number++;
				a++;
				if (a > 1) {
					number--;
				}
			} else if (ch == 'e') {
				number++;
				e++;
				if (e > 1) {
					number--;
				}
			} else if (ch == 'u') {
				number++;
				u++;
				if (u > 1) {
					number--;
				}
			} else if (ch == 'o') {
				number++;
				o++;
				if (o > 1) {
					number--;
				}
			} else if (ch == 'i') {
				number++;
				i++;
				if (i > 1) {
					number--;
				}
			}

		}

		return number;
	}
}