/*
 * Write a method public static boolean isValidSchoolEmail(String email) that 
 *  takes as input a String parameter and checks if it is a valid University email 
 *  (they normally end with either .edu or its local variants, 
 *  such as .edu.az , .edu.tr and so on. Also, according to rules, 
 *  the ID part of emails must be at least 3 characters long and can only consist of 
 *  letters, numbers and underscore ('_'). 
 *  
 *  For example:
 *  
 *  isValidSchoolEmail("emil@ada.edu.az") --> true
 *  isValidSchoolEmail("tofig@qu.edu") -->  true
 *  isValidSchoolEmail("gulam@qu.edudd") -->  false
 *  isValidSchoolEmail("to@qu.edu") -->  false
 *  isValidSchoolEmail("to?fig@qu.edu") -->  false
 *  isValidSchoolEmail("eabbasov2019@ada.edu.tr") -->  true
 */

public class Task4 {

	public static void main(String[] args) {
		System.out.println(isValidSchoolEmail("emil@ada.edu.az")); // true
		System.out.println(isValidSchoolEmail("tofig@qu.edu")); // true
		System.out.println(isValidSchoolEmail("gulam@qu.edudd")); // false
		System.out.println(isValidSchoolEmail("to@qu.edu")); // false
		System.out.println(isValidSchoolEmail("to?fig@qu.edu")); // false
		System.out.println(isValidSchoolEmail("eabbasov2019@ada.edu.tr")); // true
		System.out.println(isValidSchoolEmail("eabbasov2019ada.edu.tr")); // false

	}

	/**
	 * This method checks if the given string is correctly written
	 * 
	 * @param string
	 *            The original String
	 * @return boolean true or false depending of validity of email address
	 */
	private static boolean isValidSchoolEmail(String string) {
		if (string.contains("@")
				&& ((string.endsWith("ada.edu.") || string.endsWith("qu.edu.") || string.endsWith("qu.edu")
						|| string.endsWith("ada.edu.tr") || string.endsWith("ada.edu") || string.endsWith("ada.edu.az"))
						&& string.substring(0, string.indexOf('@')).length() >= 3)) {
			for (int i = 0; i < string.indexOf('@'); i++) {
				char ch = string.charAt(i);
				if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '_') {
					i++;
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}