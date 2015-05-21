import java.net.URI;

import javax.swing.JOptionPane;

public class SoundTrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a variable.
		int mood = JOptionPane.showOptionDialog(null, "Whats your mood?", null, 0, 0, null, new String[]//Icon icon,
                		{"( ͡° ͜ʖ ͡°)","Sad", "Scared", "Mad", "Goat", "Fast", "Layers", "Dank", "Alone", "Sweg","∆"}, null); //Object initialValue 

//Metric was chosen

//Imperial was chosen

		// 2. If they are in a happy mood, use the playVideo method to play a happy song from YouTube
		
		if(mood == 0)
		{
			playVideo("https://www.youtube.com/watch?v=2HQaBWziYvY");
		}
		// 3. Play different songs for other moods
		if(mood == 1)
		{
			playVideo("https://youtu.be/y983TDjoglQ?t=47s");
		}
		if(mood == 2)
		{
			playVideo("https://youtu.be/XTgFtxHhCQ0?t=1m35s");
		}
		if(mood == 3)
		{
			playVideo("https://youtu.be/gRp_dUo5K1c");
		}
		if(mood == 4)
		{
			playVideo("https://youtu.be/lcjub1fqeQE");

		}
		if(mood == 5)
			{
			playVideo("https://youtu.be/hU7EHKFNMQg");
			}
		if(mood == 6)
		{
			playVideo("https://youtu.be/Uo2SNtFofWI");
		
		}
		if(mood == 7)
		{
			playVideo("https://youtu.be/KlujizeNNQM");
		}
		if(mood == 8)
			{
			playVideo("https://youtu.be/4zLfCnGVeL4");
		
			}
		if(mood == 9)
		{	
			playVideo("https://youtu.be/lBICLteuQs8");
		}	
		if(mood == 10)
		{
			playVideo("https://youtu.be/GRWbIoIR04c");
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
