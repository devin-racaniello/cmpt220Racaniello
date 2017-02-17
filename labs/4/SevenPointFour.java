//Devin Racaniello
import java.util.Scanner;
public class SevenPointFour {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[100];
		
		int enter;
		int i = 0;
		int total = 0;
		double average;
		int bAve = 0;
		int aAve = 0;
		
		System.out.print("Input a test score: ");
		enter = input.nextInt();
		
		while (enter >= 0 || i == 99) {
			myArray[i] = enter;
			
			total += enter;
			
			System.out.print("Input a test score: ");
			enter = input.nextInt();
			i++;
		}
		
		average = total / i; // JA: This division has to be non-integer
		
		for (int j = 0; j < i; j++) {
			if (myArray[j] >= average) {
				aAve ++;
			} else {
				bAve ++;
			}
		}

	System.out.print("The scores above average are: "+aAve+"\nthe scores below the average are: "+bAve);
	}

}
