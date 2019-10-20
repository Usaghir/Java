/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg16.present.value;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class PresentValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int noOfYears;
        double futurevalue,annualInterestRate;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the future value you want to have");
        futurevalue = keyboard.nextDouble();
        
        System.out.println("Please enter the annual interest rate");
        annualInterestRate = keyboard.nextDouble();
        
        System.out.println("Please enter the number of years user want keep the amount ");
        noOfYears = keyboard.nextInt();
        
        
        
         
        System.out.printf("Present value is %f ",presentValue(futurevalue,annualInterestRate,noOfYears));
    }
 
    public static double presentValue(double futureValue, double annualInterestRate, int noOfYears)
    {
    return futureValue/(Math.pow((1+annualInterestRate),(double)noOfYears));
    }
}
