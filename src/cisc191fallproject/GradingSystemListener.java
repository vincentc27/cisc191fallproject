package cisc191fallproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GradingSystemListener implements ActionListener
{
	private Student student;
	private Teacher teacher;
	private GradingSystemView gradingSystemView;
	
	
	public GradingSystemListener(Student student, Teacher teacher, GradingSystemView gradingSystemView)
	{
		this.student = student;
		this.teacher = teacher;
		this.gradingSystemView = gradingSystemView;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == gradingSystemView.getStudentButton())
		{
			String studentName = gradingSystemView.getStudentTextField();
			System.out.println(studentName);
            Student student = new Student(studentName);
            teacher.addStudent(student);
            System.out.println(teacher.getStudentName(studentName));
		}
		
		else if(e.getSource() == gradingSystemView.getRemoveStudentButton())
		{
			String removeStudentName = gradingSystemView.getStudentTextField();
			System.out.println(removeStudentName);	
		}
				
		else if(e.getSource() == gradingSystemView.getIDButton())
		{
			int studentID = Integer.parseInt(gradingSystemView.getStudentIDTextField());
			System.out.println(studentID);
		}
		
		else if(e.getSource() == gradingSystemView.getCourseButton())
		{
			String courseName = gradingSystemView.getCourseTextField();
			System.out.println(courseName);
		}
		
		else if(e.getSource() == gradingSystemView.getGradeButton())
		{
			String grade = gradingSystemView.getGradeTextField();
			System.out.println(grade);
		}
	}

}


