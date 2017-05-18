import java.awt.Point;


public interface Rewards 
{
	public Point move();
	public Point getLocation();
	public boolean canMove();
	public int getValue();
}
