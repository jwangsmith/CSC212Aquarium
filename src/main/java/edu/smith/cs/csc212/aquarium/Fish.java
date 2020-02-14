package edu.smith.cs.csc212.aquarium;

import java.awt.Color;			// Make this by right clicking error on Color
import java.awt.Graphics2D;

// Started in lab with Professor JJFoley

public class Fish {
	// Every fish has an x position that is an int.
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	
	// Every fish has a destination
	int destX;
	int destY;
	
	public Fish(Color color,
			int x, int y,
			boolean isLittle) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		
		this.destX = 125;		// Set destination: Fish swim until hit 450
		this.destY = 125;
	}
	
	public void swim() {
		// "Fish Destination System"
		if (this.y > this.destY || this.x > this.destX){
		this.x -= 1;
		this.y -= 1;
		}
	}
	public void draw(Graphics2D g) {
		this.swim();
		if (this.isLittle) {
			DrawFish.smallFacingLeft(g,
				this.color, this.x, this.y);
		}
		else {
			DrawFish.facingLeft(g,
					this.color, this.x, this.y);
	}
		}
}
