import java.awt.Point;
import java.awt.Image;
import javax.swing.*;
 
public class Predators extends Rewards
{
	public Predators(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		super(locX, locY, loader, whichImage);
	}
	
	public Point move()
	{
		Point current;
		current = loc.getLocation();
		double x = current.getX();
		x-=10;
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
	
	public int getHeight()
	{
		return 0;
	}
 
}
 
 
