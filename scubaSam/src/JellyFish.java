import java.awt.Point;
public class JellyFish extends Predators 
{
	private double x;
	private double y;
	private double height;
	private Point loc;
	private int speed;
	private int dir;
	public JellyFish(double locX, double locY, int spd, int d)
	{
		super(locX, locY, spd);
		dir = d; // should be randomly generated pos or neg
		height = 60;
	}
	
	public Point move(int speed)
	{
		Point current;
		current = loc.getLocation();
		double x = current.getX();
		x += speed;
		if(y > 0)
		{
			y += speed/2; // y direction speed is half of x directino speed
		}
		if(y < 0)
			y -= speed/2;
		current.setLocation(x,y);
		return current;
	}
	public boolean canMove()
	{
		if( x == 1)
			return false; // when false is returned in game class check if direction needs to be changed;
		else if(dir < 0 && y < 61)
			return false;
		else if(dir > 0 && y > 969)
			return false;
		else 
			return true;
	}
}
