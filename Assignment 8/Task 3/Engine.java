package task3_train;

import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class Engine extends TrainCar {

	/* Creates the engine */

	public Engine() {
		super(Color.BLACK);

		addLeftTopRect();
		addRightTopRect();
		addFrontTriangle();
	}

	private void addLeftTopRect() {
		double width = CAR_WIDTH / 7;
		double height = CAR_WIDTH / 7;
		double x = CONNECTOR + width;
		double y = -(CAR_BASELINE + CAR_HEIGHT + height);
		GRect rect1 = new GRect(x, y, width, height);
		rect1.setFilled(true);
		add(rect1);
	}

	private void addRightTopRect() {
		double width = (int) CAR_WIDTH / 2;
		double height = (int) CAR_WIDTH / 7;
		double x = CONNECTOR + CAR_WIDTH - width;
		double y = -(CAR_BASELINE + CAR_HEIGHT + height);
		GRect rect1 = new GRect(x, y, width, height);
		rect1.setFilled(true);
		add(rect1);
	}

	private void addFrontTriangle() {
		GPolygon triangle = new GPolygon();
		triangle.addVertex(0, 0);
		triangle.addVertex(CONNECTOR / 2, 0);
		triangle.addVertex(CONNECTOR, -CAR_HEIGHT / 2);
		add(triangle, 0, -CAR_BASELINE);
	}
}
