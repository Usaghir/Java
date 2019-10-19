/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.letter.counter;

import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class LetterCounter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String entString1, entString2;
        
          char repeat;
          int count=0;
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Enter String : ");
        entString1 = keyboard.nextLine(); 
        
        System.out.println("Enter Character: ");
        entString2 = keyboard.nextLine(); 
        repeat = entString2.charAt(0);
        
         int i=0;
         while (i < entString1.length())
         {
             
             if (entString1.charAt(i) == repeat)
             {
                 count+=1;
             }
             
          i++;       
         }
        System.out.println("Then number of time character "+repeat+ " is: "+count);
    }
}