/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg11.multiple.stock.sales;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class MultipleStockSales 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         
    int numOfStocks,numOfShares; 
    double purcPricePerShare,purchComPaid, salesPricePershare, salesComPaid, profitLoss, totProfitLoss=0;
    String input;
    
    
    input = JOptionPane.showInputDialog("Enter your no of stocks");
    numOfStocks = Integer.parseInt(input);
    
    for (int i=1; i<=numOfStocks; i++)
        {
        input = JOptionPane.showInputDialog("Enter your no of shares for Stock"+i);
        numOfShares = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter your purcahse price per share for Stock"+i);
        purcPricePerShare= Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter your purchase commission paid for Stock"+i);
        purchComPaid= Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter your sales price per share for Stock"+i);
        salesPricePershare= Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter your sales comission paid for Stock"+i);
        salesComPaid= Double.parseDouble(input);
        
        profitLoss = ProfitOrLoss(numOfShares,purcPricePerShare,purchComPaid, salesPricePershare, salesComPaid);
        totProfitLoss+=profitLoss;
        }
    if (totProfitLoss > 0)
    JOptionPane.showMessageDialog(null, " You have a total profit of "+totProfitLoss +"$");
    else if ((totProfitLoss < 0))
    JOptionPane.showMessageDialog(null, " You have ltotal loss of "+totProfitLoss +"$");
    else 
    JOptionPane.showMessageDialog(null, " You are have no total profit no total loss");
    System.exit(0);
    }
 
    public static double ProfitOrLoss(int numOfShares, double purcPricePerShare, double purchComPaid, double salesPricePershare, double salesComPaid)
    {
     
     return  ((numOfShares*salesPricePershare)-salesComPaid)-((numOfShares*purcPricePerShare)+purchComPaid);
    }
     
    
}
