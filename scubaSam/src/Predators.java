import java.awt.Point;
public class Predators
{
	private double x;
	private double y;
	private Point loc;
	private int speed;
	public Predators(double locX, double locY, int spd)
	{
		x = locX; // always max x value
		y = locY; // random y value > 30
		speed = spd;
		loc.setLocation(locX,locY);
	}
	
	public Point move()
	{
		Point current;
		current = loc.getLocation();
		double x = current.getX();
		x += speed;
		current.setLocation(x,y);
		loc = current;
		return current;
	}
	
	public Point getLoc()
	{
		return loc;
	}
	
	public boolean canMove()
	{
		if(x == 1)
			return false;
		else 
			return true;
			
	}
}
