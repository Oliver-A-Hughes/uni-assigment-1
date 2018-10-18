import becker.robots.*;

public class DistributeMain 
{
    
    public static void main(String[] args) 
    {
           	  	// Set up the initial situation
	  	City belfast = new City(11,7);
	  
      	DistributeBot karel = new DistributeBot(belfast, 0, 1, Direction.SOUTH, 200);
     

      	karel.putThings(5);
    }
    
}
