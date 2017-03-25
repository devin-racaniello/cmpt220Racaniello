
public class Circle2D {
	private double x; 
	private double y; 
	private double radius;
	
	Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getPerimeter() {
		double perimiter = (2 * Math.PI) * radius;
		return perimiter;
	}
	
	public boolean contains(double x, double y) {
		boolean isContain = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
		return isContain;
	}
	
	public boolean contains(Circle2D circle) {
		boolean isContain = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius - circle.getRadius(); // JA: It should be a straight difference
		return isContain;
	}
	
	public boolean overlaps(Circle2D circle) {
		boolean doOverlap = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
		return doOverlap;
	}

}
