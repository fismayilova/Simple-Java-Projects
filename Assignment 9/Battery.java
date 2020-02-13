package task1;

public abstract class Battery {
	private String name;
	private double voltage;
	private double cost;

	public Battery(String Name, double Voltage, double Cost) {
		try {
			this.name = Name;
			if (Name.equals(""))
				throw new BadBattery();
		} catch (BadBattery e) {
			System.out.println(e.getMessage());
		}
		this.voltage = Voltage;
		this.cost = Cost;
	}

	public Battery() {
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getVoltage() {
		return voltage;
	}

	@Override
	abstract public String toString();

	abstract public Object getLifetimeCost();

}
