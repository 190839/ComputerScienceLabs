   
   public class FR1002
      {
      //write a main method that calls a method called testMethod()
         public static void main(String[] args)
         {
            testMethod(5,10,20); //this method will take manual hard coded variable inputs (NO SCANNER)
                           //for example testMethod(5,10,20) or testMethod(5,10) or testMethod(5)
                           //You only have one testMethod...to test the three variations of the method manually change the input
         }
         
      //testMethod will have three method variations for 1 int variable, 2 int variables, and 3 int variables
      //pass these arguments testMethod(5,10,20) and your results if done properly should be: 5 200 
      public static void testMethod(int x, int y, int z)
         {
         //Construct a Pidget object with the appropriate constructor
    	  Pidget p = new Pidget(x,y,z);
         //Use these print lines exactly
         System.out.print(p.getWidgets()+" ");
         System.out.print(p.getPidgets()+ " ");
         
         
         }
         
       //pass these arguments testMethod(5,10) and your results if done properly should be: 5 10  
      public static void testMethod(int x, int y)
         {
         //Construct a Pidget object with the appropriate constructor
    	  Pidget p = new Pidget(x,y);
         //Use these print lines exactly
         System.out.print(p.getWidgets()+" ");
         System.out.print(p.getPidgets()+ " ");
         
         
         }
     
     //pass these arguments testMethod(5,10) and your results if done properly should be: 5 
      public static void testMethod(int z)
         {
         
         //Construct a Pidget object with the appropriate constructor
    	  Pidget p = new Pidget(z);
         //Use this print lines exactly
         System.out.print(p.getWidgets());
         }
   
      }
      
      
   
   
   class Widget
      {
      private int numWidgets;
      
      public Widget() {
    	  
      }
   	
      public Widget(int nw)
         {
    	  setWidgets(nw);
         }
   	
      public int getWidgets()	
         {
         return numWidgets;	
         }

      public void setWidgets(int numWidgets)
      	{
		this.numWidgets = numWidgets;
      	}
      }
   
   
   
   class Pidget extends Widget //this is a subclass of Widget...add the appropriate code
      {
      private int numPidgets;
   	
      public Pidget(int nw) 
         {
         setWidgets(nw);
         
         }
      public Pidget(int nw, int np)
         {
    	  setWidgets(nw);
    	  numPidgets = np;
         
         }
         
      public Pidget(int nw, int np, int nx)
         {
         //this version will return a numPidgets value of (np*nx)
		   //nw is still returned normally
    	  
    	  setWidgets(nw);
    	  numPidgets = np*nx;
    	  
         }
   
   	
      public int getPidgets()
         {
         return numPidgets;
         }	
      }
   