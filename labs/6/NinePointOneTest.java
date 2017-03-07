//Devin Racaniello
public class NinePointOneTest {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5,35.9);
		
		System.out.println("Width of rect = "+rect.width);
		System.out.println("Height of rect = "+rect.height);
		System.out.println("Area of rect = "+rect.getArea());
		System.out.println("Perimeter of rect = "+rect.getPerimeter());
		
		System.out.println("Width of rect2 = "+rect2.width);
		System.out.println("Height of rect2 = "+rect2.height);
		System.out.println("Area of rect2 = "+rect2.getArea());
		System.out.println("Perimeter of rect2 = "+rect2.getPerimeter());
		

	}

}
