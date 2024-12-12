package cisc191fallproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeacherTest
{

	
	@Test
	void testGetTeacherID()
	{
		Teacher teacher1 = new Teacher(79141);
		assertEquals(79141, teacher1.getTeacherID());
	}
	
	@Test
	void testGetStudentByName()
	{
		Student student1 = new Student("Johnny");
		Teacher teacher1 = new Teacher();
		teacher1.addStudent(student1);
		assertEquals(student1, teacher1.getStudentName("Johnny"));
	}
	
	@Test
	void testGetStudentByID()
	{
		Student student1 = new Student("Danny", 1234);
		Teacher teacher1 = new Teacher();
		teacher1.addStudent(student1);
		assertEquals(student1.getName(), teacher1.getStudentID(1234).getName());
	}
	
	@Test
	void testGetStudentGrade()
	{
		Student student1 = new Student("Johnny");
		Teacher teacher1 = new Teacher();
		teacher1.addStudent(student1);
		teacher1.addGrade("Johnny", "Math", 87);
		assertEquals(87, teacher1.getStudentGrade("Johnny", "Math"));
		
	}

}
