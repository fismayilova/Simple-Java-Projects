package task2;

public class Task2_test {
	public static TravelShip travel;
	public static FreightShip freight;

	public static void main(String[] args) {
		Ship[] ships = new Ship[5];
		travel = setTravel("Beatiful", "1956", 5);
		ships[0] = travel;
		travel = setTravel("Titanic", "1985", 8);
		ships[1] = travel;
		travel = setTravel("Something", "1863", 3);
		ships[2] = travel;
		freight = setFreight("Fantasy", "2003", 16);
		ships[3] = freight;
		freight = setFreight("Shiiiipppp", "3064", 9);
		ships[4] = freight;
		//
		printShips(ships);
	}

	private static void printShips(Ship[] ships) {
		for (int i = 0; i < ships.length; i++) {
			ships[i].toString();
		}
	}

	private static FreightShip setFreight(String name, String year, int num) {
		freight = new FreightShip(name, year);
		freight.setCapacity(num);
		return freight;
	}

	private static TravelShip setTravel(String name, String year, int num) {
		travel = new TravelShip(name, year);
		travel.setMaxPaNum(num);
		return travel;
	}
}