package task3;

public class Peanut extends MenuItem {
	int Pcost;
	double Ppp;
	String name;

	// constructor
	public Peanut(String string, double ppp, int cost) {
		Pcost = cost;
		Ppp = ppp;
		name = string;
	}

	/**
	 * Returns cost of item
	 */
	@Override
	public int getCost() {
		return (int) ((Pcost * Ppp) + 0.5);
	}

	/**
	 * Prints information about item
	 */
	@Override
	public String toString() {
		return "\n" + Ppp + " lbs." + " @ " + Pcost + " /lb." + "\n" + name + spaces() + (double) getCost() / 100;

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
