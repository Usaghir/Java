/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg13.isprime.method;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class IsPrimeMethod 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int number;
        boolean status;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter the number ");
        number = keyboard.nextInt();
        
        
     
        status=isPrime(number);
        
        if (status && number!=1)
        System.out.print("This is Prime number");
        else
        System.out.print("This is not Prime number");
            
    }
    
    public static boolean isPrime(int number)
    {
        boolean status = true;
        for (int i=2; i<=number/2; i++)
        {
            if (number%i == 0)
            {
            status = false;
            break;
            }
        }
        return status;
    }
}
