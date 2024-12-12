package cisc191fallproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest
{

	//@Test
   // void test()
	//{
	//   fail("Not yet implemented");
	//}
	
	@Test
	void testGetStudentName()
	{
		Student student1 = new Student("John", 1234);
		assertEquals("John", student1.getName());	
		String studentName = "Josh";
		int studentID = 4321;
		Student student2 = new Student(studentName, studentID);
	}

	@Test 
	void testGetStudentID()
	{
		Student student1 = new Student("James", 5678);
		assertEquals(5678, student1.getID());	
	}
	
	@Test
	void testGetGrade()
	{
		Student student1 = new Student("James", 5678);
		student1.addGrade("Math", 82);
		assertEquals(82, student1.getGrade("Math"));
		
		Student student2 = new Student("Johnny");
		student1.addGrade("Science", 40);
		assertEquals(40, student1.getGrade("Science"));	
	}
	
	
	
}
