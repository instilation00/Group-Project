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
//Grade input instead of having the grades hard-coded in grades.txt - done in main method
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LetterGrade {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("grades.txt");
		int numberOfScores = 5;
		double testInput;
		double test1 = 0;
		double test2 = 0;
		double test3 = 0;
		double test4 = 0;
		double test5 = 0;
		String displayString = "Score & Letter Grade";
		
		for(int totalTests = 1; totalTests <= numberOfScores; totalTests++) {
			System.out.println("Please enter score " + totalTests);
			testInput = scanner.nextDouble();
			
			if(totalTests == 1) {
				test1 = testInput;
				outputFile.println(test1);
				displayString += test1 + determineGrade(test1);
			} else if (totalTests == 2) {
			    test2 = testInput;
				outputFile.println(test2);
				displayString += test2 + determineGrade(test2);
			} else if (totalTests == 3) {
				test3 = testInput;
				 outputFile.println(test3);
				 displayString += test3 + determineGrade(test3);
			} else if (totalTests == 4) {
				test4 = testInput;
				 outputFile.println(test4);
				displayString += test4 + determineGrade(test4);
			} else if (totalTests == 5) {
				test5 = testInput;
				 outputFile.println(test5);
				displayString += test5 + determineGrade(test5);
			}

		}
		System.out.print(displayString + "Average: " + calcAverage(test1, test2, test3, test4, test5));
	}
	
	public static String determineGrade(double testScore) {
		String convertedGrade = "";
		if (testScore >= 90) {
			convertedGrade = "A";
		} else if (testScore > 80 && testScore < 89) {
			convertedGrade = "B";
		} else if (testScore > 70 && testScore < 79) {
			convertedGrade = "C";
		} else if (testScore > 60 && testScore < 69) {
			convertedGrade = "D";
		} else if (testScore < 60) {
			convertedGrade = "F";
		}
		return convertedGrade;
	}
	
	
	public static double calcAverage(double test1, double test2, double test3, double test4, double test5) {
		double average;
		average = ((test1 + test2 + test3 + test4 + test5)/5);
		return average;
	}

}
