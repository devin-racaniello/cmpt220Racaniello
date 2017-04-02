//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
//JA: Always add comments to your code
public class SevenPointFourteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Please enter an int: ");
			array[i] = input.nextInt();
		}
		
		System.out.println("GDC is " + gcd(array));

	}
	
	public static int gcd(int[] x) {
		int possibleGdc = 1;
		boolean divisable;
		
		for (int i = 2; i < getMinimum(x); i++) { // JA: This has to include the minimum (<=)
			
			divisable = true;
			for (int j: x) {
				if (j % i != 0)
					divisable = false;
				
			}
			if (divisable)
				possibleGdc = i;
		}
		return possibleGdc;
	}
	
	public static int getMinimum(int[] x) {
		int min = x[0];
		for (int j: x) {
			
			if (j < min)
				min = j;
			
		}
		return min;
	}
}