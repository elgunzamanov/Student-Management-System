public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private Double grade;
	
	public Student(Integer id, String name, Integer age, Double grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Double getGrade() {
		return grade;
	}
	
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student {id: %d, name: '%s', age: %d, grade: %s}".formatted(id, name, age, grade);
	}
}