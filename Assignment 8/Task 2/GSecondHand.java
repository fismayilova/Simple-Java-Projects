package task2_clock;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;

public class GSecondHand extends GCompound {

	public GSecondHand(int i, double r) {
		// infinite loop
		double radians = (i * 6 - 90) * Math.PI / 180;
		int xr = (int) (Math.cos(radians) * r * 0.75);
		int yr = (int) (Math.sin(radians) * r * 0.75);
		GLine hourHand = new GLine(ClockTest.APPLICATION_WIDTH / 2, ClockTest.APPLICATION_HEIGHT / 2,
				ClockTest.APPLICATION_WIDTH / 2 + xr, ClockTest.APPLICATION_HEIGHT / 2 + yr);
		hourHand.setColor(Color.BLUE);
		hourHand.setEndPoint(ClockTest.APPLICATION_WIDTH / 2 + xr, ClockTest.APPLICATION_HEIGHT / 2 + yr);
		// makes second hand look like moving.
		add(hourHand);

	}

}
