public class Main {
	public static void main(String[] args) {
		// TODO: Integer id, String name, Integer age, Double grade, no immutability
		//  addStudentByID(), displayStudents(), findStudentByID()
		//  containsStudentByID(), isEmpty(), updateStudentByID()
		//  printAllStudentsThatGradeIsGreaterThan(), removeStudentByID()
		//  sortAllStudents(), clearAllStudents()
		
		// Create students
		Student student = new Student(1,"Lamine", 17, 83.0);
		Student student2 = new Student(2,"Erling", 24, 89.0);
		Student student3 = new Student(3,"Lionel", 23, 96.0);

		// Add students
		StudentManagement.addStudent(student);
		StudentManagement.addStudent(student2);
		StudentManagement.addStudent(student3);

		// Display students
		System.out.println("displayStudents: ");
		StudentManagement.displayStudents();

		// Find student by ID
		System.out.println("\nfindStudentByID: " + StudentManagement.findStudentByID(1));

		// Check if such a student exists by ID
		System.out.println("\ncontainsStudentByID: " + StudentManagement.containsStudentByID(2));

		// Check if an array is empty or not
		System.out.println("\nisEmpty: " + StudentManagement.isEmpty());
		
		// Print all students that grade is greater than
		System.out.println("\nprintAllStudentsThatGradeIsGreaterThan: ");
		StudentManagement.printAllStudentsThatGradeIsGreaterThan(85.0);

		// Update student by ID
		System.out.println("\nupdateStudentByID: ");
		StudentManagement.updateStudentByID(3, new Student(3, "Arda", 19, 80.0));
		StudentManagement.displayStudents();
		
		// Sort all students
		System.out.println("\nsortAllStudents: ");
		StudentManagement.sortAllStudents();
		StudentManagement.displayStudents();
		
		// Remove student by ID
		System.out.println("\nremoveStudentByID: ");
		StudentManagement.removeStudentByID(1);
		StudentManagement.displayStudents();

		// Clear all students
		System.out.println("\nclearAllStudents: ");
		StudentManagement.clearAllStudents();
		StudentManagement.displayStudents();
	}
}