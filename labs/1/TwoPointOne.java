import java.util.Scanner;
public class TwoPointOne {

	public static void main(String[] args) {
		//The creation of a scanner object
		Scanner input = new Scanner(System.in);
		
		//input asking for celsius and fahrenheit
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = celsius * 9 / 5 + 32;
		
		//Output telling what the celsius temerature could be in fahrenheit
		System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit");
	}

}
