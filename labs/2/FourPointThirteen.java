//Devin Racaniello
import java.util.Scanner;
public class FourPointThirteen {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Asking for input
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		//logic and display
		if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o' || letter == 'A' || letter == 'E' || letter == 'U' || letter == 'I' || letter == 'O'){
			System.out.println(letter + " is a vowel");
		} else if ((int)letter > 64 && (int)letter < 91 || (int)letter > 67 && (int)letter < 122){
			System.out.println(letter + " is a consonant");
		} else {
			System.out.println(letter + " is an Invalid input");
		}
				

	}

}
