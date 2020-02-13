package task3_train;

import java.awt.Color;
import acm.graphics.GRect;

public class Caboose extends TrainCar {

	/* Create the caboose */

	public Caboose() {
		super(Color.RED);

		addTopRect();
	}

	private void addTopRect() {
		double width = CAR_WIDTH / 2;
		double height = CAR_WIDTH / 7;
		double x = CONNECTOR + (CAR_WIDTH - width) / 2;
		double y = -(CAR_BASELINE + CAR_HEIGHT + height);
		GRect rect = new GRect(x, y, width, height);
		rect.setFilled(true);
		rect.setFillColor(Color.RED);
		add(rect);
	}

}
