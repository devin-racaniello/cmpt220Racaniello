//Devin Racaniello
public class SixPointSixteen {

	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.print(numberOfDaysInYear(i)+" ");
		}

	}
	public static int numberOfDaysInYear(int year) {
		int total = 0;
		
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			total = total + 366;
		else
			total = total + 365;
	
		
		return total;
	}

}
