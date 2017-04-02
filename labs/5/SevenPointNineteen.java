//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
public class SevenPointNineteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter your list: ");
		
		//making an array to user size
		int[] array = new int[input.nextInt()];
		for (int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}

		System.out.println("It is " + isSorted(array) + " that your list is sorted.");

	}
	
	public static boolean isSorted(int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i+1] > list[i]) {
				return true; // JA: This will return truew if any two numbers are in order
				// JA: You should do the reverse, return false here when list[i+1] < list[i]
			}
		}
		return false;
		
		
		
	}
	
	

}
