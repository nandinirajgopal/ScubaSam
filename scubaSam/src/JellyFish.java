import java.awt.Point;
import java.awt.Image; 
import javax.swing.*;
public class JellyFish extends Predators 
{
	
	private int height;
	private int width;
	
	private int dir;
	/*public JellyFish(double locX, double locY)
	{
		super(locX,locY);
	}
	*/
	public JellyFish(double locX, double locY, int d, JarPictLoader loader, int whichImage)
	{
		super(locX,locY, loader,  whichImage);
		dir = d;
		height = 60;
		width = 49;
	}
	
	public Point move()
	{
		if(canMove())
		{
			Point current;
			current = loc.getLocation();
			double x = current.getX();
			x-=10;
			if(dir > 0)
			{
				y += 10;
			}
			if (dir < 0)
			{
				y -= 10;
			}
			current.setLocation(x,y);
			loc = current;
			return current;
		}
		else
			return null;
	}
	public boolean canMove()
	{
		if( x < 0)
			return false; // when false is returned in game class check if direction needs to be changed;
		else if(dir > 0 && y > 970)
			{
			dir = -1;
			return true;
}
		else if(dir < 0 && y < 31)
{
			dir = 1;
			return true;
}
		else 
			return true;
	}
public int getHeight()
{
	return height/2;
} 
 
public int getWidth()
{
	return width/2;
}
 
}
 
 
 
 
 
 
 
 
 
