public class ExceptionCalculator {
	
	public static void main(String[] args) throws NumberFormatException {
		
		if (args.length != 3) {
			System.out.println("put in an two numbers and an operator in between");
			System.exit(0);
		}

		
		int result = 0;
		try {
			
			switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;			  
			case '-' : result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;			  
			case '.' : result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;			  
			case '/' : result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
						 
		}	

			
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		} 
		
		catch (NumberFormatException ex) {
			System.out.println("Wrong input " + ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, ex.getMessage().lastIndexOf("\"")));
		}
	}
}
