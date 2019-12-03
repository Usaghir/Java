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
public class LargestAndSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numbers, bigNum=0, smallNum=0;
        
        
        Scanner keyboard = new Scanner(System.in);
        
          
        
        System.out.print("Plese enter number: ");
        numbers = keyboard.nextInt();
        
        
        while (numbers != -99)
        {
            if (numbers < smallNum)
            {
            smallNum=numbers;
            }
          
            if (numbers > bigNum)
            {
            bigNum=numbers;
            }
        System.out.print("Plese enter number: or 99 to finish ");
        numbers = keyboard.nextInt();   
        }
        
          
          
          System.out.println("big number is "+bigNum);
          System.out.println("small number is "+smallNum);
        // TODO code application logic here
    }
    
}
