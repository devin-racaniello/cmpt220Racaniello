import java.util.Scanner;
public class TwoPointSIx {

	public static void main(String[] args) {
		//The creation of a scanner object
		Scanner input = new Scanner(System.in);
		
		//Input asking for a number between 0 and 1000
		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		int sum = 0;
		
		//logic for telling where how many digits the number has and if it fits in the 0 - 1000
		if (num >= 100 && num <= 1000){
			for(int i=1; i<4; i++){
				sum = sum + num % 10;
				num = num / 10;
			}
		}
		else if (num >= 10 && num <= 1000){
			for(int i=1; i<3; i++){
				sum = sum + num % 10;
				num = num / 10;
			}
		}
		else if (num >=0 && num <= 1000){
			sum = num;
		}
		else{
			sum = -1;
		}
		
		//Output for the sum
		System.out.print("The sum of the digits is "+sum);
		
		
	}

}
