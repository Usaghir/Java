/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
import java.util.Scanner;
public class Division {
    
    public static void main(String [] args){
        double number1, number2, quotient;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number1= keyboard.nextDouble();
        
        System.out.print("Enter another number: ");
        number2= keyboard.nextDouble();
        
        if (number2 == 0)
        {
            System.out.println("Division by zero is not possible");
            System.out.println("Please run the programe again");
            System.out.println("Please enter the number other than zero");
        }
            
        else 
        {
            quotient = number1/number2;
            System.out.print("Quotient of "+ number1);
            System.out.print(" devided by "+ number2);
            System.out.println(" is "+ quotient );
            
            
        }
            
        
            
    }
    
}
