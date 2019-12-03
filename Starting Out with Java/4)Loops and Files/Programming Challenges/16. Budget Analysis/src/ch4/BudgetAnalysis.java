/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class BudgetAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double budget, expense=0, totalexp=0, finish=0; 
        String input; 
        
         input = JOptionPane.showInputDialog("Enter the budget you have: ");
         budget= Double.parseDouble(input);
         
        while (expense != -1)
        {
        input = JOptionPane.showInputDialog("Enter your expense or -1 to finish");
         expense= Double.parseDouble(input);
         totalexp+=expense;
         expense=(int)expense;
        }
        totalexp++;
        if (totalexp > budget)
        JOptionPane.showMessageDialog(null, " You are "+(totalexp-budget) +" under");
        else if  (totalexp < budget)
            JOptionPane.showMessageDialog(null, " You are "+(budget-totalexp) +" over");
        else 
            JOptionPane.showMessageDialog(null, " You are nether under nor over");
            
        System.exit(0);
        // TODO code application logic here
    }
    
}
