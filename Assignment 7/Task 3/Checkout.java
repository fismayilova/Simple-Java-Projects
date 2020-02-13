package task3;

import java.util.ArrayList;

public class Checkout {
	ArrayList<MenuItem> items = new ArrayList<MenuItem>();

	/**
	 * Clears checklist
	 */
	public void clear() {
		items.clear();
	}

	/**
	 * Counts number of items in a list
	 * 
	 * @return number of items
	 */
	public int numberOfItems() {
		return items.size();
	}

	/**
	 * Counts total tax by multiplying by 0.065
	 * 
	 * @return total tax
	 */
	public int totalTax() {
		int tottax = 0;
		for (int i = 0; i < items.size(); i++) {
			tottax += items.get(i).getCost();
		}
		return (int) ((tottax * 0.065) + 0.5);
	}

	/**
	 * Sums the costs of all products
	 * 
	 * @return total cost
	 */
	public int totalCost() {
		int cost = 0;
		for (int i = 0; i < items.size(); i++) {
			cost += items.get(i).getCost();
		}
		return cost;
	}

	/**
	 * Adds item to the list
	 */
	public void enterItem(MenuItem m) {
		items.add(m);
	}

	/**
	 * Returns information of given item
	 * 
	 * @return
	 */
	public String getInfo() {
		String s = " ";
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getClass() == Peanut.class) {
				s += items.get(i).toString();
			}
			if (items.get(i).getClass() == Pizza.class) {
				s += items.get(i).toString();
			}
			if (items.get(i).getClass() == Baklava.class) {
				s += (items.get(i).toString());
			}
			if (items.get(i).getClass() == MixedPizza.class) {
				s += (items.get(i).toString());
			}
		}
		return s;

	}

	/**
	 * Prints checklist in a beautiful way
	 */
	@Override
	public String toString() {
		return "\nNumber of items: " + numberOfItems() + "\n" + "\nTotal cost: " + totalCost() + "\n" + "\nTotal tax: "
				+ totalTax() + "\n" + "\nCost + Tax: " + (totalCost() + totalTax()) + "\n" + "\n  Books & Bytes" + "\n"
				+ "  -------------" + "\n" + getInfo() + "\nTax" + spacesTax() + (double) totalTax() / 100
				+ "\nTotal Cost" + spacesTotalcost() + (double) (totalCost() + totalTax()) / 100
				+ "\n~~~~~~~~~~~~~~~~~~~~~~~~";

	}

	/**
	 * Creates spaces to print checklist in a beautiful way
	 * 
	 * @return spaces
	 */
	public String spacesTax() {

		String tax = "Tax ";
		String s = " ";
		for (int i = 25; i > tax.length() - 1; i--) {
			s += " ";
		}
		return s;

	}

	/**
	 * Creates spaces to print checklist in a beautiful way
	 * 
	 * @return spaces
	 */
	public String spacesTotalcost() {
		String totalcost = "Total Cost ";
		String s = " ";

		for (int i = totalcost.length() - 1; i < 25; i++) {
			s += " ";
		}
		return s;

	}
}
