
package pkg5.pkg8.coversion.program;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class CoversionProgram 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     
    int choise;    
    double disInMeters; 
    String input;     
        
        do
        {
        input = JOptionPane.showInputDialog("Enter the distance in metters and not nagatie number");
        disInMeters= Double.parseDouble(input); 
        }while(disInMeters < 0); 
        
    
    
        do
        {
        menu();    
        input = JOptionPane.showInputDialog("Please enter your Choise now ");
        choise= Integer.parseInt(input);

            switch (choise)
            {
                case 1:
                showKilometers(disInMeters);
                break;
                case 2:
                showInches(disInMeters);
                break;
                case 3:
                showFeets(disInMeters);
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Bye");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Invalid Chooise");;
            }
    }while(choise != 4);
        System.exit(0);
    }
    
     public static void showFeets(double disInMeters)
    {
     JOptionPane.showMessageDialog(null, "Distance in Feets is"+disInMeters*3.281);   
    }
      
    public static void showInches(double disInMeters)
    {
     JOptionPane.showMessageDialog(null, "Distance Inches is"+disInMeters*39.37);   
    }
      
    
    public static void showKilometers(double disInMeters)
    {
     JOptionPane.showMessageDialog(null, "Distance in kilometers is"+disInMeters*0.001);   
    }
            
    public static void menu()       
    { 
    JOptionPane.showMessageDialog(null, "1. Covert to Kilometers"
                                          + "\n2. Covert to inches"
                                           +"\n3. Covert to feet"
                                           +"\n4. Quit the Program");
    }
}
