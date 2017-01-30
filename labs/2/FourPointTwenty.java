//Devin Racaniello
import java.util.Scanner;
public class FourPointTwenty {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Asking for input
		System.out.print("Enter a string: ");
		String myString = input.nextLine();
		
		//Display result
		System.out.print("The length of string \"" + myString + "\" is " + myString.length() + " and the first character is " + myString.charAt(0));
	}

}
