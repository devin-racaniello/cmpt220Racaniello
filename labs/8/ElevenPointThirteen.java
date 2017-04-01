import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointThirteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		System.out.print("Enter 10 numbers: ");
		for (int i = 1; i <= 10; i++) {
			myList.add(input.nextInt());
		}
		
		removeDuplicate(myList);
		
		System.out.print("The distinct integers are ");
		System.out.print(myList.toString());
		
		

	}
	
	// JA: A better approach is to replicate the arraylist without the duplicates
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			// only checks for another after the initial
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}

}
