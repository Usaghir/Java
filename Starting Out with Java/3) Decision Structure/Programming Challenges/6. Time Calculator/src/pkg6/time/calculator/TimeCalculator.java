/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.time.calculator;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int seconds, minutes, days, hours;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter the number of seconds");
        seconds = keyboard.nextInt();
        
        minutes = seconds/60;
        
        hours = seconds/3600;
        
        days = seconds/86400;
        
        if (seconds >=86400)
        
        System.out.println("number of days are" + days);
        
        else if (seconds >=3600)
        
        System.out.println("number of hours are" + hours);
        
        else if (seconds >=60)
        
        System.out.println("number of minutes are" + minutes);
        
        else 
            
        System.out.println("Plese enter number greater than 59");
            
       
        
        
        // TODO code application logic here
    }
    
}
