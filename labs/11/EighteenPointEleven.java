import java.util.Scanner;

public class EighteenPointEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers without spaces in between: ");
		int sum = input.nextInt();
		
		System.out.println(sumDigits(sum));

	}
	static int sum = 0;
	public static int sumDigits(long n) {
		if (n >= 10) {
			sum += n % 10;
			n /= 10;
			sumDigits(n);
			
		} else {
			sum += n;
		}
		return sum;
	}

}
