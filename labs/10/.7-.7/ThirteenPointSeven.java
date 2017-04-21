
public class ThirteenPointSeven {

	public static void main(String[] args) {
		Square s1 = new Square(4, "yellow", false);
		Square s2 = new Square(9, "red", true);
		Square s3 = new Square(3, "magenta", false);
		Square s4 = new Square(2, "green", true);
		Square s5 = new Square(8, "brown", true);
		
	 	System.out.println("Square s1 area: " + s1.getArea());
	 	System.out.println("To Color: " + s1.howToColor());
	 	
	 	System.out.println("Square s2 area: " + s2.getArea());
	 	System.out.println("To Color: " + s2.howToColor());
	 	
	 	System.out.println("Square s3 area: " + s3.getArea());
	 	System.out.println("To Color: " + s3.howToColor());
	 	
	 	System.out.println("Square s4 area: " + s4.getArea());
	 	System.out.println("To Color: " + s4.howToColor());
	 	
	 	System.out.println("Square s5 area: " + s5.getArea());
	 	System.out.println("To Color: " + s5.howToColor());

	}

}
