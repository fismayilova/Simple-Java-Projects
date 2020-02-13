/* Task03
 * 
 * Implement a boolean method public static boolean isPowerOfTwo(int x) which 
 * returns TRUE if number is power of 2 and returns FALSE otherwise. 
 */

public class Task03 {

	public static void main(String[] args) {
		/*
		 * No need to modify main method. Just make sure your method satisfies
		 * ALL possible test cases according to task instructions, such as
		 * below.
		 */

		System.out.println(isPowerOfTwo(9)); // false
		System.out.println(isPowerOfTwo(17)); // false
		System.out.println(isPowerOfTwo(16)); // true
		System.out.println(isPowerOfTwo(2)); // true
		System.out.println(isPowerOfTwo(1)); // true
		System.out.println(isPowerOfTwo(0)); // false
		System.out.println(isPowerOfTwo(-4)); // false
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPowerOfTwo(int x) {
		for (int i = 0; i <= x; i++) {
			if (Math.pow(2, i) == x) {
				return true;
			}
		}
		return false;
	}
}
