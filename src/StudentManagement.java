import java.util.Objects;

public final class StudentManagement {
	private static final Student[] STUDENTS = new Student[10];
	
	public static void addStudent(Student student) {
		if (Objects.nonNull(student)) {
			for (int i = 0; i < STUDENTS.length; i++) {
				if (Objects.nonNull(STUDENTS[STUDENTS.length - 1])) {
					System.out.println("You have exceeded the limit!");
					break;
				}
				if (Objects.isNull(STUDENTS[i])) {
					STUDENTS[i] = student;
					break;
				}
			}
		}
	}
	
	public static void printAllStudent() {
		for (Student student : STUDENTS) {
			System.out.println(student);
		}
	}
	
	public static void printAllStudentsThatGradeGreateThan(int grade) {
		for (Student student : STUDENTS) {
			if (student.getGrade() >= grade) System.out.println(student);
		}
	}
}