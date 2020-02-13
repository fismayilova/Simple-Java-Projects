package task3_train;

import acm.graphics.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This abstract class defines what is common to all train cars.
 */
public abstract class TrainCar extends GCompound {

	/**
	 * Creates the frame of the car using the specified color.
	 * 
	 * @param color
	 *            The color of the new boxcar
	 */

	public static ArrayList<GWheel> wheels = new ArrayList<GWheel>();

	public TrainCar(Color color) {
		double xLeft = CONNECTOR;
		double yBase = -CAR_BASELINE;
		add(new GLine(0, yBase, CAR_WIDTH + 2 * CONNECTOR, yBase));
		addWheel(xLeft + WHEEL_INSET, -WHEEL_RADIUS);
		addWheel(xLeft + CAR_WIDTH - WHEEL_INSET, -WHEEL_RADIUS);
		double yTop = yBase - CAR_HEIGHT;
		GRect rect = new GRect(xLeft, yTop, CAR_WIDTH, CAR_HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(color);
		add(rect);
	}

	/* Adds a wheel centered at (x, y) */
	private void addWheel(double x, double y) {
		GOval wheel = new GOval(x - TrainCar.WHEEL_RADIUS, y - TrainCar.WHEEL_RADIUS, 2 * TrainCar.WHEEL_RADIUS,
				2 * TrainCar.WHEEL_RADIUS);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
		GWheel wheel1 = new GWheel(5);
		wheel1.setFilled(true);
		wheel1.setFillColor(Color.BLACK);
		wheels.add(wheel1);
		add(wheel1, x + 1, y + 1);
	}

	/* Dimensions of the frame of a train car */
	public static final double CAR_WIDTH = 75;
	public static final double CAR_HEIGHT = 36;

	/* Width of the connector, which overlaps between successive cars */
	public static final double CONNECTOR = 6;

	/* Distance that the bottom of a train car rides about the track */
	public static final double CAR_BASELINE = 10;

	/* Radius of the wheels on each car */
	public static final double WHEEL_RADIUS = 8;

	/* Distance from the edge of the frame to the center of the wheel */
	public static final double WHEEL_INSET = 16;

}
