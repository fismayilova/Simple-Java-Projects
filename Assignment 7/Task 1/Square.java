package task1;

public class Square extends Shape {
	public double Area;

	public Square(double Side) {
		super(Side);
	}

	@Override
	public double calculateSurface() {
		Area = (getWidth() * getHeight());
		return Area;
	}

}
