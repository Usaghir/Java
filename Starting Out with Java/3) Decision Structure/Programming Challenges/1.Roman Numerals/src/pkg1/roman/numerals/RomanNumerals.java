/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1.roman.numerals;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class RomanNumerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number;
        
       Scanner keyboard = new Scanner(System.in); 
       System.out.print("Enter a Number: ");
       number = keyboard.nextInt();
       
       if (number == 1)
           System.out.print("I");
       else if(number == 2) 
           System.out.print("II");
        else if(number == 3) 
           System.out.print("III");
        else if(number == 4) 
           System.out.print("IV");
        else if(number == 5) 
           System.out.print("V");
        else if(number == 6) 
           System.out.print("VI");
        else if(number == 7) 
           System.out.print("VII");
        else if(number == 8) 
           System.out.print("VIII");
        else if(number == 9) 
           System.out.print("IX");
        else if(number == 10) 
           System.out.print("X");
        else 
           System.out.print("Please enter valid number");
   
           
           
       
       
        
        
        
        
        
        // TODO code application logic here
    }
    
}
