// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
	
	String title;
	int sides;
	int titleX;
	int titleY;
	int sidesX;
	int sidesY;
	
	public Shape1Square(Graphics g) {
		
		title = "Square";
		sides = 4;
		
		titleX = 150;
		titleY = 40;
		
		sidesX = titleX;
		sidesY = titleY + 240;
		
		
	}
	
	
   public void drawShape(Graphics g) {
	   //g.drawRect(50,50,200,200);
	   g.setColor(Color.decode("#273043"));
	   g.fillRect(100,50,200,200);
	   
   }
   
   public void displayName(Graphics g) {
	   
	   g.drawString(title, titleX, titleY);
	   
   }
   
   public void displayNumSides(Graphics g) {
	   
	   g.drawString(sides +" Sides", sidesX, sidesY);
	   
   }
   
   
   
    
   
}

