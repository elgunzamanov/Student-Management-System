public class Main {
	public static void main(String[] args) {
		//TODO: Student = id(random: UUID), name(String), grade(int)
		// StudentManagement = public static: Student[10]
		// getAllStudents, getAllStudentsThatGradeGreateThan(int grade) (static)
		// addStudent(Student student) > student > staticArray (static)
		// add, 10; print LIMIT
		// UUID.randomUUID()
		
		StudentManagement.addStudent(new Student("student 1", 80));
		StudentManagement.addStudent(new Student("student 2", 90));
		StudentManagement.addStudent(new Student("student 3", 85));
		StudentManagement.addStudent(new Student("student 4", 75));
		StudentManagement.addStudent(new Student("student 5", 95));
		StudentManagement.addStudent(new Student("student 6", 80));
		StudentManagement.addStudent(new Student("student 7", 90));
		StudentManagement.addStudent(new Student("student 8", 85));
		StudentManagement.addStudent(new Student("student 9", 75));
		StudentManagement.addStudent(new Student("student 10", 95));
		StudentManagement.addStudent(new Student("student 11", 80));
		
		StudentManagement.printAllStudent();
		System.out.println();
		StudentManagement.printAllStudentsThatGradeGreateThan(90);
	}
}