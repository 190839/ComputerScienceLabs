// Caboose.java
// 02-24-15 by Leon Schram
// This is one of the student starting files
// of the Lab14b lab assignment.


import java.awt.*;


public class Caboose extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public Caboose(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.setxPos(xPos);
		super.drawCar(g);
		drawWindows(g);
		drawCupola(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,getyPos()+30,30,30);
	    g.fillRect(xPos+90,getyPos()+30,30,30);
	}

	private void drawCupola(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(xPos+30,getyPos()-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,getyPos()-30,100,5);
	}
	
	
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public Color getCarColor() {
		return carColor;
	}

	public int getyPos() {
		return yPos;
	}
}

