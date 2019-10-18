package exercise2;
import java.util.Scanner; // required to find and the Scanner class in library. 


/**
 *
 * @author Raja Umer Saghir 
 */
public class Exercise2 // for class declaration.  
{
    public static void main(String[] args) // for main method declarion. 
    {
       
        double milesDriven, gasUsed, MPG; // Double declaration as the numbers could be in floating points numbers. 
        
            Scanner keyboard = new Scanner(System.in); // for creating scanner opbject. 
        
            System.out.print("Plese provdie the number of miles driven: "); // for printing the input string to ask user. 
            milesDriven = keyboard.nextDouble();    // Scanner Class methods to for Double input. 
        
        
            System.out.print("Plese provdie the gallons of gas used: " );
            gasUsed = keyboard.nextDouble();        // Scanner Class methods to for Double input. 
        
            MPG = milesDriven/gasUsed;              // for calculating the MPG
        
            System.out.println("Your miles-per-gallon MPG is: " +MPG); // for printing the output for the user on output screen. 
    }
    
}
