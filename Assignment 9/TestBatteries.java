package task1;

import java.util.ArrayList;

public class TestBatteries {
	public static void main(String[] args) {
		ArrayList<Battery> bats = new ArrayList<>();

		try {
			bats.add(new SingleUse("Alkaline D", 1.5, 100, 8.0));
			bats.add(new SingleUse("Alkaline 9V", 9.0, 600, 0.4));
			bats.add(new SingleUse("Silver Oxide Button", 1.55, 18000, 0.15));
			bats.add(new Rechargeable("Lead Acid", 2.1, 100, 225, 500));
			bats.add(new Rechargeable("NiCad", 1.2, 1000, 1.0, 500));
			bats.add(new Rechargeable("LiPo", 3.2, 350, 2.2, 1000));

			throw new BadBattery();
		} catch (BadBattery e) {
			// All battery data used above is legal.
			System.err.println("Should not get here...");
		}
		for (Battery bat : bats) {
			System.out.print(bat);
			System.out.printf(", cost per use: $%.3f\n", bat.getLifetimeCost());
		}
	}

}

/*
 * OUTPUT: Alkaline D single use battery, cost per use: $1.200 Alkaline 9V
 * single use battery, cost per use: $2.160 Silver Oxide Button single use
 * battery, cost per use: $4.185 Lead Acid rechargeable battery, cost per use:
 * $0.095 NiCad rechargeable battery, cost per use: $0.002 LiPo rechargeable
 * battery, cost per use: $0.002
 */
