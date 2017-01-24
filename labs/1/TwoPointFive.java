import java.util.Scanner;
public class TwoPointFive {

	public static void main(String[] args) {
		//The creation of a scanner object
		Scanner input = new Scanner(System.in);
		
		//Input asking for subtotal and gratuity rate
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		//Calculations stored into doubles for gratuity and total
		double gratuity = subtotal*(gratuityRate/100);
		double total = subtotal + gratuity;
		
		//Output explaining the gratuity and total
		System.out.print("The Gratuity is $"+gratuity+" and the total is $"+total);
	}

}
