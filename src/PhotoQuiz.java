 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String Url = "http://i.imgur.com/3orRt1r.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image1 = createImage(Url);
		// 3. use the "createImage()" method below to initialize your Component
quizWindow.add(image1);
		// 4. add the image to the quiz window
quizWindow.pack();
		// 5. call the pack() method on the quiz window
		// 6. ask a question that relates to the image
String answer1 = JOptionPane.showInputDialog("Will you give Pooh some Bee Syrup Now?");
if(answer1.equals("Yes"))
{
	JOptionPane.showMessageDialog(null,"Cool ( ͡° ͜ʖ ͡°)");
}
else if(answer1.equals("No"))
	{
	JOptionPane.showMessageDialog(null,"No pls");
	}

		// 7. print "CORRECT" if the user gave the right answer
quizWindow.remove(image1);
		// 8. print "INCORRECT" if the answer is wrong
String Url2 ="https://s-media-cache-ak0.pinimg.com/736x/32/37/1a/32371a27b8859d78d7cb3bdc73e09b57.jpg";
Component image2 = createImage(Url2);
quizWindow.add(image2);
quizWindow.pack();
String answer2 = JOptionPane.showInputDialog("Are you as quiet as a mouse?");
if(answer2.equals("Yes"))
{
	JOptionPane.showMessageDialog(null,"2quiet4me");
}
else if(answer2.equals("No"))
	{
	JOptionPane.showMessageDialog(null,"3loud5me");
	}
if(answer1.equals("Yes") && answer2.equals("Yes"))
{
	JOptionPane.showMessageDialog(null,"You are a quiet bee syrup jesus");
}
else if(answer1.equals("No") && answer2.equals("No"))
	{
	JOptionPane.showMessageDialog(null,"You are an fgt");
	}
else if(answer1.equals("Yes") && answer2.equals("No"))
{
	
	JOptionPane.showMessageDialog(null,"You are angry bee");
		
}
else if(answer1.equals("No") && answer2.equals("Yes"))
{
JOptionPane.showMessageDialog(null,"You are a quiet fgt");
}

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		// 10. find another image and create it

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





