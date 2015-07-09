import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class houses {
public static void main(String[] args) {
	Tortoise.setY(430);
	Tortoise.setX(0);
	drawHouse("medium", "red");
	drawHouse("small", "blue");
	drawHouse("large", "black");
	drawHouse("medium", "red");
	drawHouse("small", "blue");
	drawHouse("large", "black");
	drawHouse("medium", "red");
	drawHouse("small", "blue");
	drawHouse("large", "black");
	
}

private static void drawHouse( String height, String color ) {
	int y = 0;
	int x = 50;
	int grass = 25;
	if(height.equals("small"))
	{
		y = 60;	
	}
	else if(height.equals("medium"))
	{
		y = 120;	
	}
	else if(height.equals("large"))
	{
		y = 250;	
	}
	if(color.equals("red"))
	{
		Tortoise.setPenColor(Colors.Reds.Red);	
	}
	else if(color.equals("blue"))
	{
		Tortoise.setPenColor(Colors.Blues.Blue);
	}
	else if(color.equals("black"))
	{
		Tortoise.setPenColor(Color.black);	
	}
	Tortoise.setSpeed(8);
	Tortoise.move(y);
	Tortoise.turn(90);
	Tortoise.move(x);
	Tortoise.turn(90);
	Tortoise.move(y);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Colors.Greens.Green);
	Tortoise.move(grass);
	Tortoise.turn(-90);
}
}
