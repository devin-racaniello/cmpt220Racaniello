
public class TernPointElevenTest {

	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("Area: " + c1.getArea()); 
		System.out.println("Perimeter: " + c1.getPerimeter()); 
		
		System.out.println("c1 contains points 3, 3 is: " + c1.contains(3, 3)); 
			System.out.println("cl contains circle at 4, 5 with a radius 10.5 is: " + c1.contains(new Circle2D(4, 5, 10.5)));
			System.out.println("cl overlaps circle at 3, 5 with a radius 2.3 is: " + c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}
