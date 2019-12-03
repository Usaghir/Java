            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class SavingsAccountClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double annualIntRate, montintrate,startingbalance, amountdeposit, amountWithdraw, toDep=0,totWith=0, permonghttotal, totalinterest=0, totmonth=0; 
        double withdrawcount=0, depositcount=0, interetcount;
        
        int numOfMonths;
        String input;
        
        
        
        input=JOptionPane.showInputDialog("Plese enter the starting balance: ");
        startingbalance=Double.parseDouble(input);
        
        SavingsAccount account = new SavingsAccount(startingbalance);
        
        input=JOptionPane.showInputDialog("Plese enter the Annual interest rate ");
        annualIntRate=Double.parseDouble(input);
        
        montintrate=annualIntRate/12;
       
        input=JOptionPane.showInputDialog("Plese enter the no of months: ");
        numOfMonths=Integer.parseInt(input);
        
        for (int i=1; i<=numOfMonths; i++)
        {
        input=JOptionPane.showInputDialog("Plese enter the depist for month "+i);
        amountdeposit=Double.parseDouble(input);
        account.adddeposit(amountdeposit);
        toDep+=account.getdeposit();
        depositcount+=amountdeposit;
        
        
        input=JOptionPane.showInputDialog("Plese enter the wihdrawing for month "+i);
        amountWithdraw=Double.parseDouble(input);
        account.subwithdrawel(amountWithdraw);
        totWith+=account.getwithdrawel();
        withdrawcount+=amountWithdraw;
                
        account.setInteret(montintrate);
        totalinterest+=account.getinterest();
        }
        
        JOptionPane.showMessageDialog(null, "The ending balance is"+(totWith+totalinterest)+"\nThe total amount deposit is"+depositcount+
        "\nThe toal amount amount withdrawals is"+withdrawcount+"\nThe total interest earned"+((totWith+totalinterest)-(startingbalance+depositcount-withdrawcount)));
        System.exit(0);
    }
    
}
