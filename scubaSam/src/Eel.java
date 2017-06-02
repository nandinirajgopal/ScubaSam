import java.awt.Point;
import java.awt.Image;
import javax.swing.*;
 
public class Eel extends Predators
{
	private int height;
	private int width;
	
	public Eel(double locX, double locY, JarPictLoader loader, int whichImage)
	{
		super(locX, locY,  loader,  whichImage);
		height = 100;
		width = 184;
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
 
 
 
 
 
 
 
 
 
 
