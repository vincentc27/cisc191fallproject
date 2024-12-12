package cisc191fallproject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Teacher
{
	private int id; // Teacher has-a id
	private ArrayList<Student> students; // Teacher has-many students
	
	public Teacher() // Teacher constructor that creates a new arraylist of students
	{
		this.students = new ArrayList<>();
	}
	
	public Teacher(int id) // Teacher constructor that takes in their id and creates a new arraylist of students
	{
		this.id = id;
		this.students = new ArrayList<>();
	}
	
	public int getTeacherID() // getter method to return teacher id
	{
		return id;
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
			if(student.getName().equalsIgnoreCase(name)) // find name of the student, ignore case sensitivity
			{
				return student; // return the student
			}
		}
		return null; // if not found, return null
	}
	
	public Student getStudentID(int id)
	{
		for (Student student : students) // for each student
		{
			if(student.getID() == id) // if student.getID() matches id arg
			{
				return student; // return student
			}
		}
		return null; // else return null
	}
	
	public void addGrade (String studentName, String courseName, int grade)
	{
		Student student = getStudentName(studentName); // get the name and initalize it 
		
		if (student != null) // if student not null 
		{
			student.addGrade(courseName, grade); // add grade by using key value pair
		}
		
		else 
		{
			try
			{
				throw new Exception("Student not found"); // throw an exception
			}
			
			catch (Exception e) // catch the exception
			{
				System.out.println(e.getMessage()); // return  error message
			}
		}
	}
	
	public Integer getStudentGrade(String studentName, String courseName)
	{
		Student student = getStudentName(studentName); // get the name and initalize it 
		
		if (student != null) // if student not null
		{
			return student.getGrade(courseName); // get grade by using key value pair
		}
		
		else
		{
			try
			{
				throw new Exception("Student not found"); // throw an exception
			}
			
			catch (Exception e2)
			{
				System.out.println(e2.getMessage()); // return error message
			}
		}
		return null;
	}
	
}


