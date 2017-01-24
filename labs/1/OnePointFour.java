
public class OnePointFour {
  public static void main(String[] args) {
	//initial print to show the columns
	System.out.println("a      a^2    a^3");
	
	//loop to iterate through the rows
    for(int i=1; i<5; i++){
      //if and else to have proper spacing for the columns
      if (i < 4) {
    	  System.out.println(i+"      "+i*i+"      "+i*i*i);
      }
      else {
    	  System.out.println(i+"      "+i*i+"     "+i*i*i);
      }
      
    }
  }
}
