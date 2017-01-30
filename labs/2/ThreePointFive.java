//Devin Racaniello
import java.util.Scanner;
public class ThreePointFive {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Asking for input
		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		
		//Asking for input
		System.out.print("Enter the number if days elsapsed since today: ");
		int daysPast = input.nextInt();
		
		//Variables
		String dayName = null;
		String fDayName = null;
		
		//Logic for day name
		switch (day % 6) { 
			case 0: dayName = "Sunday"; 
				break; 
			case 1: dayName = "Monday"; 
				break; 
			case 2: dayName = "Tuesday"; 
				break; 
			case 3: dayName = "Wednesday"; 
				break;
			case 4: dayName = "Thursday"; 
				break;
			case 5: dayName = "Friday"; 
				break;
			case 6: dayName = "Saturday"; 
				break;
			default: System.out.println("Error: not a day of week1"); 
				System.exit(1); }
		
		//Logic for future day name
		switch ((day + daysPast) % 7) { 
		case 0: fDayName = "Sunday"; 
			break; 
		case 1: fDayName = "Monday"; 
			break; 
		case 2: fDayName = "Tuesday"; 
			break; 
		case 3: fDayName = "Wednesday"; 
			break;
		case 4: fDayName = "Thursday"; 
			break;
		case 5: fDayName = "Friday"; 
			break;
		case 6: fDayName = "Saturday"; 
			break;
		default: System.out.println("Error: not a day of week2"); 
			System.exit(1); }
		
		//Display output
		System.out.println("Today is " + dayName + " and the future day is " + fDayName);


	}

}
