/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg15.even.odd.counter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class EvenOddCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number, even=0, odd=0;
        boolean status;
         Random randomNumbers = new Random();
         
        for (int i=1; i<=100; i++)
        {
        number = randomNumbers.nextInt();
        if (isEven(number))
        even++;
        else
        odd++;
        }
        System.out.printf("Total even numbers genrated are %d and Odd numners are %d\n",even,odd);
    }
    public static boolean isEven(int number)
    {        
        return number%2 == 0;
    }
}

        
    

