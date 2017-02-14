//Devin Racaniello
public class SixPointNine {

	public static void main(String[] args) {

		double meters = 20.0;

		System.out.println("      Feet     Meters     |      Meters   Feet    \n      -------------------------------------------");
		for (double i = 1.0; i <= 10.0; i++){
			
			
			System.out.printf("%10.1f", i);
			System.out.printf("%10.3f", footToMeter(i));
			
			System.out.print("      |");
			
			System.out.printf("%10.1f", meters);
			System.out.printf("%10.3f", meterToFoot(meters));
			System.out.println();
			
			meters += 5;
		}
		

	}
	
	public static double footToMeter(double foot) {
		
		double meter = foot * 0.305;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		
		double foot = meter * 3.279;
		return foot;
	}

}
