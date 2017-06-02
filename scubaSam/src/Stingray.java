import java.awt.Point;
import java.awt.Image;
import javax.swing.*;
public class Stingray extends Predators
{
	private int height;
	private int width;
 
	public Stingray(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		super(locX, locY, loader,  whichImage); // locY should always be at bottom
		height = 50;
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
 
 
 
