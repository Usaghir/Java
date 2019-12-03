/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantbill;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author umerraja
 */
public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double charge, taxPer = .0676,  taxAmount, bilTax, tipPer = 0.2, tipAmount, totalBill;
               
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Please enter charges for meal :");
        charge = keyboard.nextDouble();
        taxAmount = taxPer*charge;
        bilTax = charge+taxAmount;
        tipAmount = tipPer * bilTax;
        totalBill = bilTax +  tipAmount;
        JOptionPane.showMessageDialog(null, "Meal charges are:" + charge + "\n" + "Tax amount is:" + taxAmount + "\n" + "Tip amount is: " + tipAmount+ "\n" + "Total Bill is :" + totalBill);
        // TODO code application logic here
    }
    
}
