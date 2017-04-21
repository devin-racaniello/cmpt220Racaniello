import java.util.ArrayList;
import java.util.Scanner;

public class ThirteenPointThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Number> myList = new ArrayList<>();
		
		System.out.print("Please enter the numbers of the list: ");
		for (int i = 0; i <= 5; i++){
			myList.add(input.nextDouble());
		}
		
		System.out.println(myList.toString());
		
		sort(myList);
		
		System.out.println(myList.toString());

	}
	
	public static void sort(ArrayList<Number> list) {
		Number min;
		int index;
		for (int i = 0; i < list.size() - 1; i++) {
			min = list.get(i);
			index = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					index = j;
					list.set(index, list.get(i));
					list.set(i, min);
				}
			}

		}
	}

}
