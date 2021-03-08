// FreightCar.java
// FreightCar.java
// 02-24-15 by Leon Schram
// This is one of the student starting files
// of the Lab14b lab assignment.


import java.awt.*;


public class FreightCar extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public FreightCar(Color cC, int xPos, int yPos)
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
		drawFreightDoors(g);
	}
   
	private void drawFreightDoors(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(xPos+30,getyPos()+10,90,60);
      g.drawLine(xPos+75,getyPos()+10,xPos+75,getyPos()+70);
      g.drawLine(xPos+30,getyPos()+10,xPos+75,getyPos()+70);
      g.drawLine(xPos+30,getyPos()+70,xPos+75,getyPos()+10);
      g.drawLine(xPos+75,getyPos()+10,xPos+120,getyPos()+70);
      g.drawLine(xPos+75,getyPos()+70,xPos+120,getyPos()+10);
      g.fillRect(xPos+66,getyPos()+35,5,15);
      g.fillRect(xPos+80,getyPos()+35,5,15);
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

