/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitboardprofit;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class CircuitBoardProfit {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double profitRatio = 0.4, retailPrice, profit;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is Retail Price");
        retailPrice = keyboard.nextDouble();
        
        
       profit= retailPrice*profitRatio;
        
        JOptionPane.showMessageDialog(null, " Profit is "+ profit );
        
        System.exit(0);
      
        // TODO code application logic here
    }
    
}
