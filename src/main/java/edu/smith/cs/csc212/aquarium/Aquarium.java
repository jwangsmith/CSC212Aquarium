package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

/**
	//From Aquarium code given in lab: 
	 * https://github.com/jjfiv/CSC212Aquarium/blob/master/src/main/java/edu/smith/cs/csc212/aquarium/Aquarium.java
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
		
		Submarine small = new Submarine(250, 250, Color.yellow);
		Shark daddy = new Shark(250, 350, Color.gray);
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");

	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
	}

	int fish1X = getWidth() + 100;
	int fish2X = getWidth() - 300;
	// The red fish x component:
	int fish3X = 100;
	
	/* Two fish (big and small) that swim towards destination
	 * and stops at destination.
	 * 
	 */
	Fish marlin = new Fish(Color.orange,
			450, 400, false);
	Fish nemo = new Fish(Color.MAGENTA,
			480, 410, true);

	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());


		small.draw(g); // Was going to be small bubble but could not get it to move; sub does not move either
		marlin.draw(g);
		nemo.draw(g);
		daddy.draw(g);
		
		// Draw the fish!
		DrawFish.facingLeft(g, Color.yellow, fish1X, 200);
		// Draw the confused fish!
		DrawFish.facingRight(g, Color.green, fish2X, 300);

		// What if we wanted this little fish to swim, too?
		DrawFish.smallFacingLeft(g, Color.red, fish3X, 100);

		// Draw our snail!
		algorithm.draw(g);

		// Move the fish!
		fish1X -= 1;
		fish2X += 2;
		fish3X -= 3;
		if (fish1X < -50) {
			fish1X = 500;
		}
		if (fish2X > 550) {   //Add 50 for cleaner transition
			fish2X = -50;
		}
		if (fish3X < -50) {   //Bring the fish back around the window
			fish3X = 520;
		}
	}

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
