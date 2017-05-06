import java.util.Scanner;

public class EighteenPointThirteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[8];
		
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}
		
		System.out.print(findLargest(array));
		
		

	}
	static int largest = 0;
	public static int findLargest(int[] array) {
		if (array.length > 1) {
			int[] newArray = new int[array.length - 1];
			for (int i = 0; i <= array.length - 2; i++) {
				newArray[i] = array[i];
			}
			if (array[array.length-1] > largest){
				largest = array[array.length-1];
			}
			findLargest(newArray);
		}
		if (array[array.length-1] > largest){
			largest = array[array.length-1];
		}
		
		return largest;
	}

}
