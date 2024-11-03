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
	}

	@Test 
	void testGetStudentID()
	{
		Student student1 = new Student("James", 5678);
		assertEquals(5678, student1.getID());	
	}
	
	
}
