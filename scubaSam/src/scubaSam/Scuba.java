package scubaSam;
import java.awt.Point;
public class Scuba 
{
	private int oxygenLevel;
	private int score;
	private Point loc;
	private double height;
	public Scuba()
	{
		oxygenLevel = 100;
		score = 0;
		height = 50;
		Point start = new Point(100,500);
		loc = start;
	}
	public double getHeight()
	{
		return height;
	}
	public int getOxygen()
	{
		return oxygenLevel;
	}
	public void setScore(int points)
	{
		score=points;
	}
	public int getScore()
	{
		return score;
	}
	public void setOxygen(int oxy)
	{
		oxygenLevel = oxy;
	}
	public Point move(int dir) 
	{
		Point current = loc.getLocation();
		double y = current.getY();
		double x = current.getX();
		final int amount = 100;
		if(dir==0)
		{
			y+=amount;
		}
		else
		{
			y-= amount;
		}
		current.setLocation(x,y);
		return current;
	}
	public boolean canMove()
	{
		double y = loc.getY();
		boolean can = true;
		final double top = 1000;
		final double bottom = 0;
		if(y>top-100)
		{
			can = false;
		}
		else if(y<bottom+100)
		{
			can = false;
		}
		return can;
	}
	public static void main (String[] args)
	{
		Scuba sam = new Scuba();
		sam.getScore();
	}
}
