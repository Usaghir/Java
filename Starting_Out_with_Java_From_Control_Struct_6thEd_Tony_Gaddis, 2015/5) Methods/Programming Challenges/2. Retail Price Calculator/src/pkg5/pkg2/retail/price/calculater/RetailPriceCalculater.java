/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg2.retail.price.calculater;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class RetailPriceCalculater 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        double wholeSaleCost, markupPercentage, retail;
        String input; 
        
        input = JOptionPane.showInputDialog("Enter the Whole sale cost ");
        wholeSaleCost= Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the percentage ");
        markupPercentage= Double.parseDouble(input);
        
    
    retail = calculateRetail(wholeSaleCost,markupPercentage);
    JOptionPane.showMessageDialog(null, " The retail Price is "+retail);

    System.exit(0);
    }
    
    public static double calculateRetail(double wholeSale, double markupPer)
    {
        double markup;
        markup = wholeSale*(markupPer/100.0);
        return markup+wholeSale;
    }
        
        
        
        // TODO code application logic here
}
    

