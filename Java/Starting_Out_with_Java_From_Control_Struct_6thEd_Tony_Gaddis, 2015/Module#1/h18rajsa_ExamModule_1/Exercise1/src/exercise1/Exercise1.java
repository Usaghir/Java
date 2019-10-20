
package exercise1;
import javax.swing.JOptionPane; // required to work with dialog box 

/**
 *
 * @author Raja Umer Saghir
 */
public class Exercise1 // for class declaration.  
{

    
    public static void main(String[] args) // for main nethod declaration. 
    {
        
        double userWeight_kg,                   //for user to enter the weight in kgs. 
               userHeight_cm,                   // for user to enter the height in cm. 
               BMI,                             // for BMI index
                
               userHeight_meters;               // for user height in meters required for the correct BMI index. 
                
        String input,                           //for String to convert in numbers of the           
               output,                          // for using in String.format method. 
               underWeight = "underweight",     // for using in the output as String even possible without these as well.  
               normalWeight = "normal weight",  // for using in the output as String.
               overWeight = "overweight",       // for using in the output as String.
               obesity = "has obesity";         // for using in the output as String.
        
        // for Message dialoge to get input of weight in kg from user
        input = JOptionPane.showInputDialog("Please write the person's weight in kg: ");
        userWeight_kg = Double.parseDouble(input);
        
        // for Message dialoge to get input of height in cm from user
        input = JOptionPane.showInputDialog("Plese write the person's height in cm: ");
        userHeight_cm = Double.parseDouble(input);
        
        /* for getting the correct BMI index the height shoul be in meters even it didn't mentioned in the farmula that if the 
        height should be in metters or cms. */
        
        userHeight_meters = userHeight_cm/100;   // widening covertion by java automatically from integer 100 to double. 
        
        // for Body mass index calculation 
        BMI = userWeight_kg/(Math.pow(userHeight_meters, 2.0));
        
        
        if (BMI < 18.5) // BMI calculation in case of underweight. 
        {
            output = String.format("Person's BMI is: %.2f and person is %s", BMI, underWeight);
            JOptionPane.showMessageDialog(null, output);
        }
        else if (BMI >= 18.5 && BMI <= 24.99)   //BMI calculation in case of normal weight.
        {  
            output = String.format("Person's BMI is: %.2f and person is %s", BMI, normalWeight);
            JOptionPane.showMessageDialog(null, output);
        }
        else if (BMI >= 25.0 && BMI <= 29.99)   //BMI calculation in case of normal overweight.
        {    
            output = String.format("Person's BMI is: %.2f and person is %s", BMI, overWeight);
            JOptionPane.showMessageDialog(null, output);
        }
        else //BMI calculation in case of obesity if no of the above are ture.
        {
            output = String.format("Person's BMI is: %.2f and person %s", BMI, obesity);
            JOptionPane.showMessageDialog(null, output);
        }
            // required to exit the execution at the end of programe. 
            System.exit(0);
        

    }
    
}
