/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chd6;


public class SavingsAccount {
    
    private double startingBalance;
    
    
    public SavingsAccount(double startBalance)
    {
    startingBalance=startBalance;
    }
    
   public void adddeposit(double deposit)
    {   
        startingBalance+=deposit;
    }
   
    public double getdeposit()
    {   
        return startingBalance;
    }
   
    public void subwithdrawel(double withdrawel)
    {
         startingBalance-=withdrawel;
    }
    
     public double getwithdrawel()
    {
         return startingBalance;
    }
    public void setInteret(double montintratee)
    {
         startingBalance*=montintratee;
    }
    
     public double getinterest()
    {
         return startingBalance;
    }
    
    
}
