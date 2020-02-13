package task3_train;

import acm.graphics.GPolygon;

public class GWheel extends GPolygon {
	public GWheel(double width) {
		addArc(width, width, 0, 360);

	}
}
