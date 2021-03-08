// RailCar.java
// 02-24-15 by Leon Schram
// This is the <RailCar> class that is the 
// super class for other train classes.
// This is one of the student starting files
// of the Lab14b lab assignment.


import java.awt.*;


public class RailCar implements trainInterface
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public RailCar(Color cC, int xP, int yP)
	{
		setCarColor(cC);
		xPos = xP;
		setyPos(yP);
	}

	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(getCarColor());
   	g.fillRect(xPos,getyPos(),150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,getyPos()+75,50,50);
		g.fillOval(xPos+95,getyPos()+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,getyPos()+80,25,5);
   }

@Override
public int getxPos() {
	return xPos;
}

@Override
public void setxPos(int xPos) {
	this.xPos = xPos;
	
}

public int getyPos() {
	return yPos;
}

public void setyPos(int yPos) {
	this.yPos = yPos;
}

public Color getCarColor() {
	return carColor;
}

public void setCarColor(Color carColor) {
	this.carColor = carColor;
}
 
}

