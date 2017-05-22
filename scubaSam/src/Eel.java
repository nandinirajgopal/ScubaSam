import java.awt.Point;
public class Eel extends Predators
{
	private double height;
	
	public Eel(double locX, double locY, int spd)
	{
		super(locX, locY, spd);
		height = 30;
	}

	public double getHeight()
	{
		return height;
	}
	
	public void dummy() {}
}
