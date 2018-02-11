import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LetterGrade {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("grades.txt");
		int totalTestInput;
		int testInput;
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int test5 = 0;
		String displayString = "Test Score & Letter Grade: ";
		
		System.out.println("How many tests to enter? ");
		totalTestInput = scanner.nextInt();
		
		for(int totalTests = 1; totalTests <= totalTestInput; totalTests++) {
			System.out.println("Please enter test score " + totalTests);
			testInput = scanner.nextInt();
			
			if(totalTests == 1) {
				test1 = testInput;
				outputFile.println(test1);
				System.out.println(displayString + test1 + "   " + determineGrade(test1));
			} else if (totalTests == 2) {
			    test2 = testInput;
				outputFile.println(test2);
				System.out.println(displayString + test2 + "   " + determineGrade(test2));
			} else if (totalTests == 3) {
				test3 = testInput;
				 outputFile.println(test3);
				 System.out.println(displayString + test3 + "   " + determineGrade(test3));
			} else if (totalTests == 4) {
				test4 = testInput;
				 outputFile.println(test4);
				 System.out.println(displayString + test4 + "   " + determineGrade(test4));
			} else if (totalTests == 5) {
				test5 = testInput;
				 outputFile.println(test5);
				 System.out.println(displayString + test5 + "   " + determineGrade(test5));
			}

		}
		
		System.out.println("Total Test Average: " + calcAverage(test1, test2, test3, test4, test5, totalTestInput));
		outputFile.close();
	}
	
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
	
	
	public static double calcAverage(int test1, int test2, int test3, int test4, int test5, int totalTestInput) {
		double average;
		average = ((test1 + test2 + test3 + test4 + test5) / totalTestInput);
		return average;
	}

}
