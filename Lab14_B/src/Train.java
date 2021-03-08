
import java.awt.*;
import java.util.ArrayList;

public class Train {
	
	private static int startingX;
	private static int x;
	private static int y;
	private static ArrayList<RailCar> railCars = new ArrayList<RailCar>();
	
	public Train(int x, int y) {
		this.startingX = x;
		this.x = this.startingX;
		this.y = y;
	}
	
	
	
	public static void addCar(String type, Color color) {
		
		
		if (type.equals("Locomotive")) {
			railCars.add(new Locomotive(color,startingX,y));
			
		}else if (type.equals("PassengerCar")) {
			x+=175;
			railCars.add(new PassengerCar(color,x,y));
			
		}else if (type.equals("FreightCar")) {
			x+=175;
			railCars.add(new FreightCar(color,x,y));
			
		}else if (type.equals("Caboose")) {
			x+=175;
			railCars.add(new Caboose(color,x,y));
			
		}
		//System.out.println(x);   //  <-- for troubleshooting locations
	}
	
	
	
	public static void addCar(int location, String type, Color color) {
		
		
		if (type.equals("Locomotive")) {
			//railCars.add(location, new Locomotive(color,startingX,y));
			System.out.println("The locomotive has to be at the front of the train");
			//System.out.println("Total: "+railCars.size()+"\nLeft: "+carsLeft+"\n\n");
			
		}else if (type.equals("PassengerCar")) {
			x = railCars.get(location).getxPos();
			railCars.add(location, new PassengerCar(color,x,y));
			//System.out.println("Total: "+railCars.size()+"\nLeft: "+carsLeft+"\n\n");
			
		}else if (type.equals("FreightCar")) {
			x = railCars.get(location).getxPos();
			railCars.add(location, new FreightCar(color,x,y));
			//System.out.println("Total: "+railCars.size()+"\nLeft: "+carsLeft+"\n\n");
			
		}else if (type.equals("Caboose")) {
			x = railCars.get(location).getxPos();
			railCars.add(location, new Caboose(color,x,y));
			//System.out.println("Total: "+railCars.size()+"\nLeft: "+carsLeft+"\n\n");
			
		}
		
		int carsLeft = railCars.size() - (location);
		
//		try {
//			int numberOfLoops = 1;
//			for (int i=(location+1); i<carsLeft; i++) {
//				System.out.println(numberOfLoops);
//				int oldX = railCars.get(i).getxPos();
//				int newX = oldX+175;
//				int oldY = railCars.get(i).getyPos();
//				Color oldColor = railCars.get(i).getCarColor();
//				System.out.println("Old: "+oldX+"\nNew: "+newX+"\n");
//				railCars.get(i).setxPos(newX);
//				numberOfLoops ++;
//			}
//		}catch(Exception e){
//			System.out.println("\n\n---No space behind current car---");
//			System.out.println(e+"\n\n");
//		}
		
		//System.out.println(x);   //  <-- for troubleshooting locations
		
		
	}



	public void showCars(Graphics g) {
		for (RailCar railCar : this.railCars)
	         railCar.drawCar(g);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
