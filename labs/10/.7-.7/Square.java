public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
	}

	public Square(double side) {
		setSide(side);
	}

	public Square(double side, String color, boolean isFilled) {
		super(color, isFilled);
		setSide(side);
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public String toString() {
		return super.toString() + " | Sides: " + side + " | Aera: " + getArea()+ " | Perimeter: " + getPerimeter();
	}
	
	@Override
	public String howToColor() {
		return "Color all four sides";
	}
}