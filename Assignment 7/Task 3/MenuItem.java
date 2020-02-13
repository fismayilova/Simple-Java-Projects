package task3;


/**
 * Abstract superclass for MenuItem hierarchy
 * 
 * @author Emil Neo - Date: 22 Apr 2018
 */

public abstract class MenuItem {

	protected String name;

	/**
	 * Null constructor for MenuItem class
	 */
	public MenuItem() {
		this("");
	}

	/**
	 * Initializes MenuItem data
	 */
	public MenuItem(String name) {
		if (name.length() <= RULES.ITEM_NAME_MAX_SIZE)
			this.name = name;
		else
			this.name = name.substring(0, RULES.ITEM_NAME_MAX_SIZE);
	}

	/**
	 * Returns name of Item
	 * 
	 * @return name of Item
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Form a string of MenuItem with name align to left and cost align to right.
	 * 
	 * @return Return a String representing the name and cost of this item.
	 */
	public String toString() {
		// You fill in here
		return null;
	}

	/**
	 * Returns cost of Item
	 * 
	 * @return cost of Item
	 */
	public abstract int getCost();

}
