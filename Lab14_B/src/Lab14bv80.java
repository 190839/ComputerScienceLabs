// Lab14bv80.java
// 02-24-15 by Leon Schram
// This is the provided testing file for the Lab14Bv80 assignment.


import java.awt.*;
import java.applet.*;


public class Lab14bv80 extends Applet
{
	public void paint(Graphics g)
	{
		
		//Get screen size and set graphics window accordingly
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int h = screenSize.height;
		int w = screenSize.width;
		resize(w, h);
		
		
      Train train = new Train(100,300);
      train.addCar("Locomotive",Color.blue);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("Caboose",Color.red);
      train.addCar("FreightCar",Color.green);
      train.showCars(g);
	}
}

