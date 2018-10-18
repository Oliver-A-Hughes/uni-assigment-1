import becker.robots.*;

public class Q2robotSetDown 
{


    public static void main(String[] args) 
    {
        City belfast = new City();
        SetDownBot bob = new SetDownBot(belfast,1,2,Direction.SOUTH,8);
        Thing thing1 = new Thing(belfast, 2,2);

        
        bob.setDownThings(5);
    }
    
}
