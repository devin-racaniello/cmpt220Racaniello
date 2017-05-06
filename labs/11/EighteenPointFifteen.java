import java.util.Scanner;


public class EighteenPointFifteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		System.out.println(character +" appeared "+count(str, character)+" times.");
		
		

	}
	
	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}
	
	private static int count(String str, char a, int high) {
		if (high < 0) {
			return 0;
		}
		
		else if (str.charAt(high) ==  a) {
			return (1 + count(str, a, high - 1));
		}
		
		else {
			return count(str, a, high - 1);
		}
		
	}

}
