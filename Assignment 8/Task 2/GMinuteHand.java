package task2_clock;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;

public class GMinuteHand extends GCompound {

	public GMinuteHand(int min, double r) {

		double radians = ((min * 6 - 90) * Math.PI / 180);
		// xr and yr are new end points of the minute hand.
		double xr = (Math.cos(radians) * r * 0.9);
		double yr = (Math.sin(radians) * r * 0.9);
		GLine minuteHand = new GLine(ClockTest.APPLICATION_WIDTH / 2, ClockTest.APPLICATION_HEIGHT / 2,
				ClockTest.APPLICATION_WIDTH / 2 + xr, ClockTest.APPLICATION_HEIGHT / 2 + yr);
		minuteHand.setColor(Color.BLACK);
		add(minuteHand);
	}
}
