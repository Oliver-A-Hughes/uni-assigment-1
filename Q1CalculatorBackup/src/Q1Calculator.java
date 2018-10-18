import javax.swing.JOptionPane;  


public class Q1Calculator 
{

    public static void main(String[] args) 
    {
      String inputNumS;
      int inputNum;
      int ans;

      // read in number from user as a string
      inputNumS =
         JOptionPane.showInputDialog( "Enter integer" );

      // convert number from type String to type int
      inputNum = Integer.parseInt( inputNumS ); 

      // call a method to add the odd numbers
      ans = oddproduct(inputNum);

      // display the results
      JOptionPane.showMessageDialog(
         null, "The product of the odd numbers is " + ans, "Result",
         JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );   // terminate the program
   }

   static int oddproduct (int i)
   {
	// Check that the input is valid, if not display an error message and result as zero
       if(i <= 0)
       {
           JOptionPane.showMessageDialog(null, "Warning. Integer must be a positive value and greater than zero");
           int result = 0;
           return result;        
       }
       
       // If the input is valid execute the code for the calculation 
       
       int result = 1;
    
       
       // Int X goes through the numbers up to and including the input, checking if each number is odd or even
       // If the number is odd it is multiplied by the current result value 
       // Once the calculation is completed the result is returned to the user
       
       for(int x = 1; x<= i; x++) 
        {
            if(x % 2 != 0)
            {  
            result = result * x;
            }
        }
       
	return result;
   }
      
}
    

