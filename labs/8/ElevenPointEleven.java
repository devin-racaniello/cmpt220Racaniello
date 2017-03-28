import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointEleven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		System.out.print("Enter 5 numbers: ");
		for (int i = 1; i <= 5; i++) {
			myList.add(input.nextInt());
		}
		
		sort(myList);
		
		System.out.println(myList.toString());

	}
	
	public static void sort(ArrayList<Integer> list) {
		//am I allowed to just call this instead of writing my own?
		java.util.Collections.sort(list);
	}
	
	

}
