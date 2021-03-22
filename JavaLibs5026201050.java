import javax.swing.JOptionPane;

public class JavaLibs5026201050{
	public static void main(String args[]){
	int equation = 55 + 55;
	int substraction = 567-250;
	double multiplication = 2.5*2;
	double division = 22.5/5;
		JOptionPane.showMessageDialog(null, "Hello there! Today we're going to converse for a while to get closer :3. After that, we'll have a Math Pop Quiz. Why? Because I love math!! Ok, let's start!");
		String yourName = JOptionPane.showInputDialog(null, "First of all, what's your name?");
		String yourAge = JOptionPane.showInputDialog(null, "What a nice name! My name is Raysa. How old are you?");
		String yourSchool = JOptionPane.showInputDialog(null, "Which school do you go?");
		String yourMajor = JOptionPane.showInputDialog(null, "Me? I go to Sepuluh Nopember Institute of Technology, majoring in Information Systems. How about your major?");
		String yourHobby = JOptionPane.showInputDialog(null, "Wow, I hope you'll be successful in your field! Okay now, what about your hobby? Anything you like to do to pass the time?");
		String yourMusic = JOptionPane.showInputDialog(null, "Cool! I love to read fantasy novels and listen to songs. Speaking of song, what song have you heard recently?");
		JOptionPane.showMessageDialog(null, "Sounds interesting, I'll make sure to add that song to my playlist. Now, it's time for Math Pop Quiz! I hope you're excited because I do!");
		int quiz1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Here's the easy one! What's 55+55?"));
		int quiz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Now don't be too giddy! We're just getting started, what's 567-250?"));
		double quiz3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Easy peasy, you say? All right, how about this! What's 2.5*2?"));
		double quiz4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Last one, what's 22.5/5?"));
		JOptionPane.showMessageDialog(null, "Wow, you passed all the question! Congratulations!! Now, I must bid my goodbye. Thank you for conversing with me, hope you have fun too! Bye-bye!");
		System.out.println(yourName + "\n" + yourAge + "\n" + yourSchool + "\n" + yourMajor + "\n" + yourHobby + "\n" + yourMusic);
		System.out.println(equation);
		System.out.println(substraction);
		System.out.println(multiplication);
		System.out.println(division);
	}
}
	