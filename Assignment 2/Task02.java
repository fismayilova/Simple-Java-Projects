/* Task02 
 * 
 * Implement a boolean method public static boolean isPrime(int x) which 
 * returns TRUE if number is prime and returns FALSE if number is not prime.
 */

public class Task02 {

	public static void main(String[] args) {
		/*
		 * No need to modify main method. Just make sure your method satisfies
		 * ALL possible test cases according to task instructions, such as
		 * below.
		 */

		System.out.println(isPrime(9)); // false
		System.out.println(isPrime(8)); // false
		System.out.println(isPrime(17)); // true
		System.out.println(isPrime(47)); // true
		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(1)); // false
		System.out.println(isPrime(0)); // false
		System.out.println(isPrime(-3)); // false
	}

	/**
	 * 
	 * @param x
	 *            given integer
	 * @return True if integer x is Prime and False otherwise
	 */
	public static boolean isPrime(int x) {
		// First if statement for cases x=1 or x<=0
		if (x == 1 || x <= 0) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
