//Devin Racaniello
import java.util.Scanner;
public class FivePointOneSix {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter a number and its factors will be listed from smallest to greatest: ");
		int num = input.nextInt();
		
		// JA: When finding the smallest factors, you need to decompose the numbers
		// JA: For example, if the input is 340, you need to find the smallest number that is a factor 
		// JA: and divide by the number, i.e., 2 is a factor and now your number is 170. You keep doing that 
		// JA: until the number is 1. So the factors of 340 are 2,2,5,17.
		for (int i = 1; i < (num+1); i++){
			if (num%i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
