import java.util.Scanner;

public class EighteenPointNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String reverseString = input.nextLine();
		
		reverseDisplay(reverseString);

	}
	
	public static void reverseDisplay(String value) {
		if (value.length() == 1) {
			System.out.println(value);
		}
		else {
			System.out.print(value.substring((value.length() - 1), (value.length())));
			reverseDisplay(value.substring(0, value.length() - 1)); // Recursive call
		}
	}

}
