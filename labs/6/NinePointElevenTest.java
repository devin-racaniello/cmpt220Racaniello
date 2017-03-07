//Devin Racaniello
import java.util.Scanner;
public class NinePointElevenTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter values for a, b, c, d, e and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linE = new LinearEquation(a, b, c, d, e, f);
		
		if (linE.isSolvable()) {
			System.out.println("x: " + linE.getX() +"\ny: " + linE.getY());
		}
		else
			System.out.println("The equation has no solution.");

	}

}
