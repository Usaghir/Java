/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.software.sales;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class SoftwareSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int packageCost = 99,noOfPackages; 
        Double discount, amountAfterDiscount;
        String input;
        
        input = JOptionPane.showInputDialog("please enter number of packages :");
        
        noOfPackages = Integer.parseInt(input);
        
        if (noOfPackages >= 10 && noOfPackages < 20)
        {
            discount=packageCost*0.2;
            amountAfterDiscount = packageCost-discount;
            JOptionPane.showMessageDialog(null,"your amount if discount is: "+ discount+ "and the total amount after discount is :"+amountAfterDiscount);
        }
        
        else if (noOfPackages >= 20 && noOfPackages < 50)
        {
            discount=packageCost*0.3;
            amountAfterDiscount = packageCost-discount;
            JOptionPane.showMessageDialog(null,"your amount if discount is: "+ discount+ "and the total amount after discount is :"+amountAfterDiscount);
        }
        else if (noOfPackages >= 50 && noOfPackages < 100)
        {
            discount=packageCost*0.4;
            amountAfterDiscount = packageCost-discount;
            JOptionPane.showMessageDialog(null,"your amount if discount is: "+ discount+ "and the total amount after discount is :"+amountAfterDiscount);
        }
        else if (noOfPackages >= 100)
        {
            discount=packageCost*0.5;
            amountAfterDiscount = packageCost-discount;
            JOptionPane.showMessageDialog(null,"your amount if discount is: "+ discount+ "and the total amount after discount is :"+amountAfterDiscount);
        }
                
        else 
            JOptionPane.showMessageDialog(null,"there is no doscunt");
        
        
        System.exit(0);
        // TODO code application logic here
    }
    
}
