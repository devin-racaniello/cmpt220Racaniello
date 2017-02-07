//Devin Racaniello
import java.util.Scanner;
public class SixPointThree {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input
		System.out.print("Enter an integer you think is a palindrome: ");
		int guess = input.nextInt();
		
		System.out.println("It is "+ isPalindrome(guess) + " that what you entered is a palindrome.");
		isPalindrome(guess);

	}
	
	//reverse method
	public static int reverse(int number) {
		int rNumber = 0;
		
		
		//Reverse formula: takes last digit by method used in earlier program and for getting last digit and iterates through
		while (number != 0) {
			rNumber *= 10;
			rNumber += number%10;
			number /= 10;
		}
		
		return rNumber;
	}
	
	//isPalindrome method
	public static boolean isPalindrome(int number) {
		
		boolean answer = false;
		
		if (number == reverse(number)){
			answer = true;
		}
		
		return answer;
	}

}
