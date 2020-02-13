package as06;

public class Display {
	public double size;
	public int numOfC;

	public Display(double sizeOfMob, int numOfCMob) {
		size = sizeOfMob;
		numOfC = numOfCMob;
	}

	public int getNumOfC() {
		return numOfC;
	}

	public double getSize() {
		return size;
	}

	public void setNumOfC(int numOfC) {
		this.numOfC = numOfC;
	}

	public void setSize(double size) {
		this.size = size;
	}
}
