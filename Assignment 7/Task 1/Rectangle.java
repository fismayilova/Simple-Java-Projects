package task1;

public class Rectangle extends Shape {
	public double Area;

	public Rectangle(double Width, double Height) {
		super(Width, Height);
	}

	@Override
	public double calculateSurface() {
		Area = (getWidth() * getHeight());
		return Area;
	}

}
