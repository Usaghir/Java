package exercise4;
import java.util.Scanner; // need for the print the output on console

/**
 *
 * @author Raja Umer Saghir 
 */
public class Exercise4 // for class declaration.
{

    
    public static void main(String[] args) // for main method declaration. 
    {
        
        double numb1, numb2, numb3, numb4, numb5; 
        int zeros=0, positives=0, negatives=0 ; // as the number will not be more than 5 and not floating point. 
        
        Scanner keyboard = new Scanner(System.in); // Scanner Object for Keyboard input. 
        
        // for first number input. 
        System.out.print("please enter the first number: ");
        numb1 = keyboard.nextDouble();
        
        // for 2nd number input. 
        System.out.print("please enter the 2nd number: ");
        numb2 = keyboard.nextDouble();
        
        // for 3rd number input. 
        System.out.print("please enter the 3rd number: ");
        numb3 = keyboard.nextDouble();
        
        // for 4th number input. 
        System.out.print("please enter the 4th number: ");
        numb4 = keyboard.nextDouble();
        
        // for 5th number input. 
        System.out.print("please enter the 5th number: ");
        numb5 = keyboard.nextDouble();
        
            // for status of the first number if positive negative or zero. 
            if (numb1 > 0)
            positives+=1; 
            else if (numb1 < 0)
            negatives+=1;
            else
            zeros+=1; 
            
            // for status of the 2nd number if positive negative or zero.
            if (numb2 > 0)
            positives+=1; 
            else if (numb2 < 0)
            negatives+=1;
            else
            zeros+=1; 
            
            // for status of the 3rd number if positive negative or zero.
            if (numb3 > 0)
            positives+=1; 
            else if (numb3 < 0)
            negatives+=1;
            else
            zeros+=1; 
         
            // for status of the 4th number if positive negative or zero.
            if (numb4 > 0)
            positives+=1; 
            else if (numb4 < 0)
            negatives+=1;
            else
            zeros+=1;
            
            //// for status of the 5th  numbers if positive negative or zero.
            if (numb5 > 0)
            positives+=1; 
            else if (numb5 < 0)
            negatives+=1;
            else
            zeros+=1;
        
        // for output for positive, negative and zeros. 
                System.out.println("Number of positves: "+positives);
                
                System.out.println("Number of negatives: "+negatives);
                
                System.out.println("Number of zeros: "+zeros);
      
    }
    
}
