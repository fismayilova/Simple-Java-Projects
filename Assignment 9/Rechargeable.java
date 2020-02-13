package task1;

public class Rechargeable extends Battery {
	private String name;
	private double voltage;
	private double cost;
	private double capacity;
	private int numOfCharges;

	public Rechargeable(String Name, double Voltage, double Cost, double Capacity, int Charges) {
		super();
		name = Name;
		voltage = Voltage;
		cost = Cost;
		capacity = Capacity;
		numOfCharges = Charges;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getVoltage() {
		return voltage;
	}


	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	public void setNumOfCharges(int numOfCharges) {
		this.numOfCharges = numOfCharges;
	}


	public int getNumOfCharges() {
		return numOfCharges;
	}

	@Override
	public Object getLifetimeCost() {
		// TODO Auto-generated method stub
		return (cost * voltage * capacity) / (1000 * getNumOfCharges());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getName() + ", " + getVoltage() + ", " + getCost() + ", " + getCapacity() + ", " + getNumOfCharges());
	}
}
	
