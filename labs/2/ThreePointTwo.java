//Devin Racaniello
import java.util.Scanner;
public class ThreePointTwo {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 7 / 7 % 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Asking for input
		System.out.print(
			"what is " + number1 + " + " + number2 + " + " + number3 + "? ");
		int answer = input.nextInt();
		
		//Display output
		System.out.print(
			number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
			(number1 + number2 + number3 == answer));	
	}

}
