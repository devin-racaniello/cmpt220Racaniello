import java.util.Scanner;
public class TwoPointNine {

	public static void main(String[] args) {
		//The creation of a scanner object
		Scanner input = new Scanner(System.in);
		
		//Input for the values of v0 v1 and t
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		//Calculation put into double a
		double a = (v1 - v0)/t;
		
		//Output of acceleration
		System.out.println("The average acceleration is "+a);
	}

}
