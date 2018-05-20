//Java Program by Holly Wetzel & Blake Bradley
import java.util.Stack;
import javax.swing.*;
import java.io.*;
public class PalindromeDetector {

	public static void main(String[] args) throws IOException{
		
		PrintWriter textFile = new PrintWriter ("data.txt");
        JPanel panel = new JPanel();
		Object[] JOptions = { "Stacks", "Recursion"};
		int counter = 0;
		String stackRecurCheck = null;
		String lineDisplay = null;
		String palindromes;
        
		palindromes = JOptionPane.showInputDialog("How many possible palindromes would you like to test? (1-5)");
		for (int i = 0; i < Integer.parseInt(palindromes); i++) {
			String userInput = JOptionPane.showInputDialog("Please enter a string that you would like to check for a palindrome.");
			textFile.println(userInput);
		}

        panel.add(new JLabel("Would you like to check these string(s) using stacks, or recursion?"));
        int result = JOptionPane.showOptionDialog(null, panel, "Stack or Recursive?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, JOptions, null);
        if (result == JOptionPane.YES_OPTION) {
        	stackRecurCheck = "Stacks";
        } else if (result == JOptionPane.NO_OPTION) {
        	stackRecurCheck = "Recursion";
        }
		textFile.close();
		
		//Credits to http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html for the try-catch loop
		 try {
			File file = new File("data.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			//Credit to https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way/1277904 for total lines in a text file checker
			BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
			int lines = 0;
			while (reader.readLine() != null) lines++;
			reader.close();
				
			for (int j = 0; j < lines; j++) {
				line = bufferedReader.readLine();
				stringBuffer.append(line);
				lineDisplay = line;
				
				if (stackRecurCheck == "Stacks") {
					if (palindromeTesterStack(line) == true) {
					System.out.println("Your entered string was " + "''" + lineDisplay + "''" + " and using " + stackRecurCheck + " we have determined that your string is " + palindromeTesterRecursive(stringBuffer.toString())
					+ ".");
					System.out.println("");
				  } else if (palindromeTesterStack(line) == false) {
					System.out.println("Your entered string was " + "''" + lineDisplay + "''" + " and using " + stackRecurCheck + " we have determined that your string is " + palindromeTesterRecursive(stringBuffer.toString()) 
					+ ". Remember that a palindrome is a word, phrase, or sequence that reads the same backward as forward. Please try again.");
					System.out.println("");
				  }
					
				}
				
				if (stackRecurCheck == "Recursion") {
					if (palindromeTesterRecursive(line) == true) {
					System.out.println("Your entered string was " + "''" + lineDisplay + "''" + " and using " + stackRecurCheck + " we have determined that your string is " + palindromeTesterRecursive(stringBuffer.toString()) 
					+ ".");
					System.out.println("");
				  } else if (palindromeTesterRecursive(line) == false) {
					System.out.println("Your entered string was " + "''" + lineDisplay + "''" + " and using " + stackRecurCheck + " we have determined that your string is " + palindromeTesterRecursive(stringBuffer.toString()) 
					+ ". Remember that a palindrome is a word, phrase, or sequence that reads the same backward as forward. Please try again.");
					System.out.println("");
				  }
				}
				
				fileReader.close();
				
				if (Integer.parseInt(palindromes) > counter) {
					fileReader = new FileReader(file);
					bufferedReader = new BufferedReader(fileReader);
					stringBuffer = new StringBuffer();
					bufferedReader.readLine();
					if (counter == 1) {
						bufferedReader.readLine();
					}
					if (counter == 2) {
						bufferedReader.readLine();
						bufferedReader.readLine();
					}
					if (counter == 3) {
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
					}
					if (counter == 4) {
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
					}
					if (counter == 5) {
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
						bufferedReader.readLine();
					}
				}
				counter++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean palindromeTesterStack(String string) {
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
	
	public static boolean  palindromeTesterRecursive(String string) {
		if (string.length() == 0 || string.length() == 1)
			return true;
		if (string.charAt(0) == string.charAt(string.length()-1))
			return palindromeTesterRecursive(string.substring(1, string.length()-1));
		return false;
	}
}
