package task1;

public abstract class Shape {
	private double width;
	private double height;

	public Shape(double Width, double Height) {
		this.setWidth(Width);
		this.setHeight(Height);
	}

	public Shape(double Side) {
		this.setWidth(Side);
		this.setHeight(Side);
	}

	abstract public double calculateSurface();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
