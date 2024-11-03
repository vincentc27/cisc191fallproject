package cisc191fallproject;

public class Student
{
	private String name; // Student has-a name
	private int grade; // Student has-a grade
	private int id;   // Student has-a id

	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	
	public int getGrade()
	{
		return grade;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
}
