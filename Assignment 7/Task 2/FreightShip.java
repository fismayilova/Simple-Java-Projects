package task2;

public class FreightShip extends Ship {
	public int capacity;

	public FreightShip(String Name, String Year) {
		super(Name, Year);
	}

	public FreightShip() {
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getYear() {
		// TODO Auto-generated method stub
		return super.getYear();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void setYear(String year) {
		// TODO Auto-generated method stub
		super.setYear(year);
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		System.out.println(super.toString() + " Capacity is: " + capacity + " tons");
		return null;
	}
}
