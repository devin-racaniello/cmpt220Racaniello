//Devin Racaniello
public class SixPointTwelve {

	public static void main(String[] args) {
		printChars('1','Z',10);

	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int intCh1 = (int)ch1;
		int intCh2 = (int)ch2;
		int hold;
		int counter = 1;
		
		
		if (intCh1 > intCh2) {
			hold = intCh1;
			intCh1 = intCh2;
			intCh2 = hold;
			
		}
		
		while (intCh1 < intCh2) {
			System.out.print((char)intCh1+" ");
			if (counter % numberPerLine == 0)
				System.out.println();
			intCh1 ++;
			counter ++;
		}
	}

}
