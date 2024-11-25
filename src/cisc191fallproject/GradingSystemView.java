package cisc191fallproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class GradingSystemView extends JFrame
{

	private Student student;
	private Teacher teacher;
	private GradingSystemListener gradingSystemListener;
	private JButton addStudentButton;
	private JTextField addStudentTextField;
	private JButton addIDButton;
	private JTextField addIDTextField;
	private JTextField courseTextField;
	private JButton addCourseButton;
	private JTextField addGradeTextField;
	private JButton addGradeButton;
	private JButton removeStudentButton;
	
	public GradingSystemView(Teacher teacher)
	{
		
		//setLayout(new GridLayout());
		
		//JPanel gridPanel = new JPanel();
		//gridPanel.setLayout(new GridLayout(32,32));
        JPanel editPanel = new JPanel();
        JLabel addStudentName = new JLabel("Student:");
        addStudentButton = new JButton("Add");
        addStudentTextField = new JTextField(10);
        JLabel addID = new JLabel("ID:");
        addIDTextField = new JTextField(8);
        addIDButton = new JButton("Add");
        JLabel studentCourse = new JLabel("Course:");
        courseTextField = new JTextField(10);
        addCourseButton = new JButton("Add");
        JLabel studentGrade = new JLabel("Grade:");
        addGradeTextField = new JTextField(10);
        addGradeButton = new JButton("Add");
        removeStudentButton = new JButton("Remove");
        
        
        
        addStudentButton.addActionListener(new GradingSystemListener(student, teacher, this));
        addIDButton.addActionListener(new GradingSystemListener(student, teacher, this));
        addCourseButton.addActionListener(new GradingSystemListener(student, teacher, this));
        addGradeButton.addActionListener(new GradingSystemListener(student, teacher, this));
        removeStudentButton.addActionListener(new GradingSystemListener(student, teacher, this));
        
        editPanel.add(addStudentName, BorderLayout.WEST);
        editPanel.add(addStudentTextField);
        editPanel.add(addStudentButton);
        editPanel.add(removeStudentButton);
        editPanel.add(addID, BorderLayout.WEST);
        editPanel.add(addIDTextField);
        editPanel.add(addIDButton);
        editPanel.add(studentCourse);
        editPanel.add(courseTextField);
        editPanel.add(addCourseButton);
        editPanel.add(studentGrade);
        editPanel.add(addGradeTextField);
        editPanel.add(addGradeButton);
        
		add(editPanel, BorderLayout.WEST);
		//add(gridPanel);
		setTitle("Student Grading System"); // sets the title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true); // sets gui to be visible	
		
	}
	
	
	public JButton getStudentButton() // returns the student button object
	{
		return addStudentButton;
	}
	
	public String getStudentTextField() // returns the student textfield
	{
		return addStudentTextField.getText();
	}
	
	public JButton getRemoveStudentButton()
	{
		return removeStudentButton;
	}
	public JButton getIDButton() // returns the id button object
	{
		return addIDButton;
	}
	
	public String getStudentIDTextField() // returns the student id textfield
	{
		return addIDTextField.getText();
	}
	
	public JButton getCourseButton()
	{
		return addCourseButton;
	}
	
	public String getCourseTextField()
	{
		return courseTextField.getText();
	}
	
	public JButton getGradeButton()
	{
		return addGradeButton;
	}
	
	public String getGradeTextField()
	{
		return addGradeTextField.getText();
	}
	
	public static void main(String[] args)
	{
		new GradingSystemView(new Teacher(1234));
	}

}


