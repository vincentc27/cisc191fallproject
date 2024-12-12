package cisc191fallproject;

import java.util.HashMap;

public class Student
{
	private String name; // Student has-a name
	private HashMap<String, Integer> grades; // Student has-many courses and grades
	private int id;   // Student has-a id

	
	public Student() // Student no-arg constructor
	{
		
	}

	public Student(int id) // Student constructor with only id as its param and and creates a new grade HashMap
	{
		this.id = id;
		this.grades = new HashMap<>();
	}
	
	public Student(String name) // Student constructor with name as its param and creates a new grade HashMap
	{
		this.name = name;
		this.grades = new HashMap<>();
	}
	
	public Student(String name, int id)  // Student constructor with name and id as its param and creates a new grade HashMap
	{
		this.name = name;
		this.id = id;
		this.grades = new HashMap<>();// a student has their own grades for each course
	}
	
	public void addGrade(String course, int grade) // adds the grade using key value pair
	{
		grades.put(course, grade);
	}
	
	public Integer getGrade(String course)  // returns the grade
	{
		return grades.get(course);
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
	
	public String toString() // overriden toString method
	{
		return name;
	}
	
}
