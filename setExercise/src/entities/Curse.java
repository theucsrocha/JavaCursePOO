package entities;

import java.util.HashSet;
import java.util.Set;

public class Curse {
	private String name;
	private Set<Student> students = new HashSet<>();

	public Curse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	

}
