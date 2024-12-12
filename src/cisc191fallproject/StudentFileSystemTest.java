package cisc191fallproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;

class StudentFileSystemTest
{

	@Test
	void testReadStudentFile() throws IOException
	{
		FileWriter writer = new FileWriter("studentFile.txt");
        writer.write("John,1234,Science,90\n");
        writer.close();
		String results = StudentFileSystem.readStudentFile("studentFile.txt");
		assertTrue(results.startsWith("John,1234,Science,90"));
	}
	
	@Test
	   void testAddToStudentFile()
	   {      
	      StudentFileSystem.addToStudentFile("studentFile.txt", "John");
	      String results = StudentFileSystem.readStudentFile("studentFile.txt");
	      assertTrue(results.endsWith("John"));
	   }

}
