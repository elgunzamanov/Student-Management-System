import java.util.UUID;

public final class Student {
	private String id;
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student {id: '%s', name: '%s', grade: %d}".formatted(id, name, grade);
	}
}