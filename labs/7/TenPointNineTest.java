
public class TenPointNineTest {

	public static void main(String[] args) {
		Course math = new Course("Math");
		
		math.addStudent("Ted");
		math.addStudent("Sigfried");
		math.addStudent("Lyion");
		
		math.dropStudent("Sigfried");
		
		for (int i = 0; i < math.getStudents().length; i++) {
			System.out.println(math.getStudents()[i]+" ");
		}

	}

}
