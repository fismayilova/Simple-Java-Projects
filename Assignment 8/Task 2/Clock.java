package task2_clock;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class Clock extends GCompound {
	public GHourHand hourh;
	public GMinuteHand minute;
	public GSecondHand second;
	public int minu;
	public int Hh;
	private static final int DIAMETER = 230;
	private static final int RADIUS = DIAMETER / 2;

	public Clock(int h, int m) {
		Hh = h;
		minu = m;
		drawClockFrame(DIAMETER);
		int num = 0;
		for (int angle = 30; angle <= 360; angle += 30) {
			num++;
			drawNumbers(RADIUS, angle, num);
		}
		drawSecondHand(0, RADIUS);
		drawMinuteHand(m, RADIUS);
		drawHourHand(h, m, RADIUS);
		drawCenterPoint();

	}

	/**
	 * This method draws clock face.
	 * 
	 * @param d
	 */
	private void drawClockFrame(int d) {
		GOval clock1 = new GOval(d, d);
		clock1.setFilled(true);
		clock1.setColor(Color.BLACK);
		add(clock1, ClockTest.APPLICATION_WIDTH / 2 - RADIUS, ClockTest.APPLICATION_HEIGHT / 2 - RADIUS);
		GOval clock = new GOval(d - 30, d - 30);
		clock.setFilled(true);
		clock.setColor(Color.WHITE);
		add(clock, ClockTest.APPLICATION_WIDTH / 2 - RADIUS + 15, ClockTest.APPLICATION_HEIGHT / 2 - RADIUS + 15);
	}

	/**
	 * This method adds numbers to the clock face.
	 * 
	 * @param r
	 * @param degrees
	 * @param n
	 */
	private void drawNumbers(double r, int degrees, int n) {

		// converts numbers to radians.
		double radians = (degrees - 90) * Math.PI / 180;
		// xr and yr are the locations of numbers.
		int xr = (int) (Math.cos(radians) * r * 0.75);
		int yr = (int) (Math.sin(radians) * r * 0.75);
		GLabel numbers = new GLabel("" + n, xr + ClockTest.APPLICATION_WIDTH / 2 - 5,
				yr + ClockTest.APPLICATION_HEIGHT / 2 + 10);
		numbers.setFont("Timesnewroman-bold-20");
		add(numbers);

	}

	/**
	 * This method draws minute hand.
	 * 
	 * @param min
	 * @param r
	 */
	private void drawMinuteHand(int min, int r) {
		minute = new GMinuteHand(min, r);
		add(minute);
	}

	/**
	 * This method draws hour hand.
	 * 
	 * @param hour
	 * @param min
	 * @param r
	 */
	private void drawHourHand(int hour, int min, int r) {
		hourh = new GHourHand(hour, min, r);
		add(hourh);

	}

	/**
	 * This method creates a dot in the center of the clock face.
	 */
	private void drawCenterPoint() {
		GRect center = new GRect(5, 5);
		add(center, ClockTest.APPLICATION_WIDTH / 2 - 2.5, ClockTest.APPLICATION_HEIGHT / 2 - 2.5);
		center.setFilled(true);
		center.setColor(Color.BLACK);

	}

	private void drawSecondHand(int i, double r) {
		second = new GSecondHand(i, r);
		add(second);

	}

	public void setClock(int h, int min) {
		minu = min;
		Hh = h;
		remove(hourh);
		remove(minute);
		hourh = new GHourHand(h, min, 115);
		add(hourh);
		minute = new GMinuteHand(min, 115);
		add(minute);
	}

	public void moveClock() {
		int k = 0;
		remove(second);
		while (true) {
			second = new GSecondHand(k, 115);
			add(second);
			k++;
			pause(1000);
			remove(second);
			minu += k / 60;
			Hh += minu / 60;
			minu = minu % 60;
			Hh = Hh % 24;
			k = (k) % 60;
			setClock(Hh, minu);
		}
	}
}
