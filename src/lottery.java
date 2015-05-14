import java.util.Random;
import javax.swing.JOptionPane;
public class lottery {
public static void main(String[] args) {
	for (int i = 0; i <= 8; i++) {
		int random = new Random().nextInt(100);
		
		if( random > 0)
			{
			JOptionPane.showMessageDialog(null, random);
			}
		
	}
}
}
