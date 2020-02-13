package task3;

public class MixedPizza extends Pizza {
	int Pizcost, ctop;
	String name, extraTop;

	// constructor
	public MixedPizza(String string, int cost, String string2, int costTop) {
		super(string, cost);
		Pizcost = cost;
		ctop = costTop;
		name = string;
		extraTop = string2;

	}

	/**
	 * Returns cost of item
	 */
	@Override
	public int getCost() {
		return (int) ((Pizcost + ctop) + 0.5);
	}

	/**
	 * Prints information about item
	 */
	@Override
	public String toString() {
		return "\nMixed pizza with " + extraTop + "\n" + name + spaces() + (double) (Pizcost + ctop) / 100;

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
