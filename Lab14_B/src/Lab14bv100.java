// Lab14bv100.java
// 02-24-15 by Leon Schram
// This is the provided testing file for the Lab14bv100 assignment.



import java.awt.*;
import java.applet.*;


public class Lab14bv100 extends Applet
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
      train.addCar(3, "PassengerCar",Color.gray);	
      train.addCar("FreightCar",Color.green);		
      train.addCar("Caboose",Color.red);
      train.addCar(6, "FreightCar",Color.green);
      train.showCars(g);
	}
}

