import java.net.URI;

import javax.swing.JOptionPane;

public class SoundTrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a variable.
		String mood = JOptionPane.showInputDialog("What is Your Mood Fgt?");
		// 2. If they are in a happy mood, use the playVideo method to play a happy song from YouTube
		if(mood.equals("Happy"))
		{
			playVideo("https://www.youtube.com/watch?v=2HQaBWziYvY");
		}
		// 3. Play different songs for other moods
		else
		{
			playVideo("https://youtu.be/y983TDjoglQ?t=47s");
		}
		// If you are seeing ads at the beginning of your videos, install Adblock.
		
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

