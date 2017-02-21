//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
public class SevenPointEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double array[] = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Please enter a double: ");
			array[i] = input.nextDouble();
		}
		
		System.out.println("mean is "+mean(array)+" and standard deviation is "+deviation(array));
		

	}
	
	public static double mean(double[] x) {
		double total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		double mean = total / x.length;
		return total;
	}
	
	public static double deviation(double[] x) {
		double mean = mean(x);
		double val = 0;
		double temp = 0;
		for (int i = 0; i < x.length; i++) {
			System.out.println(val);
			val += Math.pow(x[i] - mean, 2) ;
		}
		return Math.sqrt(val / x.length - 1);
		
		
	}

}
