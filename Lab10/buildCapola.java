import java.awt.Color;
import java.awt.Graphics;

public class buildCapola {

	public buildCapola(Graphics g, Color color, int p1, int p2, int p3, int xAdjust) {
	  Color guardColor = color;
	  g.setColor(guardColor);
	  
	  //x,y,width,height
	  g.fillRect(p1+xAdjust+20, p2-15, p3-40, 15);
	  g.setColor(new Color(0,0,0));
	  g.fillRect(p1+xAdjust+10, p2-20, p3-20, 5);
	}

}
