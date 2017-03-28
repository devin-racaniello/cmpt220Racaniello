import java.util.Scanner;
public class ElevenPointOneTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the sides of the triangle: ");
		
		double s1 = input.nextDouble();		
		double s2 = input.nextDouble();		
		double s3 = input.nextDouble();
		
		
		System.out.print("Please enter a color for the triangle: ");
		
		String triangleColor = input.next();
		
		
		System.out.print("Is the triangle filled or hollow(boolean): ");
		
		boolean isFilled = input.nextBoolean();
		
		
		Triangle myTriangle = new Triangle(s1, s2 , s3);
		
		myTriangle.setFilled(isFilled);
		myTriangle.setColor(triangleColor);
		
		System.out.println(myTriangle.toString());
		System.out.println("Area: " + myTriangle.getArea());
		System.out.println("Perimeter: " + myTriangle.getPerimeter());
		System.out.println("Color: " + myTriangle.getColor());
		System.out.println("It is " + myTriangle.isFilled() + " that the triangle is filled.");

	}

}
