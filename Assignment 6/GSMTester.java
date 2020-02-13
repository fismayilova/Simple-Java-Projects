package as06;

public class GSMTester {
	public static int arrSize = 3;

	public static void main(String[] args) {
		GSM[] array = new GSM[arrSize];

		GSM one = new GSM("Galaxy S4", "Samsung", 120, "Some Kid");
		array[0] = one;

		GSM two = new GSM("Xperia", "Sony", 320, "Anyone");
		array[1] = two;

		GSM three = new GSM("Optimus", "LG", 100, "Someone");
		array[2] = three;
		for (int i = 0; i < array.length; i++) {
			array[i].toString();
		}
		GSM.IPhone4S.toString();
		GSM four = new GSM("Desire 500", "HTC", 1111, "Maria");
		// System.out.println("OUR CALLS HISTORY:");
		four.addCalls("15/02/18", "21:30", "088088311", 55);
		four.addCalls("15/02/18", "15:45", "088088088", 94);
		four.addCalls("15/02/18", "10:21", "088111221", 33);
		// fourthGSM.PrintCalls();
		System.out.println("Delete call and print... ");
		four.removeSomeCalls("15/02/18", "15:45", "088088088", 94);
		four.PrintCalls();
		// Calculate total price
		four.priceOfCalls(1.12);

		// PLEASE UNCOMMENT NEXT PART

		/*
		 * fourthGSM.clearCallsHistory(); fourthGSM.PrintCalls();
		 * System.out.println("Calls History is Clear!");
		 */
	}

}
