// PassengerCar.java
// 02-24-15 by Leon Schram
// This is one of the student starting files
// of the Lab14b lab assignment.


import java.awt.*;


class PassengerCar extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public PassengerCar(Color cC, int xPos, int yPos)
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
        drawRoof(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+10,getyPos()+30,25,30);
       g.fillRect(xPos+45,getyPos()+30,25,30);
	    g.fillRect(xPos+80,getyPos()+30,25,30);
       g.fillRect(xPos+115,getyPos()+30,25,30);
	}
   
   private void drawRoof(Graphics g)
   {
      Polygon roof = new Polygon();
      roof.addPoint(xPos-15,getyPos()+20);
      roof.addPoint(xPos,getyPos());
      roof.addPoint(xPos+150,getyPos());
      roof.addPoint(xPos+165,getyPos()+20);
      g.setColor(getCarColor());
      g.fillPolygon(roof);
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
	