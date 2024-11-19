package cisc191fallproject;

import java.util.ArrayList;

public class Grade
{
	private ArrayList<Integer> grades;
	private String subject;
	
	public Grade(ArrayList<Integer> grades, String subject)
	{
		this.grades = grades;
		this.subject = subject;
	}
	
	
	public void addGrade(int grade) // add grade
	{
		this.grades.add(grade);
	}
	
	public ArrayList<Integer> grades() // return grades
	{
		return grades;
	}

}


