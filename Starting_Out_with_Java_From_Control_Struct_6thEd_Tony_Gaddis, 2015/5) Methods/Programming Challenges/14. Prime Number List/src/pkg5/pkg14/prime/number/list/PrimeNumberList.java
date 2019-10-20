/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg14.prime.number.list;
import java.io.*;

/**
 *
 * @author umerraja
 */
public class PrimeNumberList {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main(String[] args) throws IOException 
    {
        
        PrintWriter outputFile = new PrintWriter("fileName.txt");
        
     for (int i=1; i<=100; i++) 
     {
         
        if (isPrime(i))
        {
            outputFile.println(i);
        }
     }
      outputFile.close();     
    }
    
    public static boolean isPrime(int number) 
     {
        
        for (int i=2; i<=number/2; i++)
        {
            if (number%i == 0)
            {
            return false;
            }
        }
        
        return true;
    }
}
