package task1;

import java.util.ArrayList;

public class Task1_test {

	public static void main(String[] args) {
		ArrayList<Shape> myArList = new ArrayList<Shape>();
		for (int i = 1; i <= 2; i++) {
			myArList.add(new Rectangle(2 * i, 3 * i));
			myArList.add(new Triangle(3 * i, 5 * i));
		}
		myArList.add(new Square(4));
		findArea(myArList);
	}

	private static void findArea(ArrayList<Shape> myArList) {
		for (Shape shape : myArList) {
			if (shape.getClass() == Triangle.class) {
				System.out.println("Area of Triangle is: " + shape.calculateSurface());
			} else if ((shape.getClass() == Rectangle.class)) {
				System.out.println("Area of Rectangle is: " + shape.calculateSurface());
			} else if ((shape.getClass() == Square.class)) {
				System.out.println("Area of Square is : " + shape.calculateSurface());
			}
		}
	}
}