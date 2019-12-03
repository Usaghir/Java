/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class salesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double stateSalesTax = 0.04,
               countrySalesTax = 0.02,
               amountOfPurchase,
               amountOfSale;
               Scanner keyboard = new Scanner(System.in);
               
        
                System.out.print("What is amount of purchase: ");
                amountOfPurchase= keyboard.nextDouble();
                
                
                amountOfSale = amountOfPurchase + countrySalesTax*amountOfPurchase + stateSalesTax*amountOfPurchase;
                System.out.print("Sales amount is : " + amountOfSale);
                        // TODO code application logic here
    }
    
}
