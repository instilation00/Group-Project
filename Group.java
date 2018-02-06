
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

import java.io.*;
import java.util.Scanner;
public class Group {
	
	public static void inputGrade() throws IOException {
		Scanner Keyboard = new Scanner(System.in);
	    double test1;
	    double test2;
	    double test3;
	    double test4;
	    double test5;
	    
	    System.out.print("What is your first test score?");
	    test1 = Keyboard.nextInt();
	    
	    System.out.print("What is your second test score?");
	    test2 = Keyboard.nextInt();
	    
	    System.out.print("What is your third test score?");
	    test3 = Keyboard.nextInt();
	    
	    System.out.print("What is your fourtht score?");
	    test4 = Keyboard.nextInt();
	    
	    System.out.print("What is your fifth test score?");
	    test5 = Keyboard.nextInt();
	    
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
	    return Average;
	}
	
	public static void main(String[] args) {
		InputGrade inputGrade = new inputGrade();
	}
	

public static void determineGrade(double test1, double test2, double test3, double test4, double test5) {
   
	File file = new File("grades.txt");
	Scanner inputFile = new Scanner(file);
	
	while (inputFile.hasNext())
	{
		
	String test1 = inputFile.nextLine();
	String test2 = inputFile.nextLine();
	String test3 = inputFile.nextLine();
	String test4 = inputFile.nextLine();
	String test5 = inputFile.nextLine();
	
	if (Score >= 90)
		System.out.println("You got an A");
		else if (Score > 80 && Score < 89)
		System.out.println("You got a B");
		else if (Score > 70 && Score < 79)
		System.out.println("you got a C");
		else if (Score > 60 && Score < 69)
		System.out.println("You got a D");
		else if (Score < 60)
		System.out.println("You got a F");
}
}
