//Program created for CS 142 by Holly Wetzel and Blake Bradley

//Assignment instructions/requirements:
//Read 5 test scoures from a file - These will be inputed via inputGrade()
//Display a letter grade for each score in grades.txt
//Display the average of the scores from grades.txt
//
//Include the following methods:
//calcAverage - Should accept 5 test scores as arguments, return the average of scores
//determineGrade - Should accept a test score as an argument and return a letter grade for the score
//
//Creativity Points:
//Witty responses for the letter grades
//Grade input instead of having the grades hard-coded in grades.txt - done via inputGrade()
// http://www.java67.com/2016/07/how-to-read-text-file-into-arraylist-in-java.html
import java.io.*;
import java.util.Scanner;
public class LetterGrade {
	public static void main(String[] args) //TODO: Remember to give credit for this since we're pretty much copying this code from the text
    {
       int numTests;     // The number of tests
       int[] tests;      // Array of test scores

       // Create a Scanner object for keyboard input.
       Scanner keyboard = new Scanner(System.in);

       // Get the number of test scores.
       System.out.print("How many tests do you have? ");
       numTests = keyboard.nextInt();

       // Create an array to hold that number of scores.
       tests = new int[numTests];
       
       // Get the individual test scores.
              for (int index = 0; index < tests.length; index++)
       {
          System.out.print("Enter test score " +
                           (index + 1) + ": ");
          tests[index] = keyboard.nextInt();
       }

       // Display the test scores.
       System.out.println();
       System.out.println("Here are the scores you entered:");
       for (int index = 0; index < tests.length; index++)
          System.out.print(tests[index] + " ");
    }		
	
	/*public static void main(String[] args) throws IOException  { //Read from file, then display it.
		inputGrade();
		 double test1 = 0;
		 double test2 = 0;
		 double test3 = 0;
		 double test4 = 0;
		 double test5 = 0;
		 
		 String displayOutput = "";
		 
		 File file = new File("grades.txt"); 
		 PrintWriter outputFile = new PrintWriter(file); 
		 Scanner inputFile = new Scanner(file); 
		
		//inputGrade();
		while (inputFile.hasNext())
		{
			test1 = inputFile.nextDouble();
			displayOutput += test1 + determineGrade(test1); //Why is this not displaying as it should?
			
			test2 = inputFile.nextDouble();
			displayOutput += test2 + determineGrade(test2);
			
			test3 = inputFile.nextDouble();
			displayOutput += test3 + determineGrade(test3);

			test4 = inputFile.nextDouble();
			displayOutput += test4 + determineGrade(test4);

			test5 = inputFile.nextDouble();
			displayOutput += test5 + determineGrade(test5);

		}
		System.out.print(displayOutput + "Averages: " + calcAverage(test1, test2, test3, test4, test5)); //Why is this part not being displayed?
		 inputFile.close(); 
		 
	}
	
	
	public static void inputGrade() throws IOException {
		
		
		Scanner Keyboard = new Scanner(System.in);
	    double test1;
	    double test2;
	    double test3;
	    double test4;
	    double test5;
	    
	    System.out.print("What is your first test score?");
	    test1 = Keyboard.nextDouble();
	    
	    System.out.print("What is your second test score?");
	    test2 = Keyboard.nextDouble();
	    
	    System.out.print("What is your third test score?");
	    test3 = Keyboard.nextDouble();
	    
	    System.out.print("What is your fourth score?");
	    test4 = Keyboard.nextDouble();
	    
	    System.out.print("What is your fifth test score?");
	    test5 = Keyboard.nextDouble();
	    
	    PrintWriter outputFile = new PrintWriter("grades.txt");
	    outputFile.println(test1);
	    outputFile.println(test2);
	    outputFile.println(test3);
	    outputFile.println(test4);
	    outputFile.println(test5);
	    outputFile.close();
	}
	
	public static double calcAverage(double test1, double test2, double test3, double test4, double test5) {
		
	    double Average;
	    Average = ((test1 + test2 + test3 + test4 + test5)/5);
	    return Average; //Why is the average always 0? Should be pulling correctly...
	}
	
	public static String determineGrade(double testScores) {
		String convertedGrade = "";
		if (testScores >= 90) {
			convertedGrade = "A";
		} else if (testScores > 80 && testScores < 89) {
			convertedGrade = "B";
		} else if (testScores > 70 && testScores < 79) {
			convertedGrade = "C";
		} else if (testScores > 60 && testScores < 69) {
			convertedGrade = "D";
		} else if (testScores < 60) {
			convertedGrade = "F";
		}
		return convertedGrade;
	}*/
	
   
	 
}
