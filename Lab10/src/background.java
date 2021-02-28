import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;


@SuppressWarnings("unused")
class background {


  

  public static void sky(Graphics g){
    functions.intro("creating Sky");

    g.setColor(new Color(97, 237, 255));
    g.fillRect(0, 0, 2000, 290);
    //g.drawLine(10,300,790,300); //horizon line
		

  }

  public static void ground(Graphics g){
    functions.intro("creating Ground");

    g.setColor(new Color(54, 199, 83));
    g.fillRect(0, 290, 2000, 1000);
		

  }















}