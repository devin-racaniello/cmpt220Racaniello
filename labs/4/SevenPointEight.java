//Devin Racaniello
import java.util.Scanner;
public class SevenPointEight {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		double myArray[] = new double[10];
		
		System.out.print("Enter 10 doubles: ");
		
		for (int i = 0; i < 10; i++) {
			myArray[i] = input.nextDouble();
		}
		
		System.out.print("The average is "+average(myArray));
		

	}
	
	public static int average(int[] array) {
		
		int total = 0;
		int times = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
			times ++;
		}
		
		int average = total / (times);
		
		
		return average;
	}
	
	public static double average(double[] array) {
		
		double total = 0.0;
		int times = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
			times ++;
		}
		
		double average = total / (times);
		
		
		return average;
	}

}
