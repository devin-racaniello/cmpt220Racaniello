
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable  {
	
	private double side;
	
	public Octagon() {
		
	}
	
	public Octagon(double side) {
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
		return (((2 + 4 / Math.sqrt(2)) * this.side) * this.side);
	}
	
	@Override
	public int compareTo(Octagon octagon){
		if (this.getArea() < octagon.getArea()){
			return -1;
		}
		
		else if (this.getArea() > octagon.getArea()){
			return 1;
		}
		
		else{
			return 0;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public double getPerimeter() {
		
		return this.side * 8;
	}
	

}
