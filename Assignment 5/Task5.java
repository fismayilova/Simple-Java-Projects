/*
 * Write a method public static boolean isValidTime(String time) that takes as 
 *  input parameter a string and validates it by checking if the string is in one 
 *  of the following formats:
 *   "hh:mm" or "hh:mm AM/PM" (AM/PM should come after 1 whitespace and can be 
 *   either uppercase, lowercase or mixed).
 *   
 *   The method should return true if the string is valid and false otherwise.
 *    
 *   For example, the valid times samples are: 
 *   "13:45",  "1:45 PM",  "01:45 pm" , "03:40",  "3:40",   "6:20 Am" 
 *   
 *   For example, the following strings are invalid time samples:
 *   "43:45",  "13:30 am",    "1:75 PM",  "1:45 PS",  "111:45 pm" ,
 *   "03-40",  "3::30",   "6:y0 Am",  "3:30am",   "3:30    am" ,  "3:30 a  m",   
 *   "03:60" (because mm<60)
 *   
 *   isValidTime("13:45") -->  true
 *   isValidTime("43:45") -->  false
 */

public class Task5 {

	public static void main(String[] args) {
		System.out.println(isValidTime("13:45")); // true
		System.out.println(isValidTime("1:45 PM")); // true
		System.out.println(isValidTime("01:45 pm")); // true
		System.out.println(isValidTime("03:40")); // true
		System.out.println(isValidTime("3:40")); // true
		System.out.println(isValidTime("6:20 Am")); // true
		System.out.println(isValidTime("00:00")); // true
		System.out.println(isValidTime("12:00")); // true
		
		System.out.println(isValidTime("43:45")); // false
		System.out.println(isValidTime("13:30 am")); // false
		System.out.println(isValidTime("1:75 PM")); // false
		System.out.println(isValidTime("1:45 PS")); // false
		System.out.println(isValidTime("111:45 pm")); // false
		System.out.println(isValidTime("03-40")); // false
		System.out.println(isValidTime("3::30")); // false
		System.out.println(isValidTime("6:y0 Am")); // false
		System.out.println(isValidTime("3:30am")); // false
		System.out.println(isValidTime("3:30    am")); // false
		System.out.println(isValidTime("3:30 a  m")); // false
		System.out.println(isValidTime("03:60")); // false

	}

	private static boolean isValidTime(String string) {
		// checking if the format is correct
		if (has1Colon(string) && (isWrittenCorrect(string))) {
			if (moreHoursFormat(string)) {
				return true;
			} else if (lessHoursFormat(string)) {
				return true;
			}
		}
		return false;
	}

	private static boolean has1Colon(String string) {
		int count = 0;
		// counting colons
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == ':') {
				count++;
			}
		}
		// if number of colons is 1
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isWrittenCorrect(String string) {
		// if contains letters
		for (int i = 0; i < string.indexOf(' '); i++) {
			char ch = string.charAt(i);
			if ((ch >= 'a' && ch <= 'z')) {
				return false;
			}
			// if contains double spaces
			int count = 0;
			// counting spaces
			for (int j = 0; j < string.length(); j++) {
				char sh = string.charAt(j);
				if (sh == ' ') {
					count++;
				}
			}
			// if number of spaces is 1
			if (count > 1) {
				return false;
			}
		}
		return true;
	}

	private static boolean lessHoursFormat(String string) {
		if (string.length() <= 5) {
			// the 24 hours format time
			String hours = (string.substring(0, string.indexOf(':')));
			String mins = (string.substring(string.indexOf(':') + 1));
			int h = Integer.parseInt(hours);
			int m = Integer.parseInt(mins);
			// checking validity
			if (h >= 00 && h <= 23) {
				if (m >= 00 && m <= 59) {
					return true;
				}
			}
			// checking validity
			else if (h >= 0 && h <= 23) {
				if (m >= 00 && m <= 59) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean moreHoursFormat(String string) {
		if (string.length() >= 7) {
			// the 12 hours format time
			string = string.toUpperCase();
			if (string.endsWith(" PM") || string.endsWith(" AM")) {
				int hours = Integer.parseInt(string.substring(0, string.indexOf(':')));
				int mins = Integer.parseInt(string.substring(string.indexOf(':') + 1, string.indexOf(' ')));
				// checking validity
				if (hours >= 00 && hours <= 12) {
					if (mins >= 00 && mins <= 59) {
						return true;
					}
				}
				// checking validity
				else if (hours >= 0 && hours <= 12) {
					if (mins >= 00 && mins <= 59) {
						return true;
					}
				}
			}
		}
		return false;

	}

}