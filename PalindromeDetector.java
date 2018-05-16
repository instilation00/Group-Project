//Java Program by Holly Wetzel & Blake Bradley
import java.util.Stack;
import java.io.* ;
import java.util.Scanner; 
import javax.swing.JOptionPane;
public class PalindromeDetector {

	public static void main(String[] args) {
		
		try
		{
		 FileInputStream textFile = new FileInputStream ("data.txt");
		 Scanner inFile = new Scanner (textFile);
		 System.out.println("File data.txt has been opened.");
		}
		catch (FileNotFoundException fnfe)
		{
		 System.out.println("File data.txt was not found!");
		}
		
		//Hard coded palindromes to use as test cases
		String p1 = JOptionPane.showInputDialog("racecar");
		String p2 = JOptionPane.showInputDialog("kayak");
		String p3 = JOptionPane.showInputDialog("able was i ere i saw elba");
		String p4 = JOptionPane.showInputDialog("not a palindrome");
		
		System.out.println("Test case 1 is " + palindromeTester(p1) + " for " + p1);
		System.out.println("Test case 2 is " + palindromeTester(p2) + " for " + p2);
		System.out.println("Test case 3 is " + palindromeTester(p3) + " for " + p3);
		System.out.println("Test case 4 is " + palindromeTester(p4) + " for " + p4);

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
