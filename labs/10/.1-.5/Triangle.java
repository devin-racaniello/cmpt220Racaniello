public class Triangle extends GeometricObject {
	
	private double side1; 
	private double side2; 
	private double side3;

	Triangle() {
		side1 = 1.0;
		side1 = 1.0;
		side1 = 1.0;
	}

	public Triangle(double s1, double s2, double s3) {
		
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

	public Triangle(double side1, double side2, double side3, 
		String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled); 
	}

	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override 
	public double getArea() {
		//using heron's formula
		double s = this.getPerimeter()/2;
		return Math.sqrt(s*(s-this.side1)*(s-this.side1)*(s-this.side1));
	}

	@Override 
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override 
	public String toString() {
		return super.toString() + " | Area: " + getArea() + " | Perimeter: " + getPerimeter(); 
	}
}