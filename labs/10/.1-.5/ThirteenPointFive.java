
public class ThirteenPointFive {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(15, "green", true);
		Circle c2 = new Circle(10, "blue", true);
		
		Rectangle r1 = new Rectangle(4, 5, "red", false);
		Rectangle r2 = new Rectangle(4.2, 5, "magenta", true);
		
		System.out.println("c1: " + c1+"\n");
		System.out.println("c2: " + c2+"\n");
		
		System.out.print("the larger circle is: " + Circle.max(c1, c2)+"\n");
		
		System.out.println("r1: " + r1+"\n");
		System.out.println("r2: " + r2+"\n");
		
		System.out.print("the larger rectangle is: " + Rectangle.max(r1, r2)+"\n");

		
		
	}

}
