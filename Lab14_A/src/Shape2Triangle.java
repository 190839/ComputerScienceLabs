// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
	
	String title;
	int sides;
	int titleX;
	int titleY;
	int sidesX;
	int sidesY;
	
	public Shape2Triangle(Graphics g) {
		
		title = "Triangle";
		sides = 3;
		
		titleX = 580;
		titleY = 40;
		
		sidesX = titleX;
		sidesY = titleY + 240;
		
	}
	
	
   public void drawShape(Graphics g) {
	   
	   g.setColor(Color.decode("#96031A"));
	   //g.fillRect(510,50,200,200);
	   int[] xPoints = {510, 610, 710};
	   int[] yPoints = {200, 50, 200};
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

