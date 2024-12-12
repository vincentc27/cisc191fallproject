package cisc191fallproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;



public class GradingSystemListener implements ActionListener, ListSelectionListener
{
	private Student student;
	private Teacher teacher;
	private GradingSystemView gradingSystemView;
	private StudentFileSystem studentFileSystem;
	private String file;
	
	
	public GradingSystemListener(Student student, Teacher teacher, GradingSystemView gradingSystemView, String file) // GradingSystemListener constructor takes in three arg
	{
		this.student = student;
		this.teacher = teacher;
		this.gradingSystemView = gradingSystemView;
		this.file = file;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == gradingSystemView.getStudentButton()) // if source is the student button
		{
			String studentName = gradingSystemView.getStudentTextField(); // get the text, initalize to studentName
            Student student = new Student(studentName); // put studentName in student constructor when creating student obj
            teacher.addStudent(student); // adds student to class
            //System.out.println("Student: "  + teacher.getStudentName(studentName));
            gradingSystemView.addStudentToList(studentName);    // add student to list in gui
            file = "studentFile"; // new file
            String existingFile = StudentFileSystem.addToStudentFile(file, studentName); // add student name to an existing file
            System.out.println("Student: " + existingFile);
            
		}
		
		else if(e.getSource() == gradingSystemView.getIDButton())  // if source is the id button
		{
			String studentName = gradingSystemView.getStudentTextField(); // get the text, initalize to studentName
			Student student = teacher.getStudentName(studentName); // put studentName in student constructor when creating student obj
			
			if (student != null) // if student is not null 
			{
				int studentID = Integer.parseInt(gradingSystemView.getStudentIDTextField()); // get the textfield, convert it to Integer 
				student.setID(studentID); // set it as student's id
				gradingSystemView.addStudentIDToList(studentID); // add id to the list 
				file = "studentFile";
				String existingFile = StudentFileSystem.addToStudentFile(file, gradingSystemView.getStudentIDTextField());
				System.out.println("ID: " + existingFile);
			}
			
			else
			{
				try 
				{
					throw new Exception("Student not found"); // throw new Exception 
				}
				
				catch (Exception ex2) // catch the exception 
				{
					System.out.println(ex2.getMessage()); // return an error message
				}
			}
		}
		
		else if(e.getSource() == gradingSystemView.getRemoveStudentButton()) // if source is remove student button 
		{
			String removeStudentName = gradingSystemView.getStudentTextField();	// get the text, initalize to removeStudentName
			Student student = new Student(removeStudentName);  // put removeStudentName in student constructor when creating student obj
			teacher.removeStudent(student); // remove the student
			
			int selectedIndex = gradingSystemView.getStudentNameList().getSelectedIndex(); // get the selected item in the list 
			    
			   if (selectedIndex != -1) // if its not null 
			   {
			       gradingSystemView.studentNameListModel.remove(selectedIndex); // remove the selected item
			   }
		}
				
		
		else if(e.getSource() == gradingSystemView.getCourseButton()) // if source is course button 
		{
			String courseName = gradingSystemView.getCourseTextField(); // get the text, initalize to courseName
			gradingSystemView.addStudentCourseToList(courseName); // add the course to list
			file = "studentFile";
			String existingFile = StudentFileSystem.addToStudentFile(file, courseName);
			System.out.println("Course: " + existingFile);
		}
		
		else if(e.getSource() == gradingSystemView.getGradeButton()) // if source is grade button 
		{
			String studentName = gradingSystemView.getStudentTextField(); // get the text, initalize to studentName
			String courseName = gradingSystemView.getCourseTextField(); // get the text, initalize to courseName
			Student student = teacher.getStudentName(studentName); // get student name
		    int grade = Integer.parseInt(gradingSystemView.getGradeTextField()); // get the grade text, convert to int
		    teacher.addGrade(studentName, courseName, grade); // add the grade
		    gradingSystemView.addStudentGradeToList(grade); // add the grade to list
		    file = "studentFile";
		    String existingFile = StudentFileSystem.addToStudentFile(file, gradingSystemView.getGradeTextField());
			System.out.println("Grade: " + existingFile);	   
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) // valueChanged method
	{
		
	}

}


