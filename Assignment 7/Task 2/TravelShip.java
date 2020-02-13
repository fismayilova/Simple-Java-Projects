package task2;

public class TravelShip extends Ship {
	public int maxPaNum;

	public TravelShip(String Name, String Year) {
		super(Name, Year);
	}

	public TravelShip() {
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getYear() {
		return super.getYear();
	}

	@Override
	public void setYear(String year) {
		super.setYear(year);
	}

	public void setMaxPaNum(int maxPaNum) {
		this.maxPaNum = maxPaNum;
	}

	@Override
	public String toString() {
		System.out.println(super.toString() + " maximum number of passengers: " + maxPaNum);
		return null;
	}

}
