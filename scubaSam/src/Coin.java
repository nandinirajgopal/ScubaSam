 
import java.awt.Point;
public class Coin extends Rewards
{
	private int height = 25;
	public Coin(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		super(locX, locY, loader,  whichImage);
		loc = new Point ((int)locX, (int)locY);
	}
 
	/*public Point move()
	{
		Point current;
		current = loc.getLocation();
		double x = current.getX();
		x++;
		current.setLocation(x,y);
		return current;
	}*/
 
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
	
	public int getHeight()
	{
		return height;
	}
}
 
 
 
