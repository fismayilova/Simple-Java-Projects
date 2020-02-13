package task3;

public class Baklava extends MenuItem {
	int Bcost;
	int nums;
	String name;

	// constructor
	public Baklava(String string, int num, int cost) {
		Bcost = cost;
		nums = num;
		name = string;
	}

	/**
	 * Returns cost of item
	 */
	@Override
	public int getCost() {
		return (int) (((Bcost * nums) / 12) + 0.5);
	}

	/**
	 * Prints information about item 
	 */
	@Override
	public String toString() {
		return "\n" + nums + " @ " + Bcost + " /dz." + "\n" + name + spaces() + (double) getCost() / 100;

	}

	/**
	 * Creates spaces to print checklist 
	 * 
	 * @return spaces
	 */
	public String spaces() {
		String s = "";
		for (int i = name.length() - 1; i < 25; i++) {
			s += " ";
		}
		return s;

	}

}