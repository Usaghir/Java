/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.magic.dates;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class MagicDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year, month, day, monthDay;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter year :");
        year = keyboard.nextInt();
        
        System.out.println("Enter month :");
        month = keyboard.nextInt();
        
        System.out.println("Enter day: ");
        day = keyboard.nextInt();
        
        monthDay = month*day; 
        
       if (monthDay == year)
           System.out.println("date in Magic");
       else 
           System.out.println("date in not Magic");
           
           
        
        // TODO code application logic here
    }
    
}
