//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
public class EightPointOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		
		double matrix[][] = new double[3][4];
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				matrix[i][j] = input.nextDouble();
			}
		}
		
		for (int i = 0; i < 4; i++){
			System.out.println("sum of column "+i+" is "+sumColumn(matrix, i));
		}

	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int i = 0; i < m.length; i++){
			total += m[i][columnIndex];
		}
		return total;
	}

}
