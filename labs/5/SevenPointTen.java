//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
public class SevenPointTen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double array[] = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Please enter a double: ");
			array[i] = input.nextDouble();
		}
		
		System.out.println(indexOfSmallestElement(array));
		
	}
	
	public static int indexOfSmallestElement(double[] array){

		double min = array[0];
		int indexOfMin = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(min+" "+array[i]);
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		}
	
		return indexOfMin;
	}

}
