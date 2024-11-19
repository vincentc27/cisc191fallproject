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
            student.setName(studentName);
			teacher.addStudent(new Student());
		}
		
		else if(e.getSource() == gradingSystemView.getIDButton())
		{
			int studentID = Integer.parseInt(gradingSystemView.getStudentIDTextField());
			System.out.println(studentID);
		}
	}

}
