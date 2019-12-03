/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktransactionprogram;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class StockTransactionProgram {
    
        public static void main(String[] args) {
    
    
    int numOfSharesPur = 1000, numOfSharesSold = 1000;  
    double sharePurchaseAmount = 32.87, totalPurAmount, totalPurAmountCom, shareSalesAmount = 33.92, toalSalesAmount,
            toalSaleAmountCom, comAmountPurcahse, comAmountSale, profit ;
    final double Com = 0.02; 
           
            totalPurAmount = numOfSharesPur * sharePurchaseAmount;
            comAmountPurcahse = Com*totalPurAmount;
            totalPurAmountCom = totalPurAmount + comAmountPurcahse;
            
            toalSalesAmount = numOfSharesSold * shareSalesAmount;
            comAmountSale = Com*toalSalesAmount;
            toalSaleAmountCom = toalSalesAmount - comAmountSale; 
            
            profit = toalSaleAmountCom - totalPurAmountCom;
            
           
             
            
       
        

JOptionPane.showMessageDialog (null, "The amount of money paid for the Stock : " + totalPurAmount +
                                     "\nThe amount of commission Joe paid for the broker on purcahse" + comAmountPurcahse+
                                     "\nThe amount joe sold the stock for" + toalSalesAmount+ "\nThe amount of commission Joe paid for the Bboker on sale" + Com*toalSalesAmount+
                                     "\nThe Profit/Loss : " + profit);
        
        
        
        // TODO code application logic here"
        System.exit(0);

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
    }
    
}
