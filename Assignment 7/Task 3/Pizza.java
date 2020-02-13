package task3;

public class Pizza extends MenuItem {
	int Picost;
	String name;

	// constructor
	public Pizza(String string, int cost) {
		// TODO Auto-generated constructor stub
		Picost = cost;
		name = string;
	}

	/**
	 * Returns cost of item
	 */
	@Override
	public int getCost() {
		return (int) (Picost + 0.5);
	}

	/**
	 * Prints information about item
	 */
	@Override
	public String toString() {
		return "\n" + name + spaces() + (double) Picost / 100;

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
