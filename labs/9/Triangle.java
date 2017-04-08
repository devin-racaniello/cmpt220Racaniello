
// JA: You need a test class to test this
public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle() {
		side1 = 1.0;
		side1 = 1.0;
		side1 = 1.0;
	}
	
	// JA: This should throw an exception
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		//using heron's formula
		double s = this.getPerimeter()/2;
		return Math.sqrt(s*(s-this.side1)*(s-this.side1)*(s-this.side1));
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
