// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape{
	
	String title;
	int sides;
	int titleX;
	int titleY;
	int sidesX;
	int sidesY;

	public Shape3Octagon(Graphics g) {
		
		title = "Octagon";
		sides = 8;
		
		titleX = 150;
		titleY = 340;
		
		sidesX = titleX;
		sidesY = titleY + 240;
		
	}

   public void drawShape(Graphics g) {
	   
	   g.setColor(Color.decode("#4F772D"));
	   //g.fillRect(100,350,200,200);
	   int[] xPoints = {140, 200, 230, 230, 200, 140, 110, 110}; //starting at very top line and going clockwise
	   int[] yPoints = {350, 350, 380, 440, 470, 470, 440, 380};
	   int numberOfPoints = xPoints.length;
	   g.fillPolygon(xPoints, yPoints, numberOfPoints);
	   
   }
   
   public void displayName(Graphics g) {
	   
	   g.drawString(title, titleX, titleY);
	   
   }
   
   public void displayNumSides(Graphics g) {
	   
	   g.drawString(sides +" Sides", sidesX, sidesY);
	   
   }
   
   
}

