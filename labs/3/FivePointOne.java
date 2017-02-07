//Devin Racaniello
import java.util.Scanner;
public class FivePointOne {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Variables
		int nCount = 0;
		int pCount = 0;
		int total = 0;
		double average;
		
		//Prompt user for input
		System.out.print("Enter a number the input ends if is is 0: ");
		int num = input.nextInt();
		
		//Loop for determining when 0
		while (num != 0){
			if (num > 0) {
				pCount ++;
			} else {
				nCount ++;
			}
			total += num;
			
			num = input.nextInt();
			
		}
		
		average = total / ((double)nCount + pCount);
		
		//Output
		System.out.println("The number of positives is " + pCount);
		System.out.println("The number of negatives is " + nCount);
		System.out.println("The toal is " + total);
		System.out.println("The average is " + average);

	}

}
