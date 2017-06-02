import java.awt.Image;                                                                                    
import java.awt.Point;                                                                                    
                                                                                                          
import javax.swing.ImageIcon;                                                                             
public class Treasure extends Rewards                                                                     
{                                                                                                                                                                                             
	private int height = 50;                                                                                                                                                              
	public Treasure(double locX, double locY, JarPictLoader loader, int whichImage)                       
	{                                                                                                     
		super(locX, locY, loader, whichImage);                                                            
		loc = new Point((int)locX, (int)locY);                                                            
	}                                                                                                     
                                                                                                          
	                                                                                  
                                                                                                          
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
		return 25;                                                                                        
	}                                                                                                     
	                                                                                                      
	public int getHeight()                                                                                
	{                                                                                                     
		return height;                                                                                    
	}                                                                                                     
	                                                                                                      
	                                           
                                                                                                          
}                                                                                                         
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
 
 
 
 
 
