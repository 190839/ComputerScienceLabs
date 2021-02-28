import java.awt.Color;
import java.awt.Graphics;

class caboose extends superTrain{
	
	caboose(Graphics g, int xAdjust){//Main method
		  
		  setBaseColor(new Color(255,40,40));
		  setAdjust(xAdjust);
		  
		  buildCar(g);
		  buildCapola bc = new buildCapola(g, getBaseColor(), p1,p2,p3, xAdjust);
		  installWindows iw = new installWindows(g, p1,p2, xAdjust);
		
	  }//End of main method
	  
	  
	  
	  
	  public void installWindows(Graphics g, int xAdjust){

		//x,y,width,height
		  g.setColor(white);
		  int l = 30;
		  g.fillRect(p1+xAdjust+20, p2+20, l, l);
		  g.fillRect(p1+xAdjust+100, p2+20, l, l); //Car width = 150; Window width = 30; We want to be 20 over...
		  
	  }

}