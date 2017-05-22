import java.awt.Point;
public class Stingray extends Predators
{
	private double height;

	public Stingray(double locX, double locY, int spd)
	{
		super(locX, locY, spd); // locY should always be at bottom
		height = 30;
	}
	
	public double getHeight()
	{
		return height;
	}
}
