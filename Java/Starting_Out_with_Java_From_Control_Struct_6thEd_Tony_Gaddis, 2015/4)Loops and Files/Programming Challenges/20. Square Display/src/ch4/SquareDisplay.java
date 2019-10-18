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
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
         System.out.print("Enter the sqare size you want: ");
         number = keyboard.nextInt();
        }
        while (number < 1 || number > 15);
         
         for (int j=0; j<number; j++)
         {
            for (int i=0; i<number; i++)
            {
             System.out.print("X");
            }
         System.out.print("\n");
         }
        // TODO code application logic here
    }
    
}
