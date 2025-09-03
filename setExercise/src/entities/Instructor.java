package entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
	private String name;
	private Set<Curse> curses = new HashSet<>();

	public Instructor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCurse(Curse curse) {
		curses.add(curse);
	}

	public int getAllStudents() {
		Set<Student> allStudents = new HashSet<>();
		for (Curse c : curses) {
			allStudents.addAll(c.getStudents());
		}

		return allStudents.size();

	}
}
