/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg9.total.sales;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class TotalSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales=0.0;
        String input; 
        
        input=JOptionPane.showInputDialog("For how many days you want the sales figure for: ");
            days = Integer.parseInt(input);
          
            for (int i=1; i<=days; i++)
            {
                input=JOptionPane.showInputDialog("Enter the sales for the day"+i+":");
                sales=Integer.parseInt(input);
                totalSales+=sales;
            }
            JOptionPane.showMessageDialog(null, String.format("Total Sales: $%,.2f",totalSales));  
            System.exit(0);
        // TODO code application logic here
    }
     
}
