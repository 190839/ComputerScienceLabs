import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;


public class buildSMokeStack {

	public buildSMokeStack(Graphics g, Color c, int p1, int p2) {
		g.setColor(c);
		g.fillRect(p1+10, p2-30, 20, 30);
		g.fillRect(p1, p2-40, 40, 15);
		  //g.fillPolygon(xValues, yValues, xValues.length);
	}

}
