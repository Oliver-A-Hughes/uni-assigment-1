import becker.robots.*;
import javax.swing.JOptionPane;

public class SetDownBot extends RobotSE
{
    
     public SetDownBot(City aCity, int aStreet, int anAvenue, Direction aDir, int numThings)
   {
       super(aCity, aStreet, anAvenue, aDir, numThings);
   }
    // this will act as the counter for number of things put down
     private int numT = 1;
     
    public void setDownThings(int x)
    {
        // Make sure the value entered by the user is valid, if not display error
         if( x <=0)
        {
            JOptionPane.showMessageDialog(null,"Invalid input");
            System.exit( 0 );
        }
         
         // While the counter of things put down is lower or equal to the inputted value
         // And the robot has things in its backpack, call checkIntersection
        while((numT <= x)  && (this.hasThings()))
        {
            this.checkIntersection();
        }
      
         //If the robot has put down the desiered number of things inform the user
      if(numT > x)
      {
         JOptionPane.showMessageDialog(null,"Robot has put down " + (numT - 1) + " things");
      }   

        //If the robot has ran out of things display a message informing the user
     else if(this.countThingsInBackpack()==0)
      {
          JOptionPane.showMessageDialog(null,"Robot has ran out of things");
      }
      
    }   
   
    // Overrides the putThing method so +1 is added to numT everytime it is exectued
    
    @Override
    public void putThing() 
    {
        super.putThing(); 
        numT++;
    }
         
    // Checks if there is a thing that can be picked, if true intersection is skipped
    // If there isn't a thing on the intersection then the robot will check it has a thing
    // If the robot has a thing then it will put it down and move to the next intersection
    
    private void checkIntersection()
    {         
        if (this.canPickThing())
        {
            this.move();
        }
       else if(this.hasThings())
         {
            this.putThing();
            this.move();
         }
    }
    
    // Checks if the robot has any things in its backpack
    
    private boolean hasThings()
    {
        if(this.countThingsInBackpack()> 0)
            return true;
                    else
            return false;
    }
}

