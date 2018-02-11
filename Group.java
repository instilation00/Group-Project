//Program created by Holly Wetzel and Blake Bradley
//Credits: Page 420 of the textbook, https://stackoverflow.com/questions/12002332/how-to-manipulate-arrays-find-the-average-beginner-java
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LetterGrade {
	public static void main(String[] args) throws IOException
    {
       int numTests;	 //Total number of tests
       int[] tests;      //Array of test scores

       Scanner keyboard = new Scanner(System.in);
       PrintWriter outputFile = new PrintWriter("grades.txt");

       //Asks user for total number of test scores
       System.out.print("How many test scores to enter? ");
       numTests = keyboard.nextInt();

       //Asks user for individual test scores and stores them in grades.txt
       tests = new int[numTests];
       for (int index = 0; index < tests.length; index++)
       	{
    	   	System.out.print("Enter test score " + (index + 1) + ": ");
    	   	tests[index] = keyboard.nextInt();
    	   	outputFile.println(tests[index]);
       	}
       
       // Display the entered test scores, their converted letter grade, and average
       System.out.println();
       System.out.println("Here are the scores you entered:");
       for (int index = 0; index < tests.length; index++)
          System.out.println(tests[index] + "%" + "   " + determineGrade(tests[index]) + "   " );
       System.out.println("Total Test Average: " + calcAverage(tests) + "%");
       outputFile.close();
	}
	
	//Converts entered grade to letter grade
	public static String determineGrade(int testScore) {
		String convertedGrade = "";
		if (testScore > 101)
			convertedGrade = "A++, Did you bribe the teacher? How much does he charge?";
		if (testScore >= 90 && testScore <= 100) 
			convertedGrade = "A, WOW, you did great!!!";
		if (testScore >= 80 && testScore <= 89) 
			convertedGrade = "B, NICE JOB!! You can do better!.";
		if (testScore >= 70 && testScore <= 79) 
			convertedGrade = "C, Hmm, not bad. Not good either.";
		if (testScore >= 60 && testScore <= 69) 
			convertedGrade = "D, Dang, rough test huh?";
		if (testScore < 60) 
			convertedGrade = "F, Did you bomb the test or did you just not try?";
		
		return convertedGrade;
	}
	
	//Calculates the average of the tests
	public static int calcAverage(int[] tests) {  
	    int sum = 0;
	    for(int i=0; i < tests.length; i++)  
	    	sum = sum + tests[i]; 
	    int testAverage = sum / tests.length;
	    return testAverage;
	}
}
