import java.util.Scanner;

public class EighteenPointSeven {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter an index: ");
		int fibIndex = input.nextInt();
		
		System.out.println("Fibonacci number is " + (fibIndex));
		System.out.println("Count is " + fibCount);
		
		

	}
	public static int fibCount = 0;
	public static long fib(long fibIndex) {
		fibCount+= 1;

		if (fibIndex == 0) {
			return 0;
		}
		
		else if (fibIndex == 1) {
			return 1;
		}
		
		else {
			return fib(fibIndex - 1) + fib(fibIndex - 2);
		}
	}

}
