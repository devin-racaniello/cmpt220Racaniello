//Devin Racaniello
import java.util.Arrays;
import java.util.Scanner;
public class EightPointFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3 by 3 matrix: ");
		
		double matrix[][] = new double[3][3];
		double matrix2[][] = new double[3][3];
		double newMatrix[][] = new double[3][3];
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				matrix[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter another 3 by 3 matrix: ");
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		newMatrix = addMatrix(matrix,matrix2);
		
		System.out.println("The added matrix is ");
		
		for (int i = 0; i < newMatrix.length; i++){
			System.out.println();
			for (int j = 0; j < newMatrix[i].length; j++){
				System.out.print(newMatrix[i][j]+" ");
			}
		}

	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		if (a.length == b.length && a[0].length == b[0].length){
			double[][] newMatrix = new double[a.length][a[0].length];
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++){
					newMatrix[i][j] = a[i][j]+b[i][j];
				}
			}
		return newMatrix;
		} else {
			return a;
		}
		
		
		
	}

}
