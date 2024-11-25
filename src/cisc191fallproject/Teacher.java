package cisc191fallproject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Teacher
{
	private int id; // Teacher has-a id
	private Student grades; 
	private ArrayList<Student> students;
	
	public Teacher(int id)
	{
		this.id = id;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) // method to add a student 
	{
		students.add(student);
	}
	
	public void removeStudent(Student student) // method to remove a student
	{
		students.remove(student);
		
	}
	
	public Student getStudentName(String name) // get name of the student
	{
		for (Student student : students)
		{
			if(student.getName().equalsIgnoreCase(name))
			{
				return student;
			}
		}
		return null;
	}
}


