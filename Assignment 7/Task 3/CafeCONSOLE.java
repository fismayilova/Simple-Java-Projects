package task3;

/**
 * Main method to test Checkout class
 * 
 * @author Emil Neo - Date: 22 Apr 2018
 */
public class CafeCONSOLE {

	public static void main(String[] args) {

		Checkout checkout = new Checkout();

		checkout.enterItem(new Peanut("Master Peanut", 2.25, 399));
		checkout.enterItem(new Pizza("Margherita", 105));
		checkout.enterItem(new MixedPizza("Buffalo", 145, "Hot pepper",	50));
		checkout.enterItem(new Baklava("Shaki baklava", 4, 399));

		System.out.println("\nNumber of items: " + checkout.numberOfItems()	+ "\n");
		System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
		System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
		System.out.println("\nCost + Tax: "	+ (checkout.totalCost() + checkout.totalTax()) + "\n");
		System.out.println(checkout);

		checkout.clear();

		checkout.enterItem(new Pizza("General Pizza", 145));
		checkout.enterItem(new MixedPizza("Chicken pizza", 105, "Ham", 50));
		checkout.enterItem(new Peanut("Gummy peanuts", 1.33, 89));
		checkout.enterItem(new Baklava("Guba baklava", 4, 399));
		checkout.enterItem(new Peanut("Salty peanut", 1.5, 209));
		checkout.enterItem(new Peanut("Dried peanut", 3.0, 109));

		System.out.println("\nNumber of items: " + checkout.numberOfItems()	+ "\n");
		System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
		System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
		System.out.println("\nCost + Tax: "	+ (checkout.totalCost() + checkout.totalTax()) + "\n");
		System.out.println(checkout);
	}
}
