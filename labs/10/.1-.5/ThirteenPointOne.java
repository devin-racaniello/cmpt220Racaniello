import java.util.Scanner;

public class ThirteenPointOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three sides: ");
		
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		System.out.print("Please enter the color: ");
		String color = input.next();
		
		System.out.print("Is the triangle full(true) or empty(false):");
		boolean isFilled = input.nextBoolean();
		
		Triangle myTriangle = new Triangle(s1, s2, s3, color, isFilled);
		System.out.println(myTriangle);

	}

}
