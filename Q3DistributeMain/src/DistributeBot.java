import becker.robots.*;
import javax.swing.JOptionPane;

public class DistributeBot extends RobotSE
{
    //constructor
	public DistributeBot(City aCity, int aStreet, int anAvenue, Direction aDirection, int numThings) 
	{ 
		super(aCity, aStreet, anAvenue, aDirection, numThings); 
	}
        
        // method that will be called by the robot
        public void putThings(int userValue)
        {
            this.drawTriangle(userValue);
            this.drawTriangle(userValue);
        }

        // method used to draw a triangle
        private void drawTriangle(int size)
        {   
            this.checkInput(size); 
            
            while(size > 0)
            {
            this.lineCount(size);
            this.move();
            size = size - 1;
            }
            this.move();
        }
        
       
        //method used to check if the input is valid
        private void checkInput(int input)
        {
             if(input <=0)
            {
                JOptionPane.showMessageDialog(null,"Invalid input");
                System.exit( 0 );
            }
        }



        // method used to decrease the number of things per line
        private void lineCount(int numT)
        {
            this.drawLine(numT);
            numT = numT - 1;
            
        }
        
        
        
        // method used to draw a line
        private void drawLine(int linesize)
        {
            if(linesize > 0)
            {
                this.turnLeft();
                
                    while(linesize > 0)
                   {
                       this.putPart(linesize);
                       this.move();
                       linesize = linesize - 1;
                    }
            }
            this.returnStart();
        }
        
        // method used to put down the things for each line
        private void putPart(int i)
        {
            super.putThing();
            i = i - 1;
        }
        
        //Method used to return to the start of a line
        private void returnStart()
        {
            if(this.getDirection()==Direction.EAST);
            {
                this.turnAround();
                while(this.notStart())
                {
                    this.move();                
                }
            }    
            this.turnLeft();
        }
        
         //Boolean expression to check if the robot is back at its starting possition    
        private boolean notStart()
            {
                if(this.getAvenue() != 1)
                    return true ;
                else
                    return false;
            }
        
}
