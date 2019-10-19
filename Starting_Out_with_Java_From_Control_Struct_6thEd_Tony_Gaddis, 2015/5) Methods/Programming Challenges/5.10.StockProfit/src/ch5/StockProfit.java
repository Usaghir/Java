/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class StockProfit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int numOfShares; 
    double purcPricePerShare,purchComPaid, salesPricePershare, salesComPaid, profiLoss;
    String input;
        
    input = JOptionPane.showInputDialog("Enter your no of shares");
    numOfShares = Integer.parseInt(input);
    
    input = JOptionPane.showInputDialog("Enter your purcahse price per share");
    purcPricePerShare= Double.parseDouble(input);
    
    input = JOptionPane.showInputDialog("Enter your purchase commission paid");
    purchComPaid= Double.parseDouble(input);
    
    input = JOptionPane.showInputDialog("Enter your sales price per share");
    salesPricePershare= Double.parseDouble(input);
    
    input = JOptionPane.showInputDialog("Enter your sales comission paid");
    salesComPaid= Double.parseDouble(input);
    
    profiLoss = ProfitOrLoss(numOfShares,purcPricePerShare,purchComPaid, salesPricePershare, salesComPaid);
    if (profiLoss > 0)
     JOptionPane.showMessageDialog(null, " You have a Profit of "+profiLoss +"$");
    else if ((profiLoss < 0))
    JOptionPane.showMessageDialog(null, " You have loss of "+profiLoss +"$");
    else 
    JOptionPane.showMessageDialog(null, " You are have not profit no loss");

    System.exit(0);
    }
 
 public static double ProfitOrLoss(int numOfShares, double purcPricePerShare, double purchComPaid, double salesPricePershare, double salesComPaid)
 {
     
     return  ((numOfShares*salesPricePershare)-salesComPaid)-((numOfShares*purcPricePerShare)+purchComPaid);
 }
}
