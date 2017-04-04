public class NoExceptionCalculator {
	
	public static void main(String[] args) throws Exception {
		
		if (args.length != 3) {
			System.out.println("put in an two numbers and an operator in between");
			System.exit(0);
		}
		

		int result = 0;
		
		testDigit(args[2]);
		
		testDigit(args[0]);
		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;			  
			case '-' : result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;			  
			case '.' : result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;			  
			case '/' : result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
						 
		}

		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

	
	private static void testDigit(String string) {
		for (int i = 0; i < string.length(); i++) {
			
			if (!Character.isDigit(string.charAt(i))) {
				
				System.out.println("Wrong input " + string);
				System.exit(0);
			}
		}
	}
}
