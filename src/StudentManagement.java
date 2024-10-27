import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
	private static final List<Student> STUDENTS = new ArrayList<>();
	
	public static void addStudent(Student student) {
		STUDENTS.add(student);
	}
	
	public static void displayStudents() {
		for (Student student : STUDENTS) System.out.println(student);
	}
	
	public static Student findStudentByID(Integer id) {
		for (Student student : STUDENTS)
			if (student.getId().equals(id)) return student;
		return null;
	}
	
	public static boolean containsStudentByID(Integer id) {
		for (Student student : STUDENTS)
			if (student.getId().equals(id)) return true;
		return false;
	}
	
	public static boolean isEmpty() {
		return STUDENTS.isEmpty();
	}
	
	public static void updateStudentByID(Integer id, Student student) {
		for (Student s : STUDENTS) {
			if (s.getId().equals(id)) {
				s.setName(student.getName());
				s.setAge(student.getAge());
				s.setGrade(student.getGrade());
				break;
			}
		}
	}
	
	public static void removeStudentByID(Integer id) {
		for (Student s : STUDENTS) {
			if (s.getId().equals(id)) {
				STUDENTS.remove(s);
				break;
			}
		}
	}
	
	public static void printAllStudentsThatGradeIsGreaterThan(Double grade) {
		for (Student s: STUDENTS)
			if (s.getGrade() >= grade) System.out.println(s);
	}
	
	public static void sortAllStudents() {
		STUDENTS.sort(Comparator.comparing(Student::getName));
	}
	
	public static void clearAllStudents() {
		STUDENTS.clear();
	}
}