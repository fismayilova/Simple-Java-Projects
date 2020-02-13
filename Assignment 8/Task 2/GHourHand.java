package task2_clock;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;

public class GHourHand extends GCompound {
	public GHourHand(int hour, int min, double r) {

		double radians = (((hour * 30 - 90) + min * 0.5) * Math.PI / 180);
		// xr and yr are new end points of the hour hand.
		double xr = (Math.cos(radians) * r * 0.6);
		double yr = (Math.sin(radians) * r * 0.6);
		GLine hourHand = new GLine(ClockTest.APPLICATION_WIDTH / 2, ClockTest.APPLICATION_HEIGHT / 2,
				ClockTest.APPLICATION_WIDTH / 2 + xr, ClockTest.APPLICATION_HEIGHT / 2 + yr);
		hourHand.setColor(Color.RED);
		add(hourHand);
	}
}