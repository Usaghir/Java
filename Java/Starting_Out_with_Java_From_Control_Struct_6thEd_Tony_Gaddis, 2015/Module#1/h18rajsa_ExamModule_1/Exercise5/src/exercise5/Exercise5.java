

// This Programe will calculate the bank service fee for the user.
 
package exercise5;
import javax.swing.JOptionPane;         // required for the dialoge box input and output. 

/**
 *
 * @author Raja Umer Saghir 
 */
public class Exercise5                  // for class declaration
{
    
    public static void main(String[] args) // for main method declaraion. 
    {
        
        
        final int baseFee = 15;         // as this will remain the same no changes will be made. 
        int numberOfChecks;             // for number of checks as these can't be floating points numbers. 
        double checkFee, totalFee;      // these both could be floating points numbers as well 
        String input;                   // for converting Strings into integer. 
    
        
        // for user to provide the number of checks written for the monts and converting string to ineger. 
        input = JOptionPane.showInputDialog("Please enter the number of checks written for the month: ");
        numberOfChecks = Integer.parseInt(input);

        if (numberOfChecks < 15)                                                
        checkFee = 0.10;
        
        //up to 14 and less checks the fee will be $0.10.
        else if (numberOfChecks >= 15 && numberOfChecks <= 29) 
            
            
            //upto first 14 checks fee will be $0.10 + from 15 to 29 fee will be $0.08.
            checkFee = (14*0.10)+((numberOfChecks-14)*0.08);
    
        // from cheks 15 to 29 fee will be $0.08.
        else if (numberOfChecks >= 30 && numberOfChecks<= 49)
            
            /* upto first 14 checks fee will be $0.10 + from 15 to 29 (15 checks)fee will be $0.08.
            + from 29 to 49 the fee will be 0.06*/
            checkFee = (14*0.10)+(15*0.08)+((numberOfChecks-29)*0.06);
        
        // from cheks above 50 fee will be $0.04.
        else            //for this case (numberOfChecks >= 50)
            
            
         /* upto first 14 checks fee will be $0.10 + from 15 to 29 (15 checks)fee will be $0.08.
            + from 29 to 49 (20 checks) the fee will be 0.06 + above 49 the fee be 0.04*/   
        checkFee = (14*0.10)+(15*0.08)+(20*0.06)+((numberOfChecks-49)*0.04);
    
        // for adding the base fee of $15 as well. 
        totalFee = checkFee + baseFee;
       
        // finally the result is here that will display the total services fee. 
        JOptionPane.showMessageDialog(null, "Total bank service fee: $"+ totalFee);
        
        System.exit(0);
    }  
}
