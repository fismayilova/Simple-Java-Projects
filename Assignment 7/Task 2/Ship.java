package task2;

public abstract class Ship {
	public String name;
	public String year;

	public Ship() {
	}

	public Ship(String Name, String Year) {
		name = Name;
		year = Year;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return ("Ship [name=" + name + ", built in: " + year + "]");

	}
}
