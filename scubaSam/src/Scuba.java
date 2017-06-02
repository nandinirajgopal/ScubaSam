import java.awt.Point;
import java.awt.Image;
import javax.swing.*;
 
public class Scuba 
{
	private int score;
	private Point loc;
	private int height;
	private int width;
	public Scuba()
	{
		
		score = 0;
		height = 48;
		width = 100;
		Point start = new Point(100,250);
		loc = start;
	}
	public int getHeight()
	{
		return height/2;
	}
	public int getWidth()
	{
		return width/2;
	}
	public void setScore(int points)
	{
		score=points;
	}
	public int getScore()
	{
		return score;
	}
	
	public void move(int dir) 
	{
		Point current = loc.getLocation();
		double y = current.getY();
		double x = current.getX();
		final int amount = 25;
		if(dir==0)
		{
			y-=amount;
		}
		else
		{
			y+= amount;
		}
		current.setLocation(x,y);
		loc = current;
	}
	public Point getLoc()
	{
		return loc;
	}
	
	public boolean canMoveUp()
	{
		double y = loc.getY();
		boolean can = true;
		final double top = 0;
		if(y<top+50)
		{
			can = false;
		}
		return can;
	}
	
	public boolean canMoveDown()
	{
		double y = loc.getY();
		boolean can = true;
		final double bot = 1000;
		if(y>bot-100)
		{
			can = false;
		}
		return can;
	}
}
 
 
