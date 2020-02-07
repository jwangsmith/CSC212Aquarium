package edu.smith.cs.csc212.aquarium;

import java.awt.Color;			// Make this by right clicking error on Color
import java.awt.Graphics2D;

public class Fish {
	// Every fish has an x position that is an int.
	int x;
	int y;
	Color color;
	
	// Every fish has a destination
	int destX;
	int destY;
	
	public Fish(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		
		this.destX = 450;		// Set destination: Fish swim until hit 450
		this.destY = 450;
	}
	
	public void swim() {
		// "Fish Destination System"
		if (this.y < this.destY) {
		this.y -= 1;			// Fish swim to the bottom
		}
	}
	public void draw(Graphics2D g) {
		this.swim();
		
		DrawFish.smallFacingLeft(g,
				this.color, this.x, this.y);
	}
}
