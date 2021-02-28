
class Point
{
    //Declaring 2 variables, condenced to one line
   	private int x, y;

    //class constructor
   	public Point()
   	{
      		x = 0;
      		y = 0;
   	}

    //This is an overloaded constructor
   	Point(int x, int y)
   	{
      		this.x = x;
      		this.y = y;
   	}

    //Below are methods condenced to one line
   	public int getX() 	{ return x; }
   	public int getY()	{ return y; }
}