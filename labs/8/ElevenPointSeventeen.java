import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointSeventeen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int newnumb = 0;
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int realNumber = number;
		int index = 2; 

		
		while (number / index != 1) {
			
			if (number % index  == 0) {
				myList.add(index);
				number /= index; 
			}
			else
				index++; 
		}
		myList.add(number);
		
		
		for (int i = 0; i < myList.size(); i++) {
			newnumb = myList.get(i) * realNumber;

			int j = 2;
			int test = 0;
			while (test < newnumb) {
				test = j*j;

				if (test == newnumb) {
					System.out.println(newnumb+" is the smallest square");
				} else if (test > newnumb) {
					break;
				}
				j++;
				
			}
			
				
		}
		
		

	}

}
