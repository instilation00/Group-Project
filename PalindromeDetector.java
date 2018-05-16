//Java Program by Holly Wetzel & Blake Bradley
import java.util.Stack;
import java.io.* ;
import java.util.Scanner; 
import javax.swing.JOptionPane;
public class PalindromeDetector {

	public static void main(String[] args) throws IOException{
		
		PrintWriter textFile = new PrintWriter ("data.txt");
		Scanner inFile = new Scanner (System.in);
		System.out.println("File data.txt has been opened.");
		
		//Hard coded palindromes to use as test cases
		String p1 = "racecar";
		String p2 = "kayak";
		String p3 = "able was i ere i saw elba";
		
		textFile.println("Hard-Coded examples of palindromes:");
		textFile.println(p1);
		textFile.println(p2);
		textFile.println(p3);

		
		String userInput = JOptionPane.showInputDialog("Please enter a string that you would like to check for a palindrome.");
		textFile.println(userInput);
		textFile.close();
		
		System.out.println("Examples of palindromes:" );
		System.out.println("Test case 1 is " + palindromeTester(p1) + " for " + p1);
		System.out.println("Test case 2 is " + palindromeTester(p2) + " for " + p2);
		System.out.println("Test case 3 is " + palindromeTester(p3) + " for " + p3);
		
		System.out.println("");
		System.out.println("Your entered string:" + palindromeTester(userInput));
	}
	
	public static boolean palindromeTester(String string) {
		Stack<Character> s1 = new Stack<>(); //Preserves the string
		Stack<Character> s2 = new Stack<>(); //Reverses the string
		
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			s1.push(c);
		}
		
		Stack<Character> clone = (Stack<Character>) s1.clone();

		while (!(clone.isEmpty())) {
			s2.push(clone.pop());
		}
		return s1.equals(s2);
	}
}