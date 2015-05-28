import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String Cat = JOptionPane.showInputDialog("How many cats u got fgt");
int Catint = Integer.parseInt(Cat);
		// 2. Convert their answer into an int
if(Catint>= 3)
{
	JOptionPane.showMessageDialog(null, "U are A CRAZY CAT LADY");
}
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(Catint < 3 && Catint > 0)
{
	playVideo("http://youtube.com/watch?v=k_5zELmun9E");
}
if(Catint == 0)
{
	playVideo("http://youtube.com/watch?v=SKRgktzRvZ0");
}// 4. If they have 3 or less, call the method below to show them a cat video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

