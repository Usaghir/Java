/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.sum.of.numbers;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number, sum=0;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter an integer value: "); 
        number = keyboard.nextInt();
        
        int i = 1;
        while (i <= number){
            sum+=i;
            i++;
        }
         System.out.print("The sume of the entered numbers is : "+ sum); 
        
        
        
        // TODO code application logic here
    }
    
}
