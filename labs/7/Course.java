/*
 The array size is fixed in Listing 10.6. 
 Improve it to automatically increase the array size by creating a new larger array and copying the contents of the current array to it. 
  Implement the dropStudent method. 
  Add a new method named clear() that removes all students from the course.


  */
 

public class Course {
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length + 1];
			
			for (int i = 0; i < numberOfStudents; i++) {
				temp[i] = students[i];
			}
			
			students = temp;
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		int index = 0;
		
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				index = i;
			}
		}
		
		if (index >= 0) {
			dropStudent(index);
		}
		
	}

	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		int j = 0;
		for (int i = 0; i < students.length; i++){
			if (i != index){
				s[j] = students[i];
				j += 1;
			}
		}
		this.students = s;
		numberOfStudents--;
	}


	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}

	
}
