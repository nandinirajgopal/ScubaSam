import java.awt.Point;

public interface Rewards 
{
	public Point move();
	public Point getLoc();
	public boolean canMove();
	public int getValue();
}
