//Devin Racaniello
public class FivePointFive {

	public static void main(String[] args) {
		int lb = 20;
		
		//Table header
		System.out.println("Kilograms  Pounds      |      Pounds         Kilograms");
		
		//Loop for printing out the table of values
		for (int i = 1; i < 200; i+= 2){
			System.out.println(i + "          " + (Math.round((i * 2.2)*10.0) / 10.0) + "         |      " + lb + "             " + (Math.round((lb / 2.2)*100.0) / 100.0));
			lb += 5;
		}

	}

}
