package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class List02 {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("민수",88));
		students.add(new Student("영이",88));
		students.add(new Student("근식",74));
		students.add(new Student("상철",92));
		students.add(new Student("영민",68));
		students.add(new Student("철민",92));
		
		System.out.println(students);
		students.sort(
				Comparator.comparingInt(Student::getScore).reversed()
				.thenComparing(Student::getName)				
				);
		System.out.println(students);
		
	}

}

class Student{
	private String name;
	private int score;
	
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
	
}