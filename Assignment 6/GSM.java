package as06;

import java.util.ArrayList;

public class GSM {
	public String model;
	public String manufacturer;
	public double price;
	public String owner;
	public Battery ourBattery;
	public Display ourDisplay;
	public static GSM IPhone4S;

	public GSM(String mobModel, String mobManf, double mobPrice, String mobOwner, Battery battery, Display display) {
		ourBattery = battery;
		ourDisplay = display;
		model = mobModel;
		manufacturer = mobManf;
		price = mobPrice;
		owner = mobOwner;
	}

	public GSM(String mobModel, String mobManf, double mobPrice, String mobOwner) {
		model = mobModel;
		manufacturer = mobManf;
		price = mobPrice;
		owner = mobOwner;
	}

	public GSM(String mobModel, String mobManf, double mobPrice) {
		this(mobModel, mobManf, mobPrice, null);
	}

	public GSM(String mobModel, String mobManf) {
		this(mobModel, mobManf, 0.0);
	}

	static {
		IPhone4S = new GSM("IPhone4S", "Apple", 2499.99, "Nikto");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getOwner() {
		return owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public GSM getIPhone4S() {
		return IPhone4S;
	}

	@Override
	public String toString() {
		System.out.println("---------- GSM ----------");
		System.out.println("GSM model: " + getModel());
		System.out.println("GSM manufacture: " + getManufacturer());
		System.out.printf("GSM price: %1$s $" + "\r\n", getPrice());
		System.out.println("GSM owner: " + getOwner());
		System.out.println();
		return super.toString();
	}

	public ArrayList<Call> CallHistory = new ArrayList<Call>();

	public ArrayList<Call> addCalls(String callDate, String callTime, String phoneNumber, int callDuration) {
		Call someCall = new Call(callDate, callTime, phoneNumber, callDuration);
		CallHistory.add(someCall);
		return CallHistory;
	}

	public ArrayList<Call> removeSomeCalls(String callDate, String callTime, String phoneNumber, int callDuration) {
		for (int i = 0; i < CallHistory.size(); i++) {
			if ((CallHistory.get(i).getDate().equals(callDate)) && (CallHistory.get(i).number.equals(phoneNumber))
					&& (CallHistory.get(i).getTime().equals(callTime))
					&& (CallHistory.get(i).getDuration() == callDuration)) {
				CallHistory.remove(i);
			}
		}
		return CallHistory;
	}

	public ArrayList<Call> clearCallsHistory() {
		CallHistory.clear();
		return CallHistory;
	}

	public double priceOfCalls(double pricePerMinute) {
		int TotalPrice = 0;
		for (int i = 0; i < CallHistory.size(); i++) {
			for (int j = 0; j <= CallHistory.get(i).getDuration(); j++) {
				TotalPrice += j * (pricePerMinute / 60);
			}
		}
		System.out.println("Total price: " + TotalPrice);
		System.out.println();
		return TotalPrice;
	}

	public final void PrintCalls() {
		for (int i = 0; i < CallHistory.size(); i++) {
			System.out.println("---------- Calls ----------");
			System.out.println("Date: " + CallHistory.get(i).getDate() + "Time: " + CallHistory.get(i).getTime());
			System.out.println("Dialed phone number: " + CallHistory.get(i).getNumber());
			System.out.printf("Duration: %1$s seconds " + "\r\n", CallHistory.get(i).getDuration());
			System.out.println();
		}

	}
}
