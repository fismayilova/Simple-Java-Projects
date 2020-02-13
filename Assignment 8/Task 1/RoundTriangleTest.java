package task1_triangle;

import java.awt.Color;

import acm.program.GraphicsProgram;

public class RoundTriangleTest extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		RoundTriangle triangle = new RoundTriangle(100, 100);
		triangle.setFilled(true);
		triangle.setFillColor(Color.BLUE);
		add(triangle, getWidth() / 2 , getHeight() / 2);
	}

	public static void main(String[] args) {
		new RoundTriangleTest().start();
	}
}