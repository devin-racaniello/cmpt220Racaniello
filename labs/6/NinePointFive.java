//Devin Racaniello
import java.util.GregorianCalendar;
public class NinePointFive {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.get(GregorianCalendar.YEAR));
		System.out.println(calendar.get(GregorianCalendar.MONTH));
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println(calendar.get(GregorianCalendar.YEAR));
		System.out.println(calendar.get(GregorianCalendar.MONTH));
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

	}

}
