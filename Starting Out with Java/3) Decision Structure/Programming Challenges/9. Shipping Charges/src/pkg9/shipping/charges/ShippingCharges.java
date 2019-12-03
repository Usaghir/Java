/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.shipping.charges;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class ShippingCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight,ChargesUpTo500;
        String input;
        
        input = JOptionPane.showInputDialog("Please enter the wight:");
        weight = Double.parseDouble(input);
        
        if (weight>10)
        {
            ChargesUpTo500 = 3.80;
            
            
            JOptionPane.showMessageDialog(null,"the shipping charges upto 500 miles are:" + ChargesUpTo500);
        }
        else if (weight<=10 && weight>6)
        {
            ChargesUpTo500 = 3.70;
            
            
            JOptionPane.showMessageDialog(null,"the shipping charges upto 500 miles are:" + ChargesUpTo500);
            
        }
        else if (weight<=6 && weight>2)
        {
        ChargesUpTo500 = 2.20;
          
            
            JOptionPane.showMessageDialog(null,"the shipping charges upto 500 miles are:" + ChargesUpTo500);
        }
         else if (weight<=2)
        {
        ChargesUpTo500 = 1.10;
            
            
            JOptionPane.showMessageDialog(null,"the shipping charges upto 500 miles are:" + ChargesUpTo500);
        // TODO code application logic here
    }
    
    }
}
