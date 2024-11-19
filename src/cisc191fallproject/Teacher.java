package cisc191fallproject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Teacher
{
	private int id; // Teacher has-a id
	private Student grades; 
	private Hashtable<Integer, Student> studentsID;
	private Hashtable<String, Student> studentsName;
	
	public Teacher(int id)
	{
		this.id = id;
		this.studentsID = new Hashtable<>(); // a teacher will have a students id to match each student
		this.studentsName = new Hashtable<>(); // each student is unique
	}
	
	public void addStudent(Student student) // method to add a student 
	{
		studentsName.put(student.getName(), student); 
		//studentsID.put(student.getID(), student);
	}
	
	public void removeStudent(Student student) // method to remove a student
	{
		studentsName.remove(student.getName());
	}
	
	public Student getStudentName(String name) // get name of the student
	{
		return studentsName.get(name);
	}
	
	public Student getStudentsID(int id) // get id of the student
	{
		return studentsID.get(id);
	}
}


