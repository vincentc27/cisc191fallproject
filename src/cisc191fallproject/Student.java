package cisc191fallproject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Student
{
	private String name; // Student has-a name
	private Hashtable<String, Integer> grades; // Student has-many grades
	private int id;   // Student has-a id

	
	public Student()
	{
		
	}

	public Student(String name)
	{
		this.name = name;
	}
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
		//this.grades = new Hashtable<>();// a student has their own grades for each course
	}
	
	public Integer getGrade(String subject)  // returns the grade
	{
		return grades.get(subject);
	}

	public String getName() // get student name
	{
		return name;
	}
	
	public int getID() // get student id
	{
		return id;
	}
	
	public void setName(String name) // set student name
	{
		this.name = name;
	}
	
	public void setID(int id) // set student id
	{
		this.id = id;
	}
	
	public String toString()
	{
		return name;
	}
	
}
