package task1_triangle;

import acm.graphics.GPolygon;

public class RoundTriangle extends GPolygon {

	public RoundTriangle(int width, int height) {
		addEdge(width, 0);
		addArc(width , height , -65, 100);
		addEdge(-width / 2, -height);
		addArc(width , height , 0, 180);
		addEdge(-width / 2, height);
		addArc(width , height , 150, 110);
	}
}
