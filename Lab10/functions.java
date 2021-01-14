
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;


@SuppressWarnings("unused")
public class functions{

  public static void wait(int ms){
      try {
          Thread.sleep(ms);
      }
      catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
      }
  }

  public static void intro(String introText){
    String text = ("Now "+introText+":");
    System.out.println(text);
    functions.wait(1500);
  }

  public static void exitProgram(){
    String text = ("\n\nThis program will shut down in 5 minutes:");
    System.out.println(text);
    //functions.wait(120000);
    // for (int i=0; i<24; i++){
    //   System.out.print(".");
    //   functions.wait(5000);
    // }
    loadingAnimation.start(300000);
    System.exit(0);
  }


///////////////////////////////////////////////////

  //They're all the same for the most part. I have different ones so that the main code is more readable

  //COLORS
  public static int colors(int min, int max){
     //int a = (int)(min + (Math.random() * max)); 
     Random rand = new Random();
     int a = rand.nextInt(max-min)+min;  

     return a;
  }

  //RANDOM LINE
  public static int lineCoord(int min, int max){
     //int a = (int)(min + (Math.random() * max)); 
     Random rand = new Random();
     int a = rand.nextInt(max-min)+min;  

     return a;
  }


  //RANDOM INTEGER
  public static int squareLocation(int min, int max){
    //int a = (int)(min + (Math.random() * max));  
    Random rand = new Random();
    int a = rand.nextInt(max-min)+min; 

    return a; 
  }


  //RANDOM COORDINATES
  public static int randCoords(int min, int max){
    //int a = (int)(min + (Math.random() * max));  
    Random rand = new Random();
    int a = rand.nextInt(max-min)+min; 

    return a; 
  }

}
