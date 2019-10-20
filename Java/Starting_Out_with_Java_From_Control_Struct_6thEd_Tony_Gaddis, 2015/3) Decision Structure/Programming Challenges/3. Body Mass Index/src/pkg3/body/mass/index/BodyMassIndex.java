/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.body.mass.index;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight, height, BMI;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your weight :");
        weight = keyboard.nextDouble();
        
        System.out.print("Enter your height :");
        height = keyboard.nextDouble();
        
        BMI =  weight*703/(height*height);        
        
        
        if (BMI > 18.5 && BMI < 25)
           System.out.println("Your weight is Optimal");
        
        else if (BMI < 18.5)
           System.out.println("Your are under weight");
        
        else if (BMI > 25)
           System.out.println("Your are over wight");
        
        else 
            
            System.out.println("Plese enter right number");
        
       
            
        // TODO code application logic here
    }
    
}
