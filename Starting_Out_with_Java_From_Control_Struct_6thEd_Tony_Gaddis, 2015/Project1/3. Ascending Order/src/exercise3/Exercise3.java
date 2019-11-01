package exercise3;
import javax.swing.JOptionPane; // for using the dialog boxes. 

/**
 *
 * @author Raja Umer Saghir 
 */
public class Exercise3 // for declaration of class. 
{
    
    public static void main(String[] args) // for main method. 
    {
        
        String city1, city2, city3; // for city names.
        
        // for first city name input. 
        city1 = JOptionPane.showInputDialog("Plase enter the first city name: ");
        
        // for 2nd city name input.
        city2 = JOptionPane.showInputDialog("Please enter the 2nd city name: ");
        
        // for 3rd city name input.
        city3 = JOptionPane.showInputDialog("Please enter the 3rd city name: ");
        
        /* nested if statements in which there are 6 combination are possible for the city name order 
        city3 city2 city1
        city2 city3 city1
        city2 city1 city3,
        city1 city2 city3
        city3 city1 city2,
        city1 city3 city2 
        
        which are used to for this nested if else and also used if -else- if. 
        */ 
        
        if (city1.compareToIgnoreCase(city2) > 0)
        {
            if (city1.compareToIgnoreCase(city3) > 0)
            {
                if (city2.compareToIgnoreCase(city3) > 0)
                
                    JOptionPane.showMessageDialog(null, city3+"\n"+city2+"\n"+city1);
                else 
                    JOptionPane.showMessageDialog(null, city2+"\n"+city3+"\n"+city1);
                
            }        
            else 
                JOptionPane.showMessageDialog(null, city2+"\n"+city1+"\n"+city3);
        }
        else
        {
            if (city3.compareToIgnoreCase(city2) > 0)
            
            JOptionPane.showMessageDialog(null,city1+"\n"+city2+"\n"+city3);
            else if (city1.compareToIgnoreCase(city3) > 0)
                    
            JOptionPane.showMessageDialog(null,city3+"\n"+city1+"\n"+city2);
            else  
            JOptionPane.showMessageDialog(null,city1+"\n"+city3+"\n"+city2);
       
        }
        System.exit(0);
        
    }
    
}
