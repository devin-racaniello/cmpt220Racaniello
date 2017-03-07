//Devin Racaniello
public class Rectangle {
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		double area = width * height;
		return area;
	}
	
	double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
}
