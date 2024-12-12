package cisc191fallproject;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentFileSystem
{
	
	public static String readStudentFile(String studentFile)
	{
		File reportCardFile = new File(studentFile); // create a new file
		
		Scanner scan = null; // set scan to null
		
		try // try block
		{
			scan = new Scanner(reportCardFile); // create a new Scanner object with the file reference in its constructor
			
			String reportCardContent = ""; // create a new String object to hold the contents
			
			while(scan.hasNext()) // // check if their is a next line to read
			{
				reportCardContent += scan.next(); // // adds the next line to the content 
			}
					
			return reportCardContent; // return the contents of the report card
		}
		
		catch (FileNotFoundException e) // catches an FileNotException 
		{
			return ""; // returns an empty string
		}
		
		finally // finally block
		{
			if(scan!= null) // if scan is not null
			{
				scan.close(); // close the file
			}
		}	
	}
	
	public static String addToStudentFile(String studentFile, String studentData)
	{
		PrintWriter outputfileWriter = null;
		try // try block
		{
			outputfileWriter = new PrintWriter(new FileWriter( new File(studentFile),true));  // create a new PrinterWriter object and fileWriter object to append data
			
			outputfileWriter.println(studentData); // append data to the existing file
		}
		
	    catch (Exception e) // catches a general exception
	    {
	        System.out.println("Cannot write to file."); // prints out error message
	    }
		
		finally
		{
			if(outputfileWriter!= null)  /// if outputfileWriter is not null
			{
				outputfileWriter.close(); // close the file
			}
		}
		return studentData; // returns the content
	}
}
