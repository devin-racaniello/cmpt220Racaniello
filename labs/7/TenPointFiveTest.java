import java.util.Scanner;
public class TenPointFiveTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i = 2;
		
		System.out.print("Please enter an integer: ");
		int integer = input.nextInt();
		
		StackOfIntegers intStack = new StackOfIntegers();
		
		while (integer / i != 1){ 
			if (integer % i == 0) {
				intStack.push(i);
				integer /= i;
			}
			else {
				i++;
			}
		}
		intStack.push(integer);
		
		while (intStack.empty() == false) {
			System.out.print(intStack.pop() +" ");
		}
		
		
	}

}
