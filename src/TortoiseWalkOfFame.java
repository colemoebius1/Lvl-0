// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge. A solution
 * is printed in the red curriculum folder.
 */

public class TortoiseWalkOfFame {

	public static void main(String[] args) {
		int X = 50;
		int Y = 200;
		Tortoise.setY(Y);
		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
Tortoise.setX(X);
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < 6; i++) {
			
			for (int i1 = 0; i1 < 5; i1++) {
				Tortoise.move(100);
				Tortoise.turn(144);
				if (i1 == 4) {
					Tortoise.setX(X += 100);

				}
				if( i == 6)
				{
					Tortoise.setY(Y+= 50);
				}
					
					
				}
		}
			
		}

		// 3. Set the size of the star to 30.
		

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://postimg.org/image/40rsesa8h/
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}


