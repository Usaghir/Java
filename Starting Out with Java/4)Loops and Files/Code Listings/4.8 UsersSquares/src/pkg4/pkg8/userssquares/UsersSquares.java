/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg8.userssquares;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class UsersSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int maxNumb;
        
        Scanner Keyboard= new Scanner(System.in);
        System.out.println("Please provdie the maximum number you want to square:");
        maxNumb = Keyboard.nextInt();
        
        System.out.println("The number \t\t number Squared");
        System.out.println("----------------------------------------");
        
        for (number=1; number<=maxNumb; number++)
        {System.out.println(number+"\t\t"+(number*number));   
        // TODO code application logic here
    }
    
}
}