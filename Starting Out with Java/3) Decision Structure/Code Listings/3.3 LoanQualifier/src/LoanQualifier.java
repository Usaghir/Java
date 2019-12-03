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
public class LoanQualifier {
    
    public static void main(String [] args){
        double salary, yearsOnJob;
        String  input;
        
        input = JOptionPane.showInputDialog("Enter your annual salary:");
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter number of years in current job");
        yearsOnJob = Double.parseDouble(input);
        
        
        
        if (salary >= 30000)
        {
            if (yearsOnJob >= 2)
            JOptionPane.showMessageDialog(null, "you qualify for the loan");
            else 
            JOptionPane.showMessageDialog(null, "you don't qualify for the loan as you must have two years in your job");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "you don't qualify for the loan as you must have annual income more than $30000");
        }
        System.exit(0);
    }
    }

