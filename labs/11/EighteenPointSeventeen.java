import java.util.Scanner;


public class EighteenPointSeventeen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a list of characters without spaces seperating: ");
		String str = input.nextLine();
		char[] array = new char[str.length()];
		
		for (int i = 0; i <= str.length() -1; i++) {
			array[i] = str.charAt(i);
		}
		
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		System.out.println(character +" appeared "+count(array, character)+" times.");
		
		

	}
	
	public static int count(char[] array, char a) {
		String str = "";
		for (int i = 0; i <= array.length -1; i++) {
			str += array[i];
		}
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
			return count(str, a, high-1);
		}
		
	}

}
