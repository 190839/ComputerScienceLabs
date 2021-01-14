import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

@SuppressWarnings("unused")
class locomotive extends superTrain{
  
  locomotive(Graphics g){//Main method
	  
	  setBaseColor(new Color(0, 0, 0));
	  buildCar(g);
	  buildGuardShovel gs = new buildGuardShovel(g, black, p1, p2);
	  buildSMokeStack ss = new buildSMokeStack(g, black, p1, p2);
  }//End of main method
  
  


}