package task1;

public class SingleUse extends Battery {
	private String name;
	private double voltage;
	private double cost;
	private double capacity;

	public SingleUse(String Name, double Voltage, double Cost, double Capacity) {
		super();
		setName(Name);
		setVoltage(Voltage);
		setCost(Cost);
		;
		setCapacity(Capacity);
		;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	public double getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return (getName() + ", " + getVoltage() + ", " + getCost() + ", " + getCapacity());
	}

	@Override
	public Object getLifetimeCost() {
		// TODO Auto-generated method stub
		return (cost * voltage * capacity) / (1000 * 1);
	}

	@Override
	public double getVoltage() {
		// TODO Auto-generated method stub
		return voltage;
	}

	public void setName(String name) {
		this.name = name;
	}

}
