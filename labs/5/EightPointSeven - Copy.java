//Devin Racaniello
public class EightPointSeven {

	public static void main(String[] args) {
		
		double[][] givenPoints = { {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},                      
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},                          
				{5.5, 4, -0.5} };
		
		int p1 = 0;
		int p2 = 1;
		int p3 = 3;
		
		double shortestDistance = distance(givenPoints[p1][0], givenPoints[p1][1], givenPoints[p1][2], givenPoints[p2][0], givenPoints[p2][p1], givenPoints[p3][p2]);
		
		for (int i = 0; i < givenPoints.length; i++) {
			for (int j = i + 1; j < givenPoints.length; j++) {
				double distance = distance(givenPoints[i][0], givenPoints[i][1], givenPoints[i][2],
						givenPoints[j][0], givenPoints[j][1], givenPoints[j][2]); 

				if (shortestDistance > distance) {
					p1 = i; 
					p2 = j; 
					shortestDistance = distance; 
				}
			}
		}
		
		System.out.println("The closest two points are " + "(" + givenPoints[p1][0] + ", " + givenPoints[p1][1] + ") and (" + givenPoints[p2][0] + ", " + givenPoints[p2][1] + ")");


		
		
	}
	
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		
		return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2));
		
	}

}
