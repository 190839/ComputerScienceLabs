import java.awt.Color;
import java.awt.Graphics;


public class installWindows {

	public installWindows(Graphics g, int p1, int p2, int xAdjust) {
	  g.setColor(new Color(255,255,255));
	  int l = 30;
	  g.fillRect(p1+xAdjust+20, p2+20, l, l);
	  g.fillRect(p1+xAdjust+100, p2+20, l, l); //Car width = 150; Window width = 30; We want to be 20 over...
	}

}
