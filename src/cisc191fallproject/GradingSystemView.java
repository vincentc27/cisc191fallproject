package cisc191fallproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;


public class GradingSystemView extends JFrame
{

	private Student student;
	private Teacher teacher;
	private GradingSystemListener gradingSystemListener;
	private String file;
	private JButton addStudentButton;
	private JTextField addStudentTextField;
	private JButton addIDButton;
	private JTextField addIDTextField;
	private JTextField courseTextField;
	private JButton addCourseButton;
	private JTextField addGradeTextField;
	private JButton addGradeButton;
	private JButton removeStudentButton;
	private JList <String> studentNameList;
	private JList <Integer> idList;
	private JList <String> courseList;
	private JList <Integer> gradeList;
	public DefaultListModel <String> studentNameListModel;
	private DefaultListModel <Integer> studentIDListModel;
	private DefaultListModel <String> studentCourseListModel;
	private DefaultListModel <Integer> studentGradeListModel;
	private JScrollPane studentListScrollPane;
	private JScrollPane studentIDScrollPane;
	private JScrollPane studentCourseScrollPane;
	private JScrollPane studentGradeScrollPane;
	
	public GradingSystemView(Teacher teacher)
	{
		
		setLayout(new BorderLayout());
		
        JPanel editPanel = new JPanel();
        JPanel classSectionPanel = new JPanel();
        JPanel classListPanel = new JPanel();
        JPanel studentNameListPanel = new JPanel();
        JPanel idListPanel = new JPanel();
        JPanel courseListPanel = new JPanel();
        JPanel gradeListPanel = new JPanel();
        
        
        classSectionPanel.setLayout(new GridLayout(1,4));
        classListPanel.setLayout(new GridLayout(1,4));
        studentNameListPanel.setLayout(new GridLayout(1,1));
        idListPanel.setLayout(new GridLayout(1,1));
        courseListPanel.setLayout(new GridLayout(1,1));
        gradeListPanel.setLayout(new GridLayout(1,1));
        
        
        JLabel studentNameLabel = new JLabel("Student: ");
        JLabel studentIDLabel = new JLabel("ID: ");
        JLabel studentCourseLabel = new JLabel("Course: ");
        JLabel studentGradeLabel = new JLabel("Grade: ");
        JLabel addStudentName = new JLabel("Student:");
        
        
        studentNameListModel = new DefaultListModel<>();
        studentNameList = new JList<>(studentNameListModel);
        studentListScrollPane = new JScrollPane(studentNameList);
        studentListScrollPane.setPreferredSize(new java.awt.Dimension(1000,1000));
        
        studentIDListModel = new DefaultListModel<>();
        idList = new JList<>(studentIDListModel);
        studentIDScrollPane = new JScrollPane(idList);
        studentIDScrollPane.setPreferredSize(new java.awt.Dimension(1000,1000));
        
        studentCourseListModel = new DefaultListModel<>();
        courseList = new JList<>(studentCourseListModel);
        studentCourseScrollPane = new JScrollPane(courseList);
        studentCourseScrollPane.setPreferredSize(new java.awt.Dimension(1000,1000));
        
        studentGradeListModel = new DefaultListModel<>();
        gradeList = new JList<>(studentGradeListModel);
        studentGradeScrollPane = new JScrollPane(gradeList);
        studentGradeScrollPane.setPreferredSize(new java.awt.Dimension(1000,1000));
        
        addStudentButton = new JButton("Add");
        addStudentTextField = new JTextField(10);
        
        JLabel addID = new JLabel("ID:");
        addIDTextField = new JTextField(8);
        addIDButton = new JButton("Enter");
        
        JLabel studentCourse = new JLabel("Course:");
        courseTextField = new JTextField(10);
        addCourseButton = new JButton("Add");
        
        JLabel studentGrade = new JLabel("Grade:");
        addGradeTextField = new JTextField(10);
        addGradeButton = new JButton("Add");
        
        removeStudentButton = new JButton("Remove");
       
  
        addStudentButton.addActionListener(new GradingSystemListener(student, teacher, this, file));
        addIDButton.addActionListener(new GradingSystemListener(student, teacher, this, file));
        addCourseButton.addActionListener(new GradingSystemListener(student, teacher, this, file));
        addGradeButton.addActionListener(new GradingSystemListener(student, teacher, this, file));
        removeStudentButton.addActionListener(new GradingSystemListener(student, teacher, this, file));
        studentNameList.addListSelectionListener(new GradingSystemListener(student, teacher, this, file));
        
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
        classSectionPanel.add(studentNameLabel);
        classSectionPanel.add(studentIDLabel);
        classSectionPanel.add(studentCourseLabel);
        classSectionPanel.add(studentGradeLabel);
        studentNameListPanel.add(studentListScrollPane);
        idListPanel.add(studentIDScrollPane);
        courseListPanel.add(studentCourseScrollPane);
        gradeListPanel.add(studentGradeScrollPane);
        classListPanel.add(studentNameListPanel);
        classListPanel.add(idListPanel);
        classListPanel.add(courseListPanel);
        classListPanel.add(gradeListPanel);
        
		add(editPanel, BorderLayout.NORTH);
		add(classSectionPanel,BorderLayout.CENTER);
		add(classListPanel, BorderLayout.SOUTH);
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
	
	public JButton getRemoveStudentButton() // returns the remove student button object
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
	
	public JButton getCourseButton() // returns the course button 
	{
		return addCourseButton;
	}
	
	public String getCourseTextField() // returns the course textfield 
	{
		return courseTextField.getText();
	}
	
	public JButton getGradeButton() // returns the grade button 
	{
		return addGradeButton;
	}
	
	public String getGradeTextField() // returns the grade textfield
	{
		return addGradeTextField.getText();
	}
	
	public void addStudentToList(String studentName) // adds the student name to list in gui
	{
		if (studentNameListModel != null)
		{
			studentNameListModel.addElement(studentName);
		}
	}
	
	public JList <String> getStudentNameList() // returns the studentNameList 
	{
		return studentNameList;
	}
	
	
	public void addStudentIDToList(int studentID)  // adds the student id to list in gui
	{
		if(studentIDListModel != null)
		{
			studentIDListModel.addElement(studentID);
		}	
	}
	
	public JList <Integer> getStudentIDList() // returns the studentIDList 
	{
		return idList;
	}
	
	public void addStudentCourseToList(String course)  // adds the student course to list in gui
	{
		if(studentCourseListModel != null)
		{
			studentCourseListModel.addElement(course);
		}
	}
	
	public void addStudentGradeToList(int studentGrade) // adds the student grade to list in gui
	{
		if(studentGradeListModel != null)
		{
			studentGradeListModel.addElement(studentGrade);
		}
	}
	
	public JList <Integer> getStudentGradeList() // returns the studentGradeList 
	{
		return gradeList;
	}
	
	public static void main(String[] args) // main method
	{
	   new GradingSystemView(new Teacher(1234));	  // create new GradingSystemView obj
	}

}


