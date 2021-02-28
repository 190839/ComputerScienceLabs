// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{

	public void paint(Graphics g)
	{
		//Get screen size and set graphics window accordingly
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int h = screenSize.height;
		int w = screenSize.width;
		resize(w, h);
		
		//Draw grid
		drawGrid(g);
		
		//Initialize shapes
		Shape1Square square = new Shape1Square(g);
		Shape2Triangle triangle = new Shape2Triangle(g);
		Shape3Octagon octagon = new Shape3Octagon(g);
		Shape4Circle circle = new Shape4Circle(g);
		
		//Create shape list
		Shape[] shapes = new Shape[]{square, triangle, octagon, circle};
		
		//Draw shapes
		for (Shape i: shapes) {
			i.drawShape(g);
			i.displayName(g);
			i.displayNumSides(g);
		}
		
   }
	
	
	
	
	//Defines the Draw Grid function
	public void drawGrid(Graphics g)
	{
		// (x, y, width, height)
		g.drawRect(10,10,800,600);
		// (x, y, x2, y2)
		g.drawLine(10,300,810,300); //Horizontal Line
		g.drawLine(410,10,410,610); //Vertical Line
	}
}

