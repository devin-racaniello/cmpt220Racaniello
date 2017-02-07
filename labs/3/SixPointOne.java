//Devin Racaniello
public class SixPointOne {

	public static void main(String[] args) {
		//Loop for iteration 1-100
		for (int i = 1; i < 101; i++){
			System.out.print(getPentagonalNumber(i)+", ");
			
			//Breaks up the output every ten numbers
			if (i % 10 == 0) {
				System.out.println();
			}
		}


	}
	
	//getPentagonalNumber method
	public static int getPentagonalNumber(int n) {

		//Calculation
		int answer = n*(3*n-1)/2;
		return answer;
	}

}
