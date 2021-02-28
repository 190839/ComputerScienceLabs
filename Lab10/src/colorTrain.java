import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;


public class colorTrain extends superTrain{
	
	protected int cAdjust = 0;

	public colorTrain() {
		
		Random rand = new Random();
		Color color = new Color(rand.nextInt(0xFFFFFF));  
	    setBaseColor(color);
	    
	   // setAdjust(cAdjust);
	}

}
