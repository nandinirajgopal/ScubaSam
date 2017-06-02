 import java.awt.Image;
import javax.swing.*;
import java.awt.Point;
public class Oxygen extends Rewards 
{
	private int height = 30;
	public Oxygen(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		super(locX, locY, loader, whichImage);
		loc = new Point((int) locX, (int)locY);
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
		return 100;
	}
	
	public int getHeight()
	{
		return height;
	}
 
 
}
 
 
 
 
 
 
 
 
 
 
 
