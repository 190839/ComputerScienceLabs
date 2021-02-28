import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;


public class buildGuardShovel {

	public buildGuardShovel(Graphics g, Color c, int p1, int p2) {
		int x1 = p1;
		  int y1 = p2+50;
		  
		  int x2 = x1;
		  int y2 = p2+100;
		  
		  int x3 = x1-50;
		  int y3 = p2+100;
		 
		  int[] xValues = new int[]{x1, x2, x3};
		  int[] yValues = new int[]{y1, y2, y3};
		  
		  g.setColor(c);
		  g.fillPolygon(xValues, yValues, xValues.length);
	}

}
