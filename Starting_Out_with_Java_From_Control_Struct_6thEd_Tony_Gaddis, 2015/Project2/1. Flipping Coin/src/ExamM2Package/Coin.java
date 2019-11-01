/**
 * 1. [M] This assignment is about tossing a coin with randomised outcome
(a) Design a class called Coin , and create the instance variables sideUp
and totalTosses
(b) In the Coin class design a method called tossNow that simulates the
tossing of the coin. When this method is called, it randomly determines
the side of the coin, that is facing up ("heads" or "tails") and sets the
sideUp eld accordingly.
(c) In the Coin class design a method called getSideUp which returns the
value of the sideUp instance variable.
(d) Additionally, in the Coin class, design method called getTotalTosses
that returns the value of the instance variable totalTosses . (i.e. the
total number of tosses since the tossing started)
(e) Demonstrate the Coin class, by tossing a coin 50 times. Each time the
coin is tossed, display the side that is facing up. The program should
keep count of the number of times heads is facing up and the number
of times tails is facing up, and display those values after each toss.
 */

package ExamM2Package;
import java.util.Random;


/**
 *
 * @author h18rajsa
 */

/**
   Coin Class simulate the tossing of coin with randomised outcome.  
 * /
 * @author umerraja
 */
public class Coin 
{
    
    private String sideUp;                 //For the side up faceing 
    private final int totalTosses;         // For the total tossing values
    
    /** The constructor to initialize the side up as head
        and total toss value as 50. 
    */
    
    public Coin()
    {
        
        totalTosses = 50;
        sideUp="Heads";    
    }
    
    /** The flip coin method that will simulate the flipping of the coin randomly
     */
    
    public void tossNow()
    {
        int side;                       // for the number of sides of the coin
        
        // Create a Random Object 
        Random rand = new Random();     
        
        
        // for getting a random values of the sides up or down 
        side = rand.nextInt(2);
        
        // this if else statment will simulate if the flipping as Head or Tail. 
        if (side==0)
            {
            sideUp="Heads";
            }
        else
            {
            sideUp="Tails";
            }    
    }
    
    
    /** 
        This is get side up method
        @return the side up status for the before flipping. 
     */
    
    public String getSideUp()
            
    {
      return sideUp;
    }
    
    
    /** 
        This is getTotalTosses method 
        @return the total tossing of the coin. 
     */
    
    
    public int getTotalTosses()
    
    {
     
        return totalTosses;
    }
    
    
    // Start of the main method.
    public static void main(String[] args)
    {
        
    // Create the instance of the Coin class     
    Coin flip = new Coin();
    
    // prints the inittial side of the coin on screen before tossing.
    
    System.out.println("The side is facing up initially is "+flip.getSideUp());
    
    
    int a =0;                   // for countinf the number of Heads 
    double pera;                // for counting percentage of heads 
    int b=0;                    // for counting the number of Tails 
    double perb;                // for counting percentage of Tails 
    double totab;               // total number of tossings and will be used to count 
    
    
    // for tossing the coin 50 times 
    for (int count =1; count<=flip.getTotalTosses();count++){
    
    // for accessing the tossnow method 
    
    flip.tossNow();
    
    // The getting String opbject to count the Heads and Tails 
    String tossResult=flip.getSideUp();

    if (tossResult.equals("Heads"))
    {
    a++;
    }
    else 
    {
    b++;
    }
    
    // for printing the required result of all the tossing 
    System.out.println(count+".\t"+tossResult+"\t\t["+a+","+b+"]");

    }
    double x=(double)a;     // conveting the a to double for percentage. 
    double y=(double)b;     // conveting the b to double for percentage.
    totab=x+y;              // Getting total value of a and b as double. 
    pera=(x/totab)*100;     // getting percentage of the Heads. 
    perb=(y/totab)*100;     // getting percentage of the Tails. 
    
    // for pringint the final result of the tossing percentage on output screen. 
    System.out.printf("Out of %dtosses: Heads = %.2f %% and Tails = %.2f %%\n",flip.getTotalTosses(),pera,perb);
    }

}
    
    
  
   