package as06;

public class Battery {
	public String model;
	public int HI = 200;
	public int HTalk = 500;

	public Battery(String BaModel, int BatteryHI, int BaHTalk) {
		model = BaModel;
		HI = BatteryHI;
		HTalk = BaHTalk;
	}

	public Battery(String BaModel) {
		model = BaModel;
	}

	public String getModel() {
		return model;
	}

	public int getHI() {
		return HI;
	}

	public int getHTalk() {
		return HTalk;
	}

	public void setHI(int hI) {
		this.HI = hI;
	}

	public void setHTalk(int hTalk) {
		this.HTalk = hTalk;
	}

	@Override
	public String toString() {
		return "Battery model is: " + model + " HoursIdle: " + HI + " Hours Talk: " + HTalk;
	}
}
