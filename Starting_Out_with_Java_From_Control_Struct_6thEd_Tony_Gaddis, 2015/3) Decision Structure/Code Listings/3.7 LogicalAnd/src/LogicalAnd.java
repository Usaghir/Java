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
public class LogicalAnd {
    
    public static void main (String [] args) {
        double salary;
        double yearsJob;
        String input;
        
        input = JOptionPane.showInputDialog("Enter your annual income: ");
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your years at job ");
        yearsJob = Double.parseDouble(input);
        
        if (salary>=30000 && yearsJob>2)
            JOptionPane.showMessageDialog(null,"You are eigable for loan");
        else 
        
            JOptionPane.showMessageDialog(null, "You are not eigable for loan");
            
        
        System.exit(0);
    }
}
