/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class Population 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        int startnumArg,numOfDays;
        double dailyPopInc,sizeOfPop;
        
        Scanner keyboard = new Scanner(System.in);
            
        
         do
        {
        System.out.println("Plese enter the starting size of the population not less than 2");
        startnumArg = keyboard.nextInt();
        }
        while (startnumArg < 2);
        
         do
        {
        System.out.println("Plese enter the average daily population increas not negative number");
        dailyPopInc = keyboard.nextInt();
        }
        while (dailyPopInc < 0);
        
         do
        {
        System.out.println("Plese enter the the number of days they will multiply not less than 1");
        numOfDays = keyboard.nextInt();
        }
        while (dailyPopInc < 1);
         
        System.out.println("The population Table");
        System.out.println("----------------------------------");
        
        for (int i=1; i < numOfDays; i++)
        {
      
         
         
         System.out.println("The population for the day "+i+" is "+startnumArg);
         startnumArg += (startnumArg*(dailyPopInc/100));
        }    
    }
    
}
