package task1;

public class Triangle extends Shape {
	public double Area;

	public Triangle(double Width, double Height) {
		super(Width, Height);
	}

	@Override
	public double calculateSurface() {
		Area = (getWidth() * getHeight()) / 2;
		return Area;
	}

}
