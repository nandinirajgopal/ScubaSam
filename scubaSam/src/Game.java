import java.util.ArrayList;
import java.awt.Point;
 
public class Game 
{
	private Scuba sam;
	private ArrayList<Rewards> items;
	private JarPictLoader loader;
	
	public Game()
	{
		sam = new Scuba();
		items = new ArrayList<Rewards>();
		loader = new JarPictLoader();
		generateItems();		
	}
 
public ArrayList<Rewards> getItems()
{
	return items;
}
	
public void generateItems()
{
	double y = (int)(Math.random()*450 + 50);
	int d = (int)(Math.random() * 2);
	if (d == 0)
		d = -1;
	double x = 1720;
	double n = (int)(Math.random()* 20);
	if(n < 4)
	{
		Stingray ray = new Stingray(x, 975, loader, 3);
		items.add(0,ray);
	}
	else if(n < 9)
	{
		Eel eel = new Eel(x, y, loader,  1);
		items.add(0,eel);
	}
	else if(n < 14)
	{
		JellyFish fish = new JellyFish(x, y, d, loader, 2);
		items.add(0, fish);
	}
	else if(n < 16)
	{
		Oxygen oxy = new Oxygen(x, y, loader, 6);
		items.add(0, oxy);
	}
	else if(n < 19)
	{
		Coin coin = new Coin(x, y, loader, 4);
		items.add(0, coin);
	}
	else
	{
		Treasure chest = new Treasure(x, 975 , loader, 5);
		items.add(0, chest);
	}
	System.out.println("number of items: " + items.size());
}
 
public boolean badCollision()
{
	for(Rewards p: items)
	{
		if(p instanceof Eel)
		{
			if(sam.getLoc().getX()>= p.getLoc().getX()-40 && sam.getLoc().getX() <= p.getLoc().getX()+40)
			{
				if(p.getLoc().getY() + p.getHeight() <= sam.getLoc().getY() + sam.getHeight() && p.getLoc().getY() + p.getHeight() >= sam.getLoc().getY() - sam.getHeight())
					return true;
				if(p.getLoc().getY() + p.getHeight() <= sam.getLoc().getY() && p.getLoc().getY() - p.getHeight() >= sam.getLoc().getY())
					return true;
				if(p.getLoc().getY() - p.getHeight() >= sam.getLoc().getY() - sam.getHeight() && p.getLoc().getY() - p.getHeight() <= sam.getLoc().getY() + sam.getHeight())
					return true;
			}
		}
		else if(p instanceof JellyFish || p instanceof Stingray)
		{
			if(sam.getLoc().getX()>= p.getLoc().getX()-30 && sam.getLoc().getX() <= p.getLoc().getX()+30)
			{
				if(p.getLoc().getY() + p.getHeight() <= sam.getLoc().getY() + sam.getHeight() && p.getLoc().getY() + p.getHeight() >= sam.getLoc().getY() - sam.getHeight())
					return true;
				if(p.getLoc().getY() + p.getHeight() <= sam.getLoc().getY() && p.getLoc().getY() - p.getHeight() >= sam.getLoc().getY())
					return true;
				if(p.getLoc().getY() - p.getHeight() >= sam.getLoc().getY() - sam.getHeight() && p.getLoc().getY() - p.getHeight() <= sam.getLoc().getY() + sam.getHeight())
					return true;
			}
			/*if(p.getLoc().getY() - p.getHeight() >=sam.getLoc().getY() + sam.getHeight() && p.getLoc().getY() + p.getHeight() <= sam.getLoc().getY() - sam.getHeight())
			{
				return true;
			}
			else if(p.getLoc().getY()-p.getHeight()>=sam.getLoc().getY()-sam.getHeight() && p.getLoc().getY()-p.getHeight() <= sam.getLoc().getY())
			{
				return true;
			}
			else if(p.getLoc().getY()>=sam.getLoc().getY()-sam.getHeight() && p.getLoc().getY()<= sam.getLoc().getY())
			{
				return true;
			}
			else if(p.getLoc().getY()>=sam.getLoc().getY()&&p.getLoc().getY()-p.getHeight()<= sam.getLoc().getY() - sam.getHeight())
			{
				return true;
			}*/
		
	}
	}
	return false;
}
 
public Rewards goodCollision()
{
	for(Rewards r: items)
	{
		if(r instanceof Coin || r instanceof Oxygen || r instanceof Treasure )
		{
			if(sam.getLoc().getX()>= r.getLoc().getX()-40 && sam.getLoc().getX() <= r.getLoc().getX()+40)
			{
				if(r.getLoc().getY() >= sam.getLoc().getY() - sam.getHeight() && r.getLoc().getY() <= sam.getLoc().getY())
				{
					return r;
				}
			}
		}
	}
	return null;
}
 
public void process()
{
	for(Rewards a: items)
	{
		a.move();
	}
	//boolean over = badCollision();
	/*if(over == true|| sam.getOxygen() ==0)
	{
		goo.setGameOver();
	}
	else
	{*/
		Rewards r = goodCollision();
		if (r instanceof Coin)
		{
		sam.setScore(sam.getScore()+5);
		}
		else if(r instanceof Treasure)
		{
		sam.setScore(sam.getScore() + 25);
		}	
		else if(r instanceof Oxygen)
		{
			if(sam.getOxygen() > 75)
			{
				sam.setOxygen(100);
			}
			else
				sam.setOxygen(sam.getOxygen() + 25);
		}
//	}
}
}
 
 
 
 
 
 
