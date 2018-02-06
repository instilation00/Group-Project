
//Blake Bradley


import javax.swing.JOptionPane;
public class Group {
	public static void main(String[] args) {
		
		String A, B, C, D, F;
		int Score;
		
		Score = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade"));
		
		
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
