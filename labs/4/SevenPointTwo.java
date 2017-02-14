//Devin Racaniello
import java.util.Scanner;
public class SevenPointTwo {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Input an integer: ");
			myArray[i] = input.nextInt();
		}
		
		System.out.print("Your array backwards is: ");
		
		for (int j = 9; j >= 0; j--) {
			System.out.print(myArray[j] + ",");
		}
		
		

	}

}
