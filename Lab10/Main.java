//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {

  public static void main(String[] args) {

    // Point point = new Point(5, 5); // 5, 5 makes use of the overloaded
    // constructor
    // System.out.println("Point at (" + point.getX() + "," + point.getY() + ")");

    // test.test();
    // randomFile.randomFile();// :)

    String intro = "\n\n\nNow running Lab 10:\n";
    System.out.println(intro);
    // loadingAnimation.start(2000);

    GfxApp gfx = new GfxApp();
    gfx.setSize(1920, 1080); // max x=900; max y=700
    gfx.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    gfx.setVisible(true);

  }

}










@SuppressWarnings("serial")
// Start GFX
class GfxApp extends Frame {
	
  public void paint(Graphics g) {

    System.out.println("\n\n---INITIATING WORLD CREATION SEQUENCE---\n\n");
    loadingAnimation.start(1000);
    background.sky(g);
    background.ground(g);
    functions.wait(1500);

    System.out.println("\n\n---INITIATING TRAIN SEQUENCE---\n\n");
    loadingAnimation.start(2000);

    @SuppressWarnings("unused")
	locomotive locomotive = new locomotive(g);
	functions.wait(1000);
    
    int autoAdjustForXAdjustmentValue = 0;
    int autoAdjustIncrement = 170;
    int numberOfCars = 8; //Number of plain train cars. Excludes the Locomotive and the Caboose
    for (int i=0; i<numberOfCars; i++) {
    	autoAdjustForXAdjustmentValue += autoAdjustIncrement;
    	//////////////////////////////////////
    	trainCar car = new trainCar(autoAdjustForXAdjustmentValue);
        car.buildCar(g);
    }
    autoAdjustForXAdjustmentValue += autoAdjustIncrement;
    
    @SuppressWarnings("unused")
	caboose caboose = new caboose(g, autoAdjustForXAdjustmentValue);
	functions.wait(1000);
    

    System.out.println("\n\n---WORLD GENERATION COMPLETE---\n\n");
    functions.wait(5000);
    functions.exitProgram();

  }
}