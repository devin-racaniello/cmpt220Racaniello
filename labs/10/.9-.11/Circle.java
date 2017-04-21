public class Circle extends GeometricObject  implements Comparable<Circle>{
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override 
	public double getArea() {
		return radius * radius * Math.PI;
	}


	public double getDiameter() {
		return 2 * radius;
	}

	@Override 
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
	}

	@Override
	public int compareTo(Circle circle){
		if (this.radius < circle.radius){
			return -1;
		}
		
		else if (this.radius > circle.radius){
			return 1;
		}
		
		else{
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object object) {
		return 0 == this.compareTo((Circle)object);
	}
}