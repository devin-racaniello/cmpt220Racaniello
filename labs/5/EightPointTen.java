//Devin Racaniello
public class EightPointTen {

	public static void main(String[] args) {
		
		int matrix[][] = new int[4][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int)(Math.random()*2);
				System.out.println(matrix[i][j]); // JA: The matrix is not printing right
			}
		}
		
		int maxRNumber = 0;
		int max = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			int k = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					k++;
			}
			if (k > max) {
				max = k;
				maxRNumber = i;
			}
		}
		
		int maxCNumber = 0;
		max = 0;
		
		for (int i = 0; i < matrix[0].length; i++) {
			int k = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1)
					k++;
			}
			if (k > max) {
				max = k;
				maxCNumber = i;
			}
		}
		
		System.out.println("The largest row is " + maxRNumber);
		System.out.println("The largest column is  " + maxCNumber);
		

	}

}
