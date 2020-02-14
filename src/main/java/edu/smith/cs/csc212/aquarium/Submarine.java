package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

// From Submarine Video: https://www.youtube.com/watch?v=2zbhI_Vo1G8&feature=youtu.be

public class Submarine {
	int x;
	int y;
	Color color;
	int destX;
	int destY;
	int speedX;
	int speedY;
	
	Submarine(int startX, int startY, Color startColor) {
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
		g.fillOval(x-20, y-10, 40, 20);
		g.fillRect(x-7, y-15, 14, 10);
		
		for (int w=-3; w<3; w++) {
			g.setColor(Color.white);
			g.fillOval(x+w*6, y-2, 4, 4);
			g.setColor(Color.black);
			g.drawOval(x+w*6, y-2, 4, 4);
		}
		
		g.setColor(Color.black);
		g.drawLine(x, y-16, x, y-30);
		g.drawLine(x, y-30, x-6, y-30);
		}
	
	public void rise() {
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

	
	
	
	
