 import java.awt.Image;
import javax.swing.*;
 
import java.awt.Point;
 
public class Rewards 
{
	protected double x;
	protected double y;
	private int height = 50;
	protected Point loc;
	private Image img;
	public Rewards(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		x = locX;
		y = locY;
		loc = new Point ((int)x,(int) y);
		ImageIcon icon = loader.getImage(whichImage);
		img = icon.getImage();
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
		return 25;
	}
	
	public int getHeight()
	{
		return height;
	}
	public Image getImage()
	{
		return img;
	}
	public void disappear()
	{
		
	}
}
 
 
 
 
 
 
 
 
 
 
 
