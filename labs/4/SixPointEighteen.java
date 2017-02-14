//Devin Racaniello
import java.util.Scanner;
public class SixPointEighteen {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a Password: ");
		String password = input.next();
		 
		if (passChecker(password)){
			System.out.print("Valid Password");
		} else {
			System.out.print("Invalid Password");
		}
		

	}
	
	public static boolean passChecker(String password) {
		
		int numOfNums = 0;
		
		if (password.length()>=8){
			
			for (int i = 0; i < password.length(); i++ ) {
				
				if((int)password.charAt(i) > 47 && (int)password.charAt(i) < 58 
				|| (int)password.charAt(i) > 64 && (int)password.charAt(i) < 91
				|| (int)password.charAt(i) > 96 && (int)password.charAt(i) < 123){
					
					if ((int)password.charAt(i) > 47 && (int)password.charAt(i) < 58){
						
						numOfNums += 1;
						if (numOfNums == 2) {
							
							return true;
						}
					}
				} else {
					
					System.out.print("not within");
					return false;
				}
			}
		} else {
			
			System.out.print("Not long");
			return false;
		}

		return false;
	}

}
