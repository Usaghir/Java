/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

/**
 *
 * @author umerraja
 */
public class DepWith {
    
     private double startingBalance;
    
    
    public DepWith(double startBalance)
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

    

