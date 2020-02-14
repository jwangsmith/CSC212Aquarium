package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Shark {
	int x;
	int y;
	Color color;
	int destX;
	int destY;
	int speedX;
	int speedY;
	
	Shark(int startX, int startY, Color startColor) {
		this.x = startX;
		this.y = startY;
		this.color = startColor;
		this.destX = 100;
		this.destY = 100;
		this.speedX = 4;
		this.speedY = 2;
		
	}
	
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fillOval(x-20, y-10, 60, 30);
		
		g.setColor(this.)
		
		g.setColor(Color.white);
		g.fillOval(x-10, y-3, 8, 8);
		g.setColor(Color.black);
		g.drawOval(x-10, y-3, 8, 8);
		
		g.setColor(Color.gray);
		g.fillOval(x+30, y-15, 12, 40);
		}
		
	
	public void swim() {
		if (this.x + this.speedX < this.destX) {
			this.x += this.speedX;
		} else if (this.x - this.speedX > this.destX) {
			this.x -= this.speedX;
		} else {
			
			this.x = this.destX;
			
			if (this.y + this.speedY < this.destY) {
				this.y += this.speedY;
			} else if (this.y - this.speedY > this.destY) {
				this.y -= this.speedY;
			} else {
				this.y = this.destY;
			}
			
		}
	}
	
}

	
	
	
	
