import java.awt.Point;
public class Coin implements Rewards
{
	private double x;
	private double y;
	private Point loc;
	public Coin(double locX, double locY)
	{
		x = locX;
		y = locY;
		loc.setLocation(locX, locY);
	}

	public Point move()
	{
		Point current;
		current = loc.getLocation();
		double x = current.getX();
		x++;
		current.setLocation(x,y);
		return current;
	}

	public Point getLoc()
	{
		return loc.getLocation();
	}

	public boolean canMove() 
	{
		if(x == 1)
			return false;
		else
			return true;
	}

	public int getValue()
	{
		return 5;
	}

}
