//Java Program by Holly Wetzel & Blake Bradley
import java.util.Stack;
public class PalindromeDetector {

	public static void main(String[] args) {
		
		//Hard coded palindromes to use as test cases
		String p1 = "racecar";
		String p2 = "kayak";
		String p3 = "able was i ere i saw elba";
		String p4 = "not a palindrome";
		
		System.out.println("Test case 1 is " + palindromeTester(p1));
		System.out.println("Test case 2 is " + palindromeTester(p2));
		System.out.println("Test case 3 is " + palindromeTester(p3));
		System.out.println("Test case 4 is " + palindromeTester(p4));

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
