package application;

import entities.Curse;
import entities.Instructor;
import entities.Student;

public class App {

	public static void main(String[] args) {
		
		Student student = new Student("Matheus",1);
		Student student2 = new Student("Matheus",2);
		Student student3 = new Student("Matheus",3);
		Student student4 = new Student("Matheus",4);
		Student student5 = new Student("Matheus",5);
		
		
		Curse curse = new Curse("Curso a");
		Curse curse2 = new Curse("Curso b");
		Curse curse3 = new Curse("Curso c");
		
		Instructor instructor = new Instructor("Romilson");
		
		curse.addStudent(student);
		curse.addStudent(student2);
		curse2.addStudent(student);
		curse2.addStudent(student2);
		curse3.addStudent(student3);
		curse3.addStudent(student4);
		curse.addStudent(student5);
		curse2.addStudent(student5);
		
		instructor.addCurse(curse);
		instructor.addCurse(curse2);
		instructor.addCurse(curse3);
		
		System.out.println(instructor.getAllStudents());
	
		
		

	}

}
