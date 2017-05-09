/**Devin Racaniello's Filtered messenger project**/

public class MainChat {

	public static void main(String[] args) {
		
		Display display = new Display();
		display.inputUsername();
		display.setFilters();
		display.listenHost();
		display.targetPort();
		display.listenPort();
		display.inputMessage();
		
		//Loop for outputs
		while(true) {
			display.inputMessage();
		}

		
		

	}

}
