// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
	
	String title;
	int sides;
	int titleX;
	int titleY;
	int sidesX;
	int sidesY;
	
	public Shape4Circle(Graphics g) {
		
		title = "Circle";
		sides = 0;
		
		titleX = 580;
		titleY = 340;
		
		sidesX = titleX;
		sidesY = titleY + 240;
		
	}
	
	
   public void drawShape(Graphics g) {
	   
	   g.setColor(Color.decode("#FAA916"));
	   //g.fillRect(510,350,200,200);
	   g.fillOval(510, 350, 200, 200);
   
   }   
   
   
   public void displayName(Graphics g) {
	   
	   g.drawString(title, titleX, titleY);
	   
   }
   
   public void displayNumSides(Graphics g) {
	   
	   g.drawString(sides +" Sides", sidesX, sidesY);
	   
   }
   
   
   
   
}
