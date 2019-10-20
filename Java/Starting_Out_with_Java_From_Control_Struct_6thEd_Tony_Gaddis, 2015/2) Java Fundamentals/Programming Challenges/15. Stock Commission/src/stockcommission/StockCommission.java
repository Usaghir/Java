/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcommission;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class StockCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numOfShares = 600;
        
        double ShareUnitPrice = 21.77, stockPriceTot, commAmount, stockPriceCom;
        final double CommPer = 0.02;
        
        stockPriceTot = ShareUnitPrice*(double)numOfShares;
        
        commAmount = CommPer*stockPriceTot;
        
        stockPriceCom = stockPriceTot+commAmount;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        JOptionPane.showMessageDialog(null, "The amount paid for the stock alone (without commission): " + stockPriceTot +"\n"
                                           + "The amount of Comission : " + commAmount + "\n" 
                                           + "Total amount paid for (for the stock plus the commission): " + stockPriceCom );
        // TODO code application logic here
    }
    
} 
