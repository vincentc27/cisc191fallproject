package cisc191fallproject;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

class TestGradingSystemView
{
	
	@Test
	void testGetStudentButton()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		JButton addStudentButton = systemView.getStudentButton();
		assertEquals(addStudentButton, systemView.getStudentButton());
	}
	
	@Test
	void testGetStudentTextField()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		String studentText = systemView.getStudentTextField();
		assertEquals(studentText, systemView.getStudentTextField());	
	}
	
	@Test
	void testGetRemoveStudentButton()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		JButton removeStudentButton = systemView.getRemoveStudentButton();
		assertEquals(removeStudentButton, systemView.getRemoveStudentButton());
	}
	
	@Test
	void testGetIDButton()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		JButton studentIDButton = systemView.getIDButton();
		assertEquals(studentIDButton, systemView.getIDButton());
	}
	
	@Test
	void testGetStudentIDTextField()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		String studentID = systemView.getStudentIDTextField();
		assertEquals(studentID, systemView.getStudentIDTextField());
	}
	
	@Test
	void testGetCourseButton()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		JButton courseButton = systemView.getCourseButton();
		assertEquals(courseButton, systemView.getCourseButton());
		
	}
	
	@Test
	void testGetCourseTextField()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		String studentCourse = systemView.getCourseTextField();
		assertEquals(studentCourse, systemView.getCourseTextField());
		
	}
	
	@Test
	void testGetGradeButton()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		JButton gradeButton = systemView.getGradeButton();
		assertEquals(gradeButton, systemView.getGradeButton());
		
	}
	
	@Test
	void testGetGradeTextField()
	{
		Teacher teacher1 = new Teacher();
		GradingSystemView systemView = new GradingSystemView(teacher1);
		String studentGrade = systemView.getGradeTextField();
		assertEquals(studentGrade, systemView.getGradeTextField());
		
	}
	

}
