/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class PenniesForPay 
{
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int numberOfDays;
        double salaryPerDay,totalSalary=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter the number of days worked: "); 
        numberOfDays = keyboard.nextInt();
        
        while ( numberOfDays < 1)
        {
            System.out.print("Please enter the valid number of days worked: ");
            numberOfDays = keyboard.nextInt();
        }
        
        System.out.print("Please enter the salary in pennies: "); 
        salaryPerDay = keyboard.nextDouble();

        System.out.println("Days\t\t Amount earned ");
        System.out.println("------------------------------------");
         int i = 1; 
            while (i <= numberOfDays)
            {
            salaryPerDay*=2;
            
            totalSalary+=salaryPerDay;
            System.out.println(i+"\t\t\t$"+(salaryPerDay/100));
            i++;
            }
            System.out.println("------------------------------------");
            System.out.println("total Salary \t\t\t$"+(totalSalary/100));
            
            
            
        
        // TODO code application logic here
    }
    
}
