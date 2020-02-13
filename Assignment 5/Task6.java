/*
 * Write a method public static String convertToHumanTime(String date) that takes
 *  as  input a String parameter of format "hh:mm" (only 24h format this time) 
 *  and returns a String in British English time style. No need to check for 
 *  errors, only correct time samples will be tested.
 *  
 *  For example:
 *  convertToHumanTime("13:00") -->   "It is 1 o’clock."
 *  convertToHumanTime("1:00") -->   "It is 1 o’clock."
 *  convertToHumanTime("00:00") -->   "It is midnight."
 *  convertToHumanTime("00:25") -->   "It is 25 past midnight."
 *  convertToHumanTime("23:55") -->   "It is 5 to midnight."
 *  convertToHumanTime("12:00") -->   "It is noon."
 *  convertToHumanTime("14:30") -->   "It is half past 2."
 *  convertToHumanTime("4:10") -->   "It is 10 past 4."
 *  convertToHumanTime("4:40") -->   "It is 20 to 5."
 *  convertToHumanTime("12:15") -->   "It is quarter past noon."
 *  convertToHumanTime("11:45") -->   "It is quarter to noon."
 */

public class Task6 {

	public static void main(String[] args) {
		System.out.println(convertToHumanTime("13:00")); // It is 1 o’clock.
		System.out.println(convertToHumanTime("1:00")); // It is 1 o’clock.
		System.out.println(convertToHumanTime("00:00")); // It is midnight.
		System.out.println(convertToHumanTime("00:25")); // It is 25 past
															// midnight.
		System.out.println(convertToHumanTime("23:55")); // It is 5 to midnight.
		System.out.println(convertToHumanTime("12:00")); // It is noon.
		System.out.println(convertToHumanTime("14:30")); // It is half past 2.
		System.out.println(convertToHumanTime("4:10")); // It is 10 past 4.
		System.out.println(convertToHumanTime("4:40")); // It is 20 to 5.
		System.out.println(convertToHumanTime("12:15")); // It is quarter past
															// noon.
		System.out.println(convertToHumanTime("11:45")); // It is quarter to
															// noon.
	}

	private static String convertToHumanTime(String string) {
		String time = "";
		int hours = Integer.parseInt(string.substring(0, string.indexOf(':')));
		int mins = Integer.parseInt(string.substring(string.indexOf(':') + 1));
		//
		// The time periods for 00:00 - midnight
		if ((hours == 00)) {
			// at the hour itself
			if (mins == 00) {
				time = "It is midnight";
			}
			// at quarter past hour
			else if ((mins == 15)) {
				time = "It is quarter past midnight";
			}
			// at minutes less than half
			else if ((mins < 30)) {
				time = "It is " + mins + " past midnight";
			}
			// at half
			else if ((mins == 30)) {
				time = "It is half past midnight";
			}
			// at quarter to
			else if ((mins == 45)) {
				time = "It is quarter to " + (hours + 1);
			}
			// at minutes more than half
			else if ((mins > 30)) {
				time = "It is " + (60 - mins) + " to " + (hours + 1);
			}
		}
		//
		// The time periods for 12:00 - noon
		else if ((hours == 12)) {
			// at the hour itself
			if (mins == 00) {
				time = "It is noon";
			}
			// at quarter past hour
			else if ((mins == 15)) {
				time = "It is quarter past noon";
			}
			// at minutes less than half
			else if ((mins < 30)) {
				time = "It is " + mins + " past noon";
			}
			// at half
			else if ((mins == 30)) {
				time = "It is half past noon";
			}
			// at quarter to
			else if ((mins == 45)) {
				time = "It is quarter to " + (hours + 1);
			}
			// at minutes more than half
			else if ((mins > 30)) {
				time = "It is " + (60 - mins) + " to " + (hours + 1);
			}
		}
		//
		// The time periods for 24 hours format
		else if ((hours >= 13 && hours <= 23)) {
			// at the hour itself
			if (mins == 00) {
				time = "It is " + Math.abs(12 - hours) + " o'clock";
			}
			// at quarter past hour
			else if ((mins == 15)) {
				time = "It is quarter past " + Math.abs(12 - hours);
			}
			// at minutes less than half
			else if ((mins < 30)) {
				time = "It is " + mins + " past " + Math.abs(12 - hours);
			}
			// at half
			else if ((mins == 30)) {
				time = "It is half past " + Math.abs(12 - hours);
			}
			// at quarter to
			else if (hours == 23 && (mins == 45)) {
				time = "It is quarter to midnight";
			}
			// at quarter to
			else if ((mins == 45)) {
				time = "It is quarter to " + Math.abs(12 - hours + 1);
			}
			// at minutes more than half
			else if (hours == 23 && (mins > 30)) {
				time = "It is " + (60 - mins) + " to " + "midnight";
			}
			// at minutes more than half
			else if ((mins > 30)) {
				time = "It is " + (60 - mins) + " to " + (Math.abs(12 - hours) + 1);
			}
		}
		//
		// The time periods for 12 hours format
		else if ((hours >= 1 && hours <= 11)) {
			// at the hour itself
			if (mins == 00) {
				time = "It is " + hours + " o'clock";
			}
			// at quarter past hour
			else if ((mins == 15)) {
				time = "It is quarter past " + (hours);
			}
			// at minutes less than half
			else if ((mins < 30)) {
				time = "It is " + mins + " past " + (hours);
			}
			// at half
			else if ((mins == 30)) {
				time = "It is half past " + (hours);
			}
			// at quarter to
			else if (hours == 11 && (mins == 45)) {
				time = "It is quarter to noon";
			}
			// at quarter to
			else if ((mins == 45)) {
				time = "It is quarter to " + (hours + 1);
			}
			// at minutes more than half
			else if (hours == 11 && (mins > 30)) {
				time = "It is " + (60 - mins) + " to noon";
			}
			// at minutes more than half
			else if ((mins > 30)) {
				time = "It is " + (60 - mins) + " to " + (hours + 1);
			}
		}
		return time;
	}

}
