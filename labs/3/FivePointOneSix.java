//Devin Racaniello
import java.util.Scanner;
public class FivePointOneSix {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter a number and its factors will be listed from smallest to greatest: ");
		int num = input.nextInt();
		
		for (int i = 1; i < (num+1); i++){
			if (num%i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
