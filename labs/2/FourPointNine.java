//Devin Racaniello
import java.util.Scanner;
public class FourPointNine {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Asking for input
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		//Display output
		System.out.println("The Unicode for character "+ character +" is "+(int)character);
		
		

	}

}
