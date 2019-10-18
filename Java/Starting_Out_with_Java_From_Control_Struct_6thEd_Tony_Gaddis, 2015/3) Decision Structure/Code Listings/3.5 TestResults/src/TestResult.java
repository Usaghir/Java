/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
import javax.swing.JOptionPane;
public class TestResult 
{
    
    public static void main(String [] args)
    {
        int testScore;
        String  input;
        
        input = JOptionPane.showInputDialog("Enter the score and I will tell you the grade: ");
        testScore = Integer.parseInt(input);
        
        if (testScore < 60)
                    JOptionPane.showMessageDialog(null, "Your grade is F. ");
        else if (testScore < 70)
                    JOptionPane.showMessageDialog(null, "Your grade is D. ");          
        else if (testScore < 80)
                    JOptionPane.showMessageDialog(null, "Your grade is C. ");      
        else if (testScore < 90)               
                    JOptionPane.showMessageDialog(null, "Your grade is B. "); 
        else
                    JOptionPane.showMessageDialog(null, "Your grade is A. ");     
        System.exit(0);
    }
}
    

